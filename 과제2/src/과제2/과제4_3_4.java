package 과제2;

class Wine{
	private String manufacturer;
	private String name;
	private String country;
	private String region;
	private String kind;
	private int year;
	private int grade;
	
	Wine(){
		manufacturer = "UNKNOWN";
		name = "UNKNOWN";
		country = "UNKNOWN";
		region = "UNKNOWN";
		kind = "UNKNOWN";
		year = 0;
		grade = 0;
	}
	Wine(String m, String n){
		manufacturer = m;
		name = n;
	}
	void PrintData(){
		System.out.println("manufacturer : " + manufacturer);
		System.out.println("name : " + name);
		System.out.println("country : " + country);
		System.out.println("region : " + region);
		System.out.println("kind : " + kind);
		System.out.println("year : " + year);
		System.out.println("grade : " + grade);
		System.out.println();
	}
}

public class 과제4_3_4 {
	public static void main(String[] args) {
		Wine w1 = new Wine();
		Wine w2 = new Wine("Germany", "Jaeger");
		w1.PrintData();
		w2.PrintData();
	}}
