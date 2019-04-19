import java.util.Scanner;
public class Main {
	//수를 지운 뒤의 결과가 더 큰 쪽으로 가라.
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();	//N자리의 수
		int dels = scanner.nextInt();	//지울 숫자들

		String strInput = String.valueOf(input);
		//지울 수 dels의 길이 : (int)(Math.log10(dels)+1)
		int del, a, b;	//dels의 각 자리별 수 : (int)(dels / Math.pow(10, a)) % 10
		
		int compareInput = 0, resultInput = 0, finalResult = input;	//del을 빼고 난 뒤의 input의 상태, 그것을 저장하는 곳, 최종 결과가 저장되는 곳
		String stringInput, upperInput, lowerInput;	//input의 문자열화, del의 수 기준으로 앞부분, 뒷부분
		
		for(a=(int)(Math.log10(dels)) ; a>=0 ; a--){	//dels의 길이만큼 반복
			del = (int)(dels / Math.pow(10, a)) % 10;	//위부터 간다, dels의 자리수
			stringInput = String.valueOf(input);
			
			for(b=stringInput.length() ; b>=0 ; b--){	//input의 길이만큼 반복
				//input의 각 자리 수 : (int)(input / Math.pow(10, b)) % 10
				if((int)(input / Math.pow(10, b)) % 10 == del){	//b : input에서 del과 같은 수의 자리수
					
					//string은 int와 달리 index를 왼쪽부터 센다.
					//input을 string처럼 받아서 stringInput에 저장한다.
					//지울 수의 앞/뒷부분은 각각 upper/lowerInput에 저장한다.
					//그 뒤, 그 둘을 붙여서 compareInput에 저장한다.
					//남은 수를 크게 만들기 위해, resultInput에 지운 뒤의 결과가 가장 큰 값을 저장한다.
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
			resultInput = -1;	//finalResult에 0이 저장되는것을 방지한다.
		}
		System.out.println("=>" + finalResult);
	}

}
