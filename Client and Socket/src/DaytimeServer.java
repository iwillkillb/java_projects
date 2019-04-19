import java.net.*;
import java.io.*;
import java.util.Date;

public class DaytimeServer {
	public final static int PORT = 1100; // 1024 �̻��� ����
	/*
	 * java.net.BindException: Address already in use: JVM_Bind
	 * �̶�� ������ �� ���... �ش� ��Ʈ�� ������̶� ���̴�.
	 * cmd -> netstat -a -n -o -> �ش� ��Ʈ�� pid�� ã�´�. -> taskkill /f /pid ���μ������̵�
	 */

	public static void main(String[] args) {
		try (ServerSocket server = new ServerSocket(PORT)) {
			while (true) {
				try (Socket connection = server.accept()) {
					Writer out = new OutputStreamWriter(connection.getOutputStream());
					Date now = new Date();
					out.write(now.toString() + "\r\n");
					out.flush();
					
					connection.close();
				} catch (IOException ex) {
				}
			}
		} catch (IOException ex) {
			System.err.println(ex);
		}
	}
}