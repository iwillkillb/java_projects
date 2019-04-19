import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prac2294 {
	//n : 동전 종류의 개수, k : 목표 가치의 합
	//n가지 종류의 동전이 있다. 각각의 동전이 나타내는 가치는 다르다. 
	//이 동전들을 적당히 사용해서, 그 가치의 합이 k원이 되도록 하고 싶다.
	//그러면서 동전의 개수가 최소가 되도록 하려고 한다. (각각의 동전은 몇개라도 사용할 수 있다.)
	//입력 : 첫째줄에 n, k가 주어진다. (1 ≤ n ≤ 100, 1 ≤ k ≤ 10,000) 다음 n개의 줄에는 각각의 동전의 가치가 주어진다.
	//출력 : 첫째줄에 사용한 동전의 최소 개수를 출력한다. 불가능한 경우에는 -1을 출력한다.
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if(n<1 || n>100){
			System.out.print("n은 1~100으로 : ");
			n = Integer.parseInt(br.readLine());
		}
		int k = Integer.parseInt(br.readLine());
		if(k<1 || k>10000){
			System.out.print("k는 1~10000으로 : ");
			k = Integer.parseInt(br.readLine());
		}
		int [] cost = new int [n];
		for(int a=0 ; a<n ; a++){
			cost[a] = Integer.parseInt(br.readLine());
		}
		
		
		
		
		
		
	}

}
