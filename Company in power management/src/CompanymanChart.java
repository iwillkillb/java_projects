import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

enum SortingOrder {Ascending, Descending};
enum SortingStandard {Name, Year, Rank, Task};

public class CompanymanChart {
	ArrayList<Companyman> companymen;
	SortingOrder sortingOrder;
	SortingStandard sortingStandard;
	
	public CompanymanChart(){
		companymen = new ArrayList<Companyman>();
		
		addCompanyman("Kim", 4, Rank.Chairman, Task.CEO);
		
		addCompanyman("Kim", 7, Rank.Director, Task.Sale);
		addCompanyman("Park", 5, Rank.Director, Task.Production);
		addCompanyman("Lee", 1, Rank.Director, Task.Manpower);
		
		addCompanyman("Kim", 1, Rank.Employee, Task.Sale);
		addCompanyman("Kang", 3, Rank.Employee, Task.Sale);

		addCompanyman("Lee", 8, Rank.Sectionhead, Task.Manpower);
		addCompanyman("Lee", 5, Rank.Lieutenant, Task.Manpower);

		addCompanyman("Kim", 2, Rank.Employee, Task.Manpower);
		addCompanyman("Kang", 4, Rank.Employee, Task.Manpower);
	}
	void addCompanyman (String name, int year, Rank rank, Task task){
		Companyman add = new Companyman(name, year, rank, task);
		companymen.add(add);
	}
	
	public ArrayList<Companyman> getCompanymen(SortingOrder sortingOrder, SortingStandard sortingStandard) {
		this.sortingOrder = sortingOrder;
		this.sortingStandard = sortingStandard;
		
		CompareCompanymen compareCompanymen = new CompareCompanymen();
		Collections.sort(companymen, compareCompanymen);
		return companymen;
	}
	
	
	
	class CompareCompanymen implements Comparator<Companyman>{

		@Override
		public int compare(Companyman arg0, Companyman arg1) {
			// TODO Auto-generated method stub
			if(sortingOrder == SortingOrder.Ascending){	//오름차순
				
				if(sortingStandard == SortingStandard.Name){
					return arg0.getName().compareTo(arg1.getName());
				} else if(sortingStandard == SortingStandard.Year){
					if(arg0.getYear() > arg1.getYear())
						return 1;
					else if(arg0.getYear() < arg1.getYear())
						return -1;
					else return 0;
				} else if(sortingStandard == SortingStandard.Rank){
					return arg0.getRank().compareTo(arg1.getRank());
				} else if(sortingStandard == SortingStandard.Task){
					return arg0.getTask().compareTo(arg1.getTask());
				} else {
					return 0;
				}
				
			} else {	//내림차순
				
				if(sortingStandard == SortingStandard.Name){
					return arg1.getName().compareTo(arg0.getName());
				} else if(sortingStandard == SortingStandard.Year){
					if(arg1.getYear() > arg0.getYear())
						return 1;
					else if(arg1.getYear() < arg0.getYear())
						return -1;
					else return 0;
				} else if(sortingStandard == SortingStandard.Rank){
					return arg1.getRank().compareTo(arg0.getRank());
				} else if(sortingStandard == SortingStandard.Task){
					return arg1.getTask().compareTo(arg0.getTask());
				} else {
					return 0;
				}
			}
		}
		
	}
}
