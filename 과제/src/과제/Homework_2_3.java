package ����;
import java.util.Scanner;
public class Homework_2_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("�׼��� �Է��ϼ��� : ");
		int money = input.nextInt();
		
		int cpr = 0, sub_count = 0;
		for(int a=9 ; a>=0 ; a--){
			cpr = (int)Math.pow(10,a/2);
			if(a%2==1)cpr*=5;
			
			if(money < cpr)continue;
			while(money >= cpr){
				money -= cpr;
				sub_count++;
			}
			System.out.println(cpr+"�� "+sub_count+"��");
			sub_count = 0;
		}
	}

}
