package 과제;
import java.util.Scanner;
public class Homework_2_2 {

	public static void main(String[] args) {
		System.out.println("주민등록번호를 -까지 포함하여 쓰세요.");
		Scanner input = new Scanner(System.in).useDelimiter("\\s|-");
		System.out.print(input.next());
	}

}
