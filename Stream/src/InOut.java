import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class InOut {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileOutputStream fileOut = null;
		DataOutputStream dataOut = null;
		FileInputStream fileIn = null;
		DataInputStream dataIn = null;
		//데이터스트림은 다른 바이트스트림을 통해서 읽거나 쓴다.
		
		try {	//파일 쓰기
			fileOut = new FileOutputStream("data.bin");
			dataOut = new DataOutputStream(fileOut);
			
			dataOut.writeInt(1);		//4 byte
			dataOut.writeDouble(1.0);	//8 byte
			dataOut.writeUTF("one하나");	//11 byte
			dataOut.writeInt(2);		//4 byte
			dataOut.writeDouble(2.0);	//8 byte
			dataOut.writeUTF("two둘");	//8 byte
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				fileOut.close();
			} catch (IOException e) {
				
			}
			try {
				dataOut.close();
			} catch (IOException e) {
				
			}
		}
		
		try {	//파일 읽기
			fileIn = new FileInputStream("data.bin");
			dataIn = new DataInputStream(fileIn);
			
			int i = dataIn.readInt();
			double d = dataIn.readDouble();
			String s = dataIn.readUTF();
			
			System.out.println("int : " + i);
			System.out.println("double : " + d);
			System.out.println("string : " + s);
			
			i = dataIn.readInt();
			d = dataIn.readDouble();
			s = dataIn.readUTF();
			
			System.out.println("int : " + i);
			System.out.println("double : " + d);
			System.out.println("string : " + s);
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				fileOut.close();
			} catch (IOException e) {
				
			}
			try {
				dataOut.close();
			} catch (IOException e) {
				
			}
		}
		// TODO Auto-generated method stub
	}
}

