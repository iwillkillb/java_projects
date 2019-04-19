import java.util.Scanner;
public class P305_6 {

	abstract static class DObject{
		public DObject next;
		public DObject(){next = null;}
		abstract public void draw();
	}
	static class Line extends DObject{
		public void draw(){
			System.out.print("Line");
		}
	}
	static class Rect extends DObject{
		public void draw(){
			System.out.print("Rect");
		}
	}
	static class Circle extends DObject{
		public void draw(){
			System.out.print("Circle");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0; //초기 메뉴의 입력
		int[] obj_value = new int[3]; //각 도형들의 개수
		
		while(true){
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			input = scanner.nextInt();
			if(input == 1)Menu1(obj_value);
			if(input == 2)Menu2(obj_value);
			if(input == 3)Menu3(obj_value);
			if(input == 4)break;
		}
	}
	
	static void Menu1(int[] value){//삽입기능
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		while(input != 1 && input != 2 && input != 3){
			System.out.print("도형 종류 Line(1), Rect(2), Circle(3)>>");
			input = scanner.nextInt();
		}
		value[input-1]++;
	}
	
	static void Menu2(int[] value){//삭제기능
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		System.out.print("삭제할 도형의 위치>>");
		input = scanner.nextInt();
		
		if(input < 1 || input > 3 || value[input-1] == 0)
			System.out.println("삭제할 수 없습니다.");
		else value[input-1]--;
	}
	
	static void Menu3(int[] value){//모두보기기능
		DObject[] O = new DObject[3];
		O[0] = new Line();
		O[1] = new Rect();
		O[2] = new Circle();
		for(int a=0 ; a<3 ; a++){
			if(value[a] > 0){
				O[a].draw();
				System.out.println(" * " + value[a]);
			}
		}
	}

}
