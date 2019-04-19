import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordFactory {

	public static class Page {
		public Page (String inHead, String inText){
			head = inHead;
			text = inText;
		}
		String head, text;
	}
	
	public static abstract class WordProcess {
		protected Page [] pages;
		public void SetPages(Page[] pagesInput){
			pages = pagesInput;
		}
		
		protected String title = "Title";
		public void SetTitle(String titleInput){
			title = titleInput;
		}
		
		public abstract void PrintWord ();
	}
	
	public static class BigWordProcess extends WordProcess {
		public void PrintWord () {
			System.out.println("----- Title : " + title + " -----");
			System.out.println();
			
			for(int a=0 ; a<pages.length ; a++){
				System.out.println("Section " + a + ". --- " + pages[a].head + " ---");
				System.out.println(pages[a].text);
				System.out.println();
			}
		}
	}
	
	public static class SmallWordProcess extends WordProcess {
		public void PrintWord () {
			System.out.println(title);
			System.out.println();
			
			for(int a=0 ; a<pages.length ; a++){
				System.out.println(pages[a].head);
				System.out.println(pages[a].text);
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String title;
		System.out.print("--> Enter title: ");
		title = scanner.nextLine();
		
		List<Page> pages = new ArrayList<Page>();
		
		String inputHead = "Head", inputText = "Text";
		while(!inputHead.equals("-done")){
			System.out.println("--> Enter Heading or \"-done\": ");
			inputHead = scanner.nextLine();
			
			if(!inputHead.equals("-done")){
				System.out.println("--> Enter text: ");
				inputText = scanner.nextLine();

				Page inputPage = new Page(inputHead, inputText);
				pages.add(inputPage);
				
			} else {
				System.out.println("--> Page input is over.");
				System.out.println();
				break;
			}
		}
		Page [] pageArray = pages.toArray(new Page[pages.size()]);

		WordProcess ws = new SmallWordProcess();
		ws.SetTitle(title);
		ws.SetPages(pageArray);
		ws.PrintWord();
		WordProcess wb = new BigWordProcess();
		wb.SetTitle(title);
		wb.SetPages(pageArray);
		wb.PrintWord();
		
		
		
		
		
		scanner.close();
	}

}
