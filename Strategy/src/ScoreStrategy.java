import java.util.Random;

public class ScoreStrategy implements Strategy {
	private Random random;
	int handValue = 0;
	
	private int[] score = {5,5,5};
	private int maxScore = 9, minScore = 1, scorePlus = 1;
	
	public ScoreStrategy(int seed){
		random = new Random(seed);
	}
	@Override
	public Hand nextHand() {
		// TODO Auto-generated method stub
		int sumScore = 0;
		for(int a=0 ; a<score.length ; a++)			
			sumScore += score[a];
		
		int setValue = random.nextInt(sumScore) + 1;	//Random.nextInt(n) -> return 0 ~ n-1
		
		if(setValue <= score[0])
			handValue = 0;
		else if(setValue <= score[0] + score[1])
			handValue = 1;
		else if(setValue <= sumScore)
			handValue = 2;		
		//Ȯ�� ��� ��� �ϳ�?
		//���� ���, 4,3,5�� ���� 4/12, 3/12, 5/12 Ȯ��...
		//12�� ī�� �� �ϳ��� ������ 1~12 �� �ϳ�.
		//1,2,3,4 / 5,6,7 / 8,9,10,11,12 �̷��� �������� ������.
		
		return Hand.getHand(handValue);
	}

	@Override
	public void study(boolean win) {
		// TODO Auto-generated method stub
		
		
		//Set currentHandValue!!
		//�ڱⰡ �� hand�� ��� �Ƴ�?
		
		
		//Score clamping
		if(score[handValue] > maxScore)
			score[handValue] = maxScore;
		else if(score[handValue] < minScore)
			score[handValue] = minScore;
		else {
			//Score change
			if(win)
				score[handValue] += scorePlus;
			else
				score[handValue] -= scorePlus;
		}
	}

}
