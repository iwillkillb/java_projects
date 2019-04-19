package 과제2;

public class 과제3_8 {
//(int)Math.round(Math.random()*9) : 0~9 random
	public static void main(String[] args) {
		int[][] ar = new int[4][4];
		
		for(int a=0 ; a<4 ; a++){
			for(int b=0 ; b<4 ; b++)
				ar[a][b] = (int)Math.round(Math.random()*9+1);
		}
		int _zero = 0;
		for(int a=0 ; a<4 ; a++){
			for(int b=0 ; b<4 ; b++){
				if((int)Math.round(Math.random()*1)==0){
					ar[a][b] = 0; _zero++;
				}
			if(_zero>=8)break;
			}
		}
		for(int a=0 ; a<4 ; a++){
			for(int b=0 ; b<4 ; b++)
				System.out.print(ar[a][b] + " ");
			System.out.println();
		}
	}}
