import java.util.Scanner;

public class WordProcessorCommander {

	static Scanner scanner = new Scanner(System.in);
	public enum Order {
		paste, cut, undo, quit
	};
	
	public static class Word {
		String text;
		
		public void SetText (String text) {
			this.text = text;
		}
		
		public String GetText () {
			return text;
		}
	}
	
	public interface Command {
		public void execute();
	}
	
	
	
	
	
	public static class InitCommand implements Command {
		Word word;
		
		public InitCommand (Word word) {
			this.word = word;
		}
		
		@Override
		public void execute() {
			// TODO Auto-generated method stub
			System.out.println("Please input initialization text.");
			String inputText = scanner.nextLine();
			word.SetText(inputText);
			System.out.println("--> " + word.GetText() + " <--");
		}
	}
	
	
	
	
	
	public static class PasteCommand implements Command {
		Word word;
		
		public PasteCommand (Word word) {
			this.word = word;
		}

		@Override
		public void execute() {
			// TODO Auto-generated method stub
			System.out.println("Please specify index where the paste start must :");
			int startPosition = scanner.nextInt();
			System.out.println("You chose " + startPosition);

			System.out.println("Please specify text to be inserted :");
			String insertText = scanner.next();	//nextLine() -> Skip??
			
			StringBuffer newTextBuffer = new StringBuffer(word.GetText());
			newTextBuffer.insert(startPosition, insertText);
			
			word.SetText(newTextBuffer.toString());
			System.out.println("--> " + word.GetText() + " <--");
		}
		
	}
	
	
	
	
	
	public static class CutCommand implements Command {
		Word word;
		
		public CutCommand (Word word) {
			this.word = word;
		}

		@Override
		public void execute() {
			// TODO Auto-generated method stub
			System.out.println("Please specify index where the cut start must :");
			int startPosition = scanner.nextInt();
			System.out.println("You chose " + startPosition);

			System.out.println("Please specify number of characters to be cut :");
			int endPosition = scanner.nextInt();
			System.out.println("You chose " + endPosition);
			
			StringBuffer newTextBuffer = new StringBuffer(word.GetText());
			newTextBuffer.delete(startPosition, endPosition);
			
			word.SetText(newTextBuffer.toString());
			System.out.println("--> " + word.GetText() + " <--");
		}
		
	}
	
	
	
	
	
	public static class UndoCommand implements Command {
		Word word;
		String backupText = "";
		
		public UndoCommand (Word word) {
			this.word = word;
			backupText = word.GetText();
		}
		
		public void SetBackupText (String backupText) {
			this.backupText = backupText;
		}

		@Override
		public void execute() {
			// TODO Auto-generated method stub
			System.out.println("BEFORE -->" + word.GetText() + "<--");
			word.SetText(backupText);
			System.out.println("AFTER -->" + word.GetText() + "<--");
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Word word = new Word();
		InitCommand initCommand = new InitCommand(word);
		PasteCommand pasteCommand = new PasteCommand(word);
		CutCommand cutCommand = new CutCommand(word);
		UndoCommand undoCommand = new UndoCommand(word);
		initCommand.execute();
		
		String order = "";
		Boolean out = false;
		while(out == false){
			System.out.println("Please input order. (paste/cut/undo/quit)");
			order = scanner.next();
			
			switch(order){
			case "paste":
				undoCommand.SetBackupText(word.GetText());
				pasteCommand.execute();
				break;
			case "cut":
				undoCommand.SetBackupText(word.GetText());
				cutCommand.execute();
				break;
			case "undo":
				undoCommand.execute();
				break;
			case "quit":
				System.out.println("RESULT --> " + word.GetText() + " <--");
				System.out.println("GOOD BYE ^v^");
				out = true;
				break;
			}
		}		
	}
}
