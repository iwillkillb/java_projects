package ����;
import java.util.Scanner;
public class Homework_2_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] in = new int[3];
		
		System.out.print("�ﰢ���� �� ���� ���̸� �Է��ϼ��� : ");
		for(int a=0 ; a<in.length ; a++)
			in[a] = input.nextInt();
		
		for(int a=0 ; a<in.length ; a++){
			if(in[a] >= in[(a+1)%3] + in[(a+2)%3]){
				System.out.println("�ﰢ���� �׸� �� �����ϴ�.");
				break;}
			else if(a==2){
				System.out.println("�ﰢ���� �׸� �� �ֽ��ϴ�.");
				break;}
		}
	}

}
