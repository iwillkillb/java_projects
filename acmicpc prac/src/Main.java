import java.util.Scanner;
public class Main {
	//���� ���� ���� ����� �� ū ������ ����.
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();	//N�ڸ��� ��
		int dels = scanner.nextInt();	//���� ���ڵ�

		String strInput = String.valueOf(input);
		//���� �� dels�� ���� : (int)(Math.log10(dels)+1)
		int del, a, b;	//dels�� �� �ڸ��� �� : (int)(dels / Math.pow(10, a)) % 10
		
		int compareInput = 0, resultInput = 0, finalResult = input;	//del�� ���� �� ���� input�� ����, �װ��� �����ϴ� ��, ���� ����� ����Ǵ� ��
		String stringInput, upperInput, lowerInput;	//input�� ���ڿ�ȭ, del�� �� �������� �պκ�, �޺κ�
		
		for(a=(int)(Math.log10(dels)) ; a>=0 ; a--){	//dels�� ���̸�ŭ �ݺ�
			del = (int)(dels / Math.pow(10, a)) % 10;	//������ ����, dels�� �ڸ���
			stringInput = String.valueOf(input);
			
			for(b=stringInput.length() ; b>=0 ; b--){	//input�� ���̸�ŭ �ݺ�
				//input�� �� �ڸ� �� : (int)(input / Math.pow(10, b)) % 10
				if((int)(input / Math.pow(10, b)) % 10 == del){	//b : input���� del�� ���� ���� �ڸ���
					
					//string�� int�� �޸� index�� ���ʺ��� ����.
					//input�� stringó�� �޾Ƽ� stringInput�� �����Ѵ�.
					//���� ���� ��/�޺κ��� ���� upper/lowerInput�� �����Ѵ�.
					//�� ��, �� ���� �ٿ��� compareInput�� �����Ѵ�.
					//���� ���� ũ�� ����� ����, resultInput�� ���� ���� ����� ���� ū ���� �����Ѵ�.
					upperInput = stringInput.substring(0, stringInput.length() - b - 1);
					lowerInput = stringInput.substring(stringInput.length() - b);
					
					compareInput = Integer.valueOf(upperInput + lowerInput);
					resultInput = resultInput > compareInput ? resultInput : compareInput;
				}
				compareInput = 0;
			}
			input = resultInput;
			if(resultInput >= 0 && resultInput < finalResult){
				finalResult = resultInput;
			}
			resultInput = -1;	//finalResult�� 0�� ����Ǵ°��� �����Ѵ�.
		}
		System.out.println("=>" + finalResult);
	}

}
