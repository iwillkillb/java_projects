
public class TTSMenu {	//ȭ/��/����� �޴�. �迭�� �̿��Ѵ�.
		static final int MAX_ITEMS = 6;
		int numberOfItems = 0;
		MenuItem[] menuItems;
		
		public TTSMenu() {
			menuItems = new MenuItem[MAX_ITEMS];
			
			addItem("ä�������ڿ� BLT", "��� ���� (�Ĺ���)������, ����, �丶�並 ���� �޴�", true, 2.99);
			addItem("BLT", "��� ���� ������, ����, �丶�並 ���� �޴�", false, 2.99);
			addItem("������ ����", "���� �����带 ����� ������ ����", false, 3.29);
			addItem("�ֵ���", "���ũ���Ʈ, ���� ���, ����, ġ� ������ �ֵ���", false, 3.05);
			
		}
		public void addItem(String name, String description, boolean vegetarian, double price){
			MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
			if(numberOfItems >= MAX_ITEMS){
				System.err.println("�� �̻� �߰��� �� �����ϴ�.");
			} else {
				menuItems[numberOfItems] = menuItem;
				numberOfItems += 1;
			}
		}
		/*
		public MenuItem[] getMenuItems() {
			return menuItems;
		}*/
		public Iterator createIterator() {
			return new TTSIterator(menuItems);
		}
	}