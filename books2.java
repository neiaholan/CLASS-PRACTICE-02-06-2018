import java.util.Scanner;

public class books2 {
	
	public static void main(String [] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Book name, ISBN Number, Year Published, and Book Price");
		books books2= new books(scan.nextLine(),scan.nextInt(),scan.nextInt(),scan.nextInt());

		System.out.println(books2.BookAuthor);
		System.out.println(books2.BookISBNNumber);
		System.out.println(books2.BookYearPublish);
		System.out.println(books2.BookPrice);
		
		
	}

}
