package 과제;
import java.util.Scanner;
public class Homework_2_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] in = new int[3];
		
		System.out.print("삼각형의 세 변의 길이를 입력하세요 : ");
		for(int a=0 ; a<in.length ; a++)
			in[a] = input.nextInt();
		
		for(int a=0 ; a<in.length ; a++){
			if(in[a] >= in[(a+1)%3] + in[(a+2)%3]){
				System.out.println("삼각형을 그릴 수 없습니다.");
				break;}
			else if(a==2){
				System.out.println("삼각형을 그릴 수 있습니다.");
				break;}
		}
	}

}
