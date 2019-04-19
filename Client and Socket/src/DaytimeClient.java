import java.net.*;
import java.io.*;
public class DaytimeClient {
	public static void main(String[] args) {
		//String hostname = args.length > 0 ? args[0] : "time-c.nist.gov";
		//http://www.cafeaulait.org/books/jnp4/postquery.phtml
		String hostname = args.length > 0 ? args[0] : "www.cafeaulait.org/books/jnp4/postquery.phtml";
		Socket socket = null;
		try {
			//socket = new Socket(hostname, 13);	//13 : daytime protocol
			socket = new Socket("www.cafeaulait.org/books/jnp4/postquery.phtml", 1100);
			socket.setSoTimeout(15000);	//������ Ÿ�� �Ѱ�
			InputStream in = socket.getInputStream();
			StringBuilder time = new StringBuilder();
			InputStreamReader reader = new InputStreamReader(in, "ASCII");
			for (int c = reader.read(); c != -1; c = reader.read()) {
				time.append((char) c);
			}
			System.out.println(time);
		} catch (IOException ex) {
			System.err.println(ex);
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException ex) {
					// ignore
				}
			}
		}
	}
	//		58088 17-12-01 05:45:47 00 0 0 168.9 UTC(NIST) *
	//��� :	JJJJJ-YY-MM-DD TT:MM:SS TT L H msADV UTC(NIST) OTM
	//JJJJJ : Modified Julian Date, 1858.11.17 ���������� day ��
	//YY-MM-DD : ��¥, TT:MM:SS : �ð�
	//TT : ǥ�� �ð�(00) �Ǵ� ���� Ÿ�� : �� �ð� ����(55)
	//L : �㿡 1�� ����, H : ���� ����
	//msADV : �� ��ǻ�� ���̿� ���� �ð�
}
