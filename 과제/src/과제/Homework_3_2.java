package 과제;
import java.io.*;
public class Homework_3_2 {

	public static void main(String[] args) throws IOException {
		InputStreamReader Input = new InputStreamReader(System.in);
		
		System.out.print("알파벳 한 문자를 입력하시오>>");
		int input = Input.read();

		for(int a=96 ; a<input ; a++){
			for(int b=0 ; b<input-a ; b++)
				System.out.print((char)(b+97));
			System.out.println();
		}
	}

}
