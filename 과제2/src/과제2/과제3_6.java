package ����2;
import java.util.Scanner;

public class ����3_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] ar = new int[5];
		for(int a=0 ; a<ar.length ; a++){
			System.out.print(a+1 + "��  : ");
			ar[a] = input.nextInt();
		}
		for(int a=0 ; a<ar.length ; a++)
			System.out.print(" " + ar[a]);
		System.out.println();
		int swap;
		for(int a=0 ; a<ar.length-1 ; a++){
			for(int b=a+1 ; b<ar.length ; b++){
				if(ar[a] > ar[b]){
				swap = ar[a];	ar[a] = ar[b];	ar[b] = swap;
				}}}
		for(int a=0 ; a<ar.length ; a++)
			System.out.print(" " + ar[a]);
	}}
