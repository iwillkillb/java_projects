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
		//확률 계산 어떻게 하나?
		//예를 들어, 4,3,5면 각각 4/12, 3/12, 5/12 확률...
		//12개 카드 중 하나를 뽑으면 1~12 중 하나.
		//1,2,3,4 / 5,6,7 / 8,9,10,11,12 이렇게 구역으로 나눈다.
		
		return Hand.getHand(handValue);
	}

	@Override
	public void study(boolean win) {
		// TODO Auto-generated method stub
		
		
		//Set currentHandValue!!
		//자기가 낸 hand를 어떻게 아나?
		
		
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
