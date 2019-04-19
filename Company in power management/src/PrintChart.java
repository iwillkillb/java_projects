import java.util.ArrayList;

public class PrintChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanymanChart companymanChart = new CompanymanChart();
		ArrayList<Companyman> companymen = companymanChart.getCompanymen(SortingOrder.Descending, SortingStandard.Task);
		//SortingOrder와 SortingStandard를 설정하여 정렬 방식을 결정할 수 있습니다.
		//SortingOrder : 오름차순 / 내림차순
		//SortingStandard : 이름별 / 근무년도별 / 직급별 / 업무별
		for(int a=0 ; a<companymen.size() ; a++){
			System.out.print(companymen.get(a).getName() + " / ");
			System.out.print(companymen.get(a).getYear() + " years / ");
			System.out.print(companymen.get(a).getRank() + " / ");
			System.out.println(companymen.get(a).getTask());
		}
	}

}
