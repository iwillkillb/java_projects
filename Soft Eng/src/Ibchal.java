class Administrator{
	String demand;						//�����ü�� �̸�
	int [] guestNum = new int [10];		//�����ڵ��� ��ȣ
	int [] productNum = new int [10];	//��ǰ���� ��ȣ
	boolean isEnd = false;				//���� ���� ����
	String ums;							//UMS �޼���
	
	void SetDemand(String demandName){	//�����ü�� ����մϴ�.
		demand = demandName;
	}
	void SetGuestNum(int num){	//���� �������� ��ȣ�� �����մϴ�. �ܼ� �湮��/������ ���δ� ��ȣ�� �����մϴ�.
		for(int a=0 ; a<10 ; a++){
			if(guestNum[a] == 0){
				guestNum[a] = num;
				break;
			}
		}
	}
	void SetProductNum(int num){	//��ǰ�� ��ȣ�� �����մϴ�.
		for(int a=0 ; a<10 ; a++){
			if(productNum[a] == 0){
				productNum[a] = num;
				break;
			}
		}
	}
	void SetUMS(String massage){	//UMS �޼����� �޽��ϴ�.
		ums = massage;
	}
}

class Excutor{
	int buyerNum;							//�������� ��ȣ
	int [] requestProduct = new int[10];	//�����ڰ� �ʿ��� ��ǰ.
	boolean isEndQualified = false;			//���ݽɻ� ���� ���� ����
	String ums;								//UMS �޼���
	int [] score = new int [10];			//�����ڸ� �����ϱ� ���� ����
	
	void SelectBuyer(Participant[] guests){	//������ �� �����ڸ� �����ϰ� �ɻ縦 �����մϴ�. �����ڴ� �������� ǰ��(product[])�� ���� �����ڸ� �����մϴ�.
		for(int a=0 ; a<guests.length ; a++){		//������ ����ŭ �����ڸ� �ɻ��մϴ�.
			
			for(int b=0 ; b<10 ; b++){	//�����ڰ� ����ϴ� ǰ��� �������� �䱸ǰ���� ��ġ�ϸ� 1���� ����ϴ�.
				if(requestProduct[a] == guests[a].product[b]){
					score[a] += 1;
				}
			}
			//�׸��� ���� ���� ������ �����ڰ� �����ڷ� ���õ˴ϴ�.
		}
	}
	void SetUMS(String massage){	//UMS �޼����� �޽��ϴ�.
		ums = massage;
	}
}

class Guest{
	boolean isBuyer = false;	//���� ������ : true, �ܼ� �湮�� : false
	String ums;					//UMS �޼���
	
	void Participation(){	//�ܼ� �湮�ڰ� ���� ������ ����մϴ�.
		isBuyer = true;
	}
	void SetUMS(String massage){	//UMS �޼����� �޽��ϴ�.
		ums = massage;
	}
}

class Participant extends Guest{
	public int guestNum;
	public int [] product = new int [10];	//�ش� ���� �����ڰ� �ŷ��� �� �ִ� ��ǰ
	public boolean isQualified = false;	//������ ��ü�� �����Ǿ����� ����
	
	void SetGuestNum(){	//���� �����ڷμ� ��ȣ�� �޽��ϴ�.
		
	}
	void SetProduct(int productNum){	//�������� �� ǰ���� �����մϴ�.
		for(int a=0 ; a<10 ; a++){
			if(product[a] == 0){
				product[a] = productNum;
				break;
			}
		}
	}
}

class OuterSystem{
	int bidTimer, qualTimer;	//����/���ݽɻ縦 �����ϴ� Ÿ�̸�
	
	void EndTime(){	//bidTimer�� ������ �����մϴ�.
		
	}
	void EndQualified(){	//qualTimer�� ���ݽɻ縦 �����մϴ�.
		
	}
	String GetUMS(String massage){	//UMS �޼����� �ٸ� Ŭ�����鿡�� �����ϴ�.
		return massage;
	}
}

public class Ibchal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
