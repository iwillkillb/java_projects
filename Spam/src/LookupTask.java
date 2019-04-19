import java.net.*;
import java.util.concurrent.Callable;
import java.io.FileWriter;
import java.io.IOException;

public class LookupTask implements Callable<String> {
	private String line;
	public LookupTask(String line) {
		this.line = line;
	}
	@Override
	public String call() throws IOException {
		try {
			FileWriter outDomain = new FileWriter("C:/Users/JHC/Desktop/weblogresult.txt", true);
			FileWriter outSpam = new FileWriter("C:/Users/JHC/Desktop/weblogspam.txt", true);
			// separate out the IP address
			int index = line.indexOf(' ');
			String address = line.substring(0, index);
			String theRest = line.substring(index);
			String hostname = InetAddress.getByName(address).getHostName();
			
			index = line.indexOf("\"");
			theRest = theRest.substring(index);
			
			if(isSpammer(address)){	//If this address spam, save log.
				outSpam.write(hostname + " " + theRest + "\r\n");
			}
			outDomain.write(hostname + " " + theRest + "\r\n");
			
			outDomain.close();
			outSpam.close();
			
			return hostname + " " + theRest;
		} catch (Exception ex) {
			return line;
		}
	}

	public static final String BLACKHOLE = "sbl.spamhaus.org";
	private static boolean isSpammer(String arg) {
		try {
			InetAddress address = InetAddress.getByName(arg);
			byte[] quad = address.getAddress();
			String query = BLACKHOLE;
			for (byte octet : quad) {
				//System.out.println(octet);
				int unsignedByte = octet < 0 ? octet + 256 : octet;
				query = unsignedByte + "." + query;
			}
			InetAddress.getByName(query);
			return true;
			
			} catch (UnknownHostException e) {
			return false;
		}
	}
}