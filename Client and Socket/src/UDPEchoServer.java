import java.io.*;
import java.net.*;

public class UDPEchoServer extends UDPServer {
	public final static int DEFAULT_PORT = 11;

	public UDPEchoServer() {
		super(DEFAULT_PORT);
	}

	public void respond(DatagramSocket socket, DatagramPacket packet) throws IOException {
		DatagramPacket outgoing = new DatagramPacket(packet.getData(), packet.getLength(), packet.getAddress(),
				packet.getPort());
		socket.send(outgoing);
	}

	public static void main(String[] args) {
		UDPServer server = new UDPEchoServer();
		Thread t = new Thread(server);
		t.start();
	}
}