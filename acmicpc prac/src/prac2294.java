import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prac2294 {
	//n : ���� ������ ����, k : ��ǥ ��ġ�� ��
	//n���� ������ ������ �ִ�. ������ ������ ��Ÿ���� ��ġ�� �ٸ���. 
	//�� �������� ������ ����ؼ�, �� ��ġ�� ���� k���� �ǵ��� �ϰ� �ʹ�.
	//�׷��鼭 ������ ������ �ּҰ� �ǵ��� �Ϸ��� �Ѵ�. (������ ������ ��� ����� �� �ִ�.)
	//�Է� : ù°�ٿ� n, k�� �־�����. (1 �� n �� 100, 1 �� k �� 10,000) ���� n���� �ٿ��� ������ ������ ��ġ�� �־�����.
	//��� : ù°�ٿ� ����� ������ �ּ� ������ ����Ѵ�. �Ұ����� ��쿡�� -1�� ����Ѵ�.
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if(n<1 || n>100){
			System.out.print("n�� 1~100���� : ");
			n = Integer.parseInt(br.readLine());
		}
		int k = Integer.parseInt(br.readLine());
		if(k<1 || k>10000){
			System.out.print("k�� 1~10000���� : ");
			k = Integer.parseInt(br.readLine());
		}
		int [] cost = new int [n];
		for(int a=0 ; a<n ; a++){
			cost[a] = Integer.parseInt(br.readLine());
		}
		
		
		
		
		
		
	}

}
