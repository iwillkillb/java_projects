class Administrator{
	String demand;						//수요업체의 이름
	int [] guestNum = new int [10];		//참가자들의 번호
	int [] productNum = new int [10];	//상품들의 번호
	boolean isEnd = false;				//입찰 종료 여부
	String ums;							//UMS 메세지
	
	void SetDemand(String demandName){	//수요업체를 등록합니다.
		demand = demandName;
	}
	void SetGuestNum(int num){	//입찰 참가자의 번호를 저장합니다. 단순 방문자/입찰자 여부는 번호로 구분합니다.
		for(int a=0 ; a<10 ; a++){
			if(guestNum[a] == 0){
				guestNum[a] = num;
				break;
			}
		}
	}
	void SetProductNum(int num){	//상품의 번호를 저장합니다.
		for(int a=0 ; a<10 ; a++){
			if(productNum[a] == 0){
				productNum[a] = num;
				break;
			}
		}
	}
	void SetUMS(String massage){	//UMS 메세지를 받습니다.
		ums = massage;
	}
}

class Excutor{
	int buyerNum;							//적격자의 번호
	int [] requestProduct = new int[10];	//집행자가 필요한 상품.
	boolean isEndQualified = false;			//적격심사 판정 종료 여부
	String ums;								//UMS 메세지
	int [] score = new int [10];			//적격자를 선택하기 위한 점수
	
	void SelectBuyer(Participant[] guests){	//참가자 중 적격자를 선택하고 심사를 시작합니다. 집행자는 참가자의 품목(product[])을 보고 적격자를 선택합니다.
		for(int a=0 ; a<guests.length ; a++){		//참가자 수만큼 적격자를 심사합니다.
			
			for(int b=0 ; b<10 ; b++){	//참가자가 취금하는 품목과 수요기관의 요구품목이 일치하면 1점을 얻습니다.
				if(requestProduct[a] == guests[a].product[b]){
					score[a] += 1;
				}
			}
			//그리고 가장 높은 점수의 참가자가 적격자로 선택됩니다.
		}
	}
	void SetUMS(String massage){	//UMS 메세지를 받습니다.
		ums = massage;
	}
}

class Guest{
	boolean isBuyer = false;	//입찰 참가자 : true, 단순 방문자 : false
	String ums;					//UMS 메세지
	
	void Participation(){	//단순 방문자가 입찰 참가를 희망합니다.
		isBuyer = true;
	}
	void SetUMS(String massage){	//UMS 메세지를 받습니다.
		ums = massage;
	}
}

class Participant extends Guest{
	public int guestNum;
	public int [] product = new int [10];	//해당 입찰 참가자가 거래할 수 있는 상품
	public boolean isQualified = false;	//적격자 업체로 선정되었는지 여부
	
	void SetGuestNum(){	//입찰 참가자로서 번호를 받습니다.
		
	}
	void SetProduct(int productNum){	//수요기관이 볼 품목을 선정합니다.
		for(int a=0 ; a<10 ; a++){
			if(product[a] == 0){
				product[a] = productNum;
				break;
			}
		}
	}
}

class OuterSystem{
	int bidTimer, qualTimer;	//입찰/적격심사를 종료하는 타이머
	
	void EndTime(){	//bidTimer로 입찰을 종료합니다.
		
	}
	void EndQualified(){	//qualTimer로 적격심사를 종료합니다.
		
	}
	String GetUMS(String massage){	//UMS 메세지를 다른 클래스들에게 보냅니다.
		return massage;
	}
}

public class Ibchal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
