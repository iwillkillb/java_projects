import java.net.*;
import java.io.*;
import java.util.Date;

public class DaytimeServer {
	public final static int PORT = 1100; // 1024 이상이 좋음
	/*
	 * java.net.BindException: Address already in use: JVM_Bind
	 * 이라는 오류가 뜰 경우... 해당 포트가 사용중이란 뜻이다.
	 * cmd -> netstat -a -n -o -> 해당 포트의 pid를 찾는다. -> taskkill /f /pid 프로세스아이디
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