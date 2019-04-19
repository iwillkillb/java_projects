package 과제2;
import java.util.Scanner;
public class 과제3_10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int[] ar = new int[args.length];
		for(int a=0 ; a<args.length ; a++){
			System.out.print(" " + args[a]);
			try{
			ar[a] = Integer.parseInt(args[a]);
			}
			catch(NumberFormatException e){
				System.out.print("...X");
			}
			sum += ar[a];
		}
		System.out.println();
		System.out.println("합계 : " + sum);
	}}
