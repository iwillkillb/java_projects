package ����;
import java.util.Scanner;
public class Homework_2_6 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int input = Input.nextInt();
		
		if(input%400==0)System.out.println("����");
		else if(input%4==0 && input%100!=0)
			System.out.println("����");
		else System.out.println("���");
	}

}
