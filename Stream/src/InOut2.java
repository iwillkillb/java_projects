import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class InOut2 {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileOutputStream fileOut = null;
		DataOutputStream dataOut = null;
		FileInputStream fileIn = null;
		DataInputStream dataIn = null;
		//데이터스트림은 다른 바이트스트림을 통해서 읽거나 쓴다.
		
		try {	//파일 쓰기
			fileOut = new FileOutputStream("data.txt");
			dataOut = new DataOutputStream(fileOut);
			
			dataOut.writeUTF("한밭대학교test");
			
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
			fileIn = new FileInputStream("data.txt");
			dataIn = new DataInputStream(fileIn);
			
			String str = dataIn.readUTF();
			System.out.println("읽은 내용 : " + str);
			
			//To byte, "utf-8", "ms949", "ascii" 중 하나를 쓴다.
			byte[] buf = str.getBytes("utf-8");	//String -> byte[]
			String s2 = new String(buf, "utf-8");	//byte[] -> String
			System.out.println("바이트 배열 문자열 변환 값 : " + s2);
			
			//To Hex
			StringBuilder sb = new StringBuilder();
			for(final byte b:buf){
				sb.append(String.format("%02x ", b));
			}
			System.out.println(sb.toString());
			
			//data.Hex.txt에 다시 쓰기
			fileOut = new FileOutputStream("dataHex.txt");
			dataOut = new DataOutputStream(fileOut);
			dataOut.writeBytes(sb.toString());
			
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				fileIn.close();
				fileOut.close();
			} catch (IOException e) {
				
			}
			try {
				dataIn.close();
				dataOut.close();
			} catch (IOException e) {
				
			}
		}
		// TODO Auto-generated method stub
	}
}

