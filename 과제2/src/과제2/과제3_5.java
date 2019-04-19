package 과제2;
import java.util.Scanner;
public class 과제3_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] ar = new int[10];
		for(int a=0 ; a<10 ; a++){
			System.out.print(a+1 + "번  : ");
			ar[a] = input.nextInt();
		}
		for(int a=0 ; a<10 ; a++)
			System.out.print(" " + ar[a]);
		System.out.println();
		System.out.print("3의 배수 : ");
		for(int a=0 ; a<10 ; a++)
			if(ar[a]%3==0 && ar[a]!=0)System.out.print(" " + ar[a]);
	}}
