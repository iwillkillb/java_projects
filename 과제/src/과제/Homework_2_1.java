package 과제;
import java.io.*;
public class Homework_2_1 {

	public static void main(String[] args) throws IOException {
		System.out.print("영문자를 입력하세요 : ");
		InputStreamReader input = new InputStreamReader(System.in);
		int in = input.read();
		if(in>=97 && in<=122)System.out.println((char)(in-32));
		else if(in>=65 && in<=90)System.out.println((char)(in+32));
		else System.out.println("영문자가 아닙니다.");
	}

}
