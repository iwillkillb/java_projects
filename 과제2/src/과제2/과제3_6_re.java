package 과제2;
import java.util.Scanner;

class Value{
	int val;
	void Set(int a){val = a;}
	int Get(){return val;}
}

public class 과제3_6_re {
	static void Swap(Value a, Value b){
		int swap;	swap=a.Get(); a.Set(b.Get()); b.Set(swap);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] ar = new int[5];
		for(int a=0 ; a<ar.length ; a++){
			//System.out.print(a+1 + "번  : ");
			ar[a] = input.nextInt();
		}
		for(int a=0 ; a<ar.length ; a++)
			System.out.print(" " + ar[a]);
		System.out.println();

		Value v1 = new Value();
		Value v2 = new Value();
		for(int a=0 ; a<ar.length-1 ; a++){
			for(int b=a+1 ; b<ar.length ; b++){
				if(ar[a] > ar[b]){
					v1.Set(ar[a]);	v2.Set(ar[b]);
					Swap(v1,v2);
					ar[a] = v1.Get();	ar[b] = v2.Get();
				}}}
		for(int a=0 ; a<ar.length ; a++)
			System.out.print(" " + ar[a]);
	}}
