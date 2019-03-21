import java.util.Scanner;

public class BookArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book [] book = new Book[2];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<book.length;i++){
			System.out.print("title : ");
			String title = scanner.nextLine();
			System.out.print("Author : ");
			String author = scanner.nextLine();
			book[1] = new Book(title, author);
		}
		
		for (int i = 0; i < book.length; i++);
			System.out.println(book[1].title + " " + "book[i].author");
		scanner.close();

	}

}
