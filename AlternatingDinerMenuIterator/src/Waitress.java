public class Waitress {
		MWFSMenu _MWFSMenu;
		TTSMenu _TTSMenu;
		
		public Waitress(MWFSMenu _MWFSMenu, TTSMenu _TTSMenu) {
			this._MWFSMenu = _MWFSMenu;
			this._TTSMenu = _TTSMenu;
		}
		public void printMenu() {
			Iterator MWFSIterator = _MWFSMenu.createIterator();
			Iterator TTSIterator = _TTSMenu.createIterator();
			System.out.println("메뉴\n----\n- 월/수/금/일 메뉴");
			printMenu(MWFSIterator);
			System.out.println("메뉴\n----\n- 화/목/토 메뉴");
			printMenu(TTSIterator);
			
		}
		private void printMenu(Iterator iterator){
			while(iterator.hasNext()){
				MenuItem menuItem = (MenuItem)iterator.next();
				System.out.print(menuItem.getName() + ", ");
				System.out.print(menuItem.getPrice() + ", ");
				System.out.println(menuItem.getDescription());
			}
		}
	}