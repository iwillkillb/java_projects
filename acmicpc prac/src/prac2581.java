import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class prac2581 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//Scanner scanner = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = -1;
		int min = 0;
		boolean isPrime = false, minRecord = false;
		
		while(N < M || N<0 || N>10000 || M<0 || M>10000){
			System.out.print("M은 N보다 작거나 같게, M,N은 1~10000으로. ");
			M = Integer.parseInt(br.readLine());
			N = Integer.parseInt(br.readLine());
		}
		
		for(int a=M ; a<=N ; a++){
			isPrime = true;
			for(int b=2 ; b<a ; b++){
				if(a % b == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime == true){
				if(minRecord == false){
					minRecord = true;
					sum = 0;
					min = a;
				}
				sum += a;
			}
		}
		
		
		System.out.println(sum);
		if(min != 0)
			System.out.println(min);
		
	}

}
