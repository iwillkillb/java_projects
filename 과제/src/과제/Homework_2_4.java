package ����;
import java.util.Scanner;
public class Homework_2_4 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		int in, count = 0;
		
		do{
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		in = Input.nextInt();
		}while(!(0<in && in<100));
		
		if(in>9 && (in/10)%3==0)count++;
		if((in-(in/10)*10)%3==0)count++;
		
		if(count==2)System.out.println("�ڼ�¦¦");
		else if(count==1)System.out.println("�ڼ�¦");
		else System.out.println("���");
	}
}
