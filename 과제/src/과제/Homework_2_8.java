package 과제;
import java.util.Scanner;
public class Homework_2_8 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		boolean meet = false;
		System.out.print("두 점 (x1,y1), (x2,y2)의 좌표를 입력하시오>>");
		int x1 = Input.nextInt();
		int y1 = Input.nextInt();
		int x2 = Input.nextInt();
		int y2 = Input.nextInt();
		
		//사각형 위에 더 큰 사각형을 얹음.
		if(x1<=50 && y1<=50 && x2>=100 && y2>=100)meet = true;
		if(x2<=50 && y2<=50 && x1>=100 && y1>=100)meet = true;
		if(x1<=50 && y2<=50 && x2>=100 && y1>=100)meet = true;
		if(x2<=50 && y1<=50 && x1>=100 && y2>=100)meet = true;
		
		//변이 겹친경우
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
		
		//꼭지점이 겹친경우
		if(50<=x1 && x1<=100 && 50<=y1 && y1<=100)meet = true;
		if(50<=x2 && x2<=100 && 50<=y1 && y1<=100)meet = true;
		if(50<=x1 && x1<=100 && 50<=y2 && y2<=100)meet = true;
		if(50<=x2 && x2<=100 && 50<=y2 && y2<=100)meet = true;
		
		if(meet==true)System.out.println("사각형이 겹칩니다.");
		else System.out.println("사각형이 겹치지 않습니다.");
	}
}
