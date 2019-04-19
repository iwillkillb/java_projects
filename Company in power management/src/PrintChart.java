import java.util.ArrayList;

public class PrintChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanymanChart companymanChart = new CompanymanChart();
		ArrayList<Companyman> companymen = companymanChart.getCompanymen(SortingOrder.Descending, SortingStandard.Task);
		//SortingOrder�� SortingStandard�� �����Ͽ� ���� ����� ������ �� �ֽ��ϴ�.
		//SortingOrder : �������� / ��������
		//SortingStandard : �̸��� / �ٹ��⵵�� / ���޺� / ������
		for(int a=0 ; a<companymen.size() ; a++){
			System.out.print(companymen.get(a).getName() + " / ");
			System.out.print(companymen.get(a).getYear() + " years / ");
			System.out.print(companymen.get(a).getRank() + " / ");
			System.out.println(companymen.get(a).getTask());
		}
	}

}
