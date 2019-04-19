enum Rank {Employee, Lieutenant, Sectionhead, Director, Chairman};	//���� : ���, �븮, ����, ����, ȸ��
enum Task {Sale, Production, Manpower, CEO};	//���� : �Ǹ�, ����, �η�, ��ǥ�̻�
	
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
