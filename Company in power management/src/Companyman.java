enum Rank {Employee, Lieutenant, Sectionhead, Director, Chairman};	//직급 : 사원, 대리, 과장, 부장, 회장
enum Task {Sale, Production, Manpower, CEO};	//업무 : 판매, 생산, 인력, 대표이사
	
public class Companyman {
	String name;
	int year;
	Rank rank;
	Task task;
	
	public Companyman (String name, int year, Rank rank, Task task){
		this.name = name;
		this.year = year;
		this.rank = rank;
		this.task = task;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	public Rank getRank() {
		return rank;
	}
	public Task getTask() {
		return task;
	}
}
