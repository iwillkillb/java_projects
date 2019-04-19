package 과제;
import java.util.Scanner;
public class Homework_3_3 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		int input, digit=1, binary=0;
		
		System.out.print("이진수로 바꿀 수를 입력하세요 : ");
		input = Input.nextInt();
		
		while(input>=1){
			binary += (input%2) * digit;
			digit *= 10;
			input /= 2;
		}
		System.out.println("이진수 : " + binary);
	}

}
