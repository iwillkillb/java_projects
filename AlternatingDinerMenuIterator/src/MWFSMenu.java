import java.util.ArrayList;

public class MWFSMenu {	//��/��/��/�Ͽ��� �޴�. ArrayList�� �̿��Ѵ�.
		ArrayList menuItems;
		
		public MWFSMenu() {
			menuItems = new ArrayList();
			
			addItem("K&B ������ũ ��Ʈ", "��ũ����� ���׿� �佺Ʈ�� ������ ������ũ", true, 2.99);
			addItem("���ַ� ������ũ ��Ʈ", "�ް� �Ķ��̿� �ҽ����� ������ ������ũ", false, 2.99);
			addItem("��纣�� ������ũ ��Ʈ", "�ż��� ��纣���� ��纣�� �÷����� ���� ������ũ", true, 3.49);
			addItem("����", "����, ���⿡ ���� ��纣���� ���⸦ ���� �� �ֽ��ϴ�.", true, 3.59);
		}
		public void addItem(String name, String description, boolean vegetarian, double price){
			MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
			menuItems.add(menuItem);
		}
		public ArrayList getMenuItems() {
			return menuItems;
		}
		public Iterator createIterator() {
			return new MWFSIterator(menuItems);
		}
	}