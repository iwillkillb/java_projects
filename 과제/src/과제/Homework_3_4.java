package ����;
import java.util.Scanner;
public class Homework_3_4 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		System.out.print("�� ���� �Է����ּ��� : ");
		int in1 = Input.nextInt();
		int in2 = Input.nextInt();
		int result = 0;
		//max : a>b ? a : b
		for(int a=1 ; a<(in1>in2 ? in1 : in2) ; a++)
			if(in1%a==0 && in2%a==0)result = a;
		System.out.println("�ִ����� : "+result);
	}
}
