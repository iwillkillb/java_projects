import java.util.Scanner;

class Point{
	public int x,y;
	Point(int xi, int yi){
		x = xi;
		y = yi;
	}
}
public class prac2261 {
	//2차원 평면상에 n개의 점이 주어졌을 때, 이 점들 중 가장 가까운 두 점을 구하는 프로그램을 작성하시오.
	//입력 : 첫째 줄에 자연수 n(2≤n≤100,000)이 주어진다. 다음 n개의 줄에는 차례로 각 점의 x, y좌표가 주어진다. 각각의 좌표는 절댓값이 10,000을 넘지 않는 정수이다.
	//출력 : 첫째 줄에 가장 가까운 두 점의 거리의 제곱을 출력한다.
	public static double Distance(Point p1, Point p2){	//두 점의 거리를 반환한다.
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
			System.out.print("2~100000개까지 입력 가능 : ");
			pointCount = scanner.nextInt();	//점의 개수 입력
		}
		Point [] point = new Point[pointCount];
		int inputX, inputY;
		for(int a=0 ; a<pointCount ; a++){	//각 점들의 위치 입력
			inputX = scanner.nextInt();
			inputY = scanner.nextInt();
			while(inputX < -10000 || inputX > 10000 || inputY < -10000 || inputY > 10000){
				System.out.print("각 좌표의 절대값은 10000이하로 하세요 : ");
				inputX = scanner.nextInt();
				inputY = scanner.nextInt();
			}
			point[a] = new Point(inputX,inputY);	//입력값을 포인트 배열에 저장
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
