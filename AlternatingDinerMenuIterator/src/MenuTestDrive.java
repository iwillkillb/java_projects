public class MenuTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MWFSMenu _MWFSMenu = new MWFSMenu();
		TTSMenu _TTSMenu = new TTSMenu();
		
		Waitress waitress = new Waitress(_MWFSMenu, _TTSMenu);
		waitress.printMenu();
	}

}
