import java.util.Scanner;

class Point{
	public int x,y;
	Point(int xi, int yi){
		x = xi;
		y = yi;
	}
}
public class prac2261 {
	//2���� ���� n���� ���� �־����� ��, �� ���� �� ���� ����� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	//�Է� : ù° �ٿ� �ڿ��� n(2��n��100,000)�� �־�����. ���� n���� �ٿ��� ���ʷ� �� ���� x, y��ǥ�� �־�����. ������ ��ǥ�� ������ 10,000�� ���� �ʴ� �����̴�.
	//��� : ù° �ٿ� ���� ����� �� ���� �Ÿ��� ������ ����Ѵ�.
	public static double Distance(Point p1, Point p2){	//�� ���� �Ÿ��� ��ȯ�Ѵ�.
		int xx, yy;
		xx = p1.x > p2.x ? p1.x - p2.x : p2.x - p1.x;
		xx *= xx;
		yy = p1.y > p2.y ? p1.y - p2.y : p2.y - p1.y;
		yy *= yy;
		return Math.sqrt(xx + yy);
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int pointCount = scanner.nextInt();
		while(pointCount < 2 || pointCount > 100000){
			System.out.print("2~100000������ �Է� ���� : ");
			pointCount = scanner.nextInt();	//���� ���� �Է�
		}
		Point [] point = new Point[pointCount];
		int inputX, inputY;
		for(int a=0 ; a<pointCount ; a++){	//�� ������ ��ġ �Է�
			inputX = scanner.nextInt();
			inputY = scanner.nextInt();
			while(inputX < -10000 || inputX > 10000 || inputY < -10000 || inputY > 10000){
				System.out.print("�� ��ǥ�� ���밪�� 10000���Ϸ� �ϼ��� : ");
				inputX = scanner.nextInt();
				inputY = scanner.nextInt();
			}
			point[a] = new Point(inputX,inputY);	//�Է°��� ����Ʈ �迭�� ����
		}
		scanner.close();
		
		double nearDist = 10000000;
		//int [] nearPointsIndex = new int[2];
		for(int a=0 ; a<pointCount ; a++){
			for(int b=a+1 ; b<pointCount ; b++){
				if(nearDist > Distance(point[a], point[b])){
					nearDist = Distance(point[a], point[b]);
					//nearPointsIndex[0] = a;
					//nearPointsIndex[1] = b;
				}
			}
		}
		System.out.println(nearDist * nearDist);
	}
}
