package 과제;
import java.util.Scanner;
public class Homework_2_6 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		System.out.print("연도를 입력하세요 : ");
		int input = Input.nextInt();
		
		if(input%400==0)System.out.println("윤년");
		else if(input%4==0 && input%100!=0)
			System.out.println("윤년");
		else System.out.println("평년");
	}

}
