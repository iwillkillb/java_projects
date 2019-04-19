import java.net.*;
	public class spamcheck {
		public static final String BLACKHOLE = "sbl.spamhaus.org";
		public static void main(String[] args) throws UnknownHostException {
			args[0] = "95.163.144.203";
			for (String arg: args) {
				if (isSpammer(arg)) {
					System.out.println(arg + " is a known spammer.");
				} else {
					System.out.println(arg + " appears legitimate.");
				}
			}
		}
	private static boolean isSpammer(String arg) {
		try {
			InetAddress address = InetAddress.getByName(arg);
			byte[] quad = address.getAddress();
			String query = BLACKHOLE;
			for (byte octet : quad) {
				System.out.println(octet);
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