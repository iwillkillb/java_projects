package ����;
import java.util.Scanner;
public class Homework_2_8 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		boolean meet = false;
		System.out.print("�� �� (x1,y1), (x2,y2)�� ��ǥ�� �Է��Ͻÿ�>>");
		int x1 = Input.nextInt();
		int y1 = Input.nextInt();
		int x2 = Input.nextInt();
		int y2 = Input.nextInt();
		
		//�簢�� ���� �� ū �簢���� ����.
		if(x1<=50 && y1<=50 && x2>=100 && y2>=100)meet = true;
		if(x2<=50 && y2<=50 && x1>=100 && y1>=100)meet = true;
		if(x1<=50 && y2<=50 && x2>=100 && y1>=100)meet = true;
		if(x2<=50 && y1<=50 && x1>=100 && y2>=100)meet = true;
		
		//���� ��ģ���
		if(((50<=x1 && x1<=100) || (50<=x2 && x2<=100))
				&& ((y1<=50 && y2>=100) || (y2<=50 && y1>=100)))meet = true;
		if(((50<=y1 && y1<=100) || (50<=y2 && y2<=100))
				&& ((x1<=50 && x2>=100) || (x2<=50 && x1>=100)))meet = true;
		
		if(((50<=x2 && x2<=100) || (50<=x1 && x1<=100))
				&& ((y1<=50 && y2>=100) || (y2<=50 && y1>=100)))meet = true;
			if(((50<=y1 && y1<=100) || (50<=y2 && y2<=100))
				&& ((x2<=50 && x1>=100) || (x1<=50 && x2>=100)))meet = true;
			
		if(((50<=x1 && x1<=100) || (50<=x2 && x2<=100))
				&& ((y2<=50 && y1>=100) || (y1<=50 && y2>=100)))meet = true;
		if(((50<=y2 && y2<=100) || (50<=y1 && y1<=100))
				&& ((x1<=50 && x2>=100) || (x2<=50 && x1>=100)))meet = true;
		
		if(((50<=x2 && x2<=100) || (50<=x1 && x1<=100))
				&& ((y2<=50 && y1>=100) || (y1<=50 && y2>=100)))meet = true;
		if(((50<=y2 && y2<=100) || (50<=y1 && y1<=100))
				&& ((x2<=50 && x1>=100) || (x1<=50 && x2>=100)))meet = true;
		
		//�������� ��ģ���
		if(50<=x1 && x1<=100 && 50<=y1 && y1<=100)meet = true;
		if(50<=x2 && x2<=100 && 50<=y1 && y1<=100)meet = true;
		if(50<=x1 && x1<=100 && 50<=y2 && y2<=100)meet = true;
		if(50<=x2 && x2<=100 && 50<=y2 && y2<=100)meet = true;
		
		if(meet==true)System.out.println("�簢���� ��Ĩ�ϴ�.");
		else System.out.println("�簢���� ��ġ�� �ʽ��ϴ�.");
	}
}
