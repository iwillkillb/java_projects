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
		//�����ͽ�Ʈ���� �ٸ� ����Ʈ��Ʈ���� ���ؼ� �аų� ����.
		
		try {	//���� ����
			fileOut = new FileOutputStream("data.bin");
			dataOut = new DataOutputStream(fileOut);
			
			dataOut.writeInt(1);		//4 byte
			dataOut.writeDouble(1.0);	//8 byte
			dataOut.writeUTF("one�ϳ�");	//11 byte
			dataOut.writeInt(2);		//4 byte
			dataOut.writeDouble(2.0);	//8 byte
			dataOut.writeUTF("two��");	//8 byte
			
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
		
		try {	//���� �б�
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

