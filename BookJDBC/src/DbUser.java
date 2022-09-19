import java.util.*;


public class DbUser {

public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	String y="y";
	while(y.equals("y")) {
		System.out.println("menu");
		System.out.println("1 To Display all the books");
		System.out.println("2 To insert a book");
		System.out.println("3 To delete a book");
		System.out.println("4 To update book details");
		System.out.println("5 To find a book by id");
		System.out.println("6 To exit");
		System.out.println("Enter your choice : ");
		int n=sc.nextInt();
		BookJDBC obj=new BookJDBC();
		switch(n) {
		case 1:
			obj.displayAll();
			break;
		case 2:
			System.out.println("Enter ID");
			int id=sc.nextInt();
			System.out.println("Enter Title");
			String title=sc.next();
			System.out.println("Enter Author");
			String author=sc.next();
			System.out.println("Enter Price");
			int price=sc.nextInt();
			Book obj1=new Book(id,title,author,price);
			obj.insertBook(obj1);
		    break;
		case 3:
			System.out.println("Enter Id");
			int id1=sc.nextInt();
			obj.deleteBook(id1);
					break;
		case 4:
			System.out.println("Enter Id");
			int id3=sc.nextInt();
			System.out.println("Enter Price");
			int price1=sc.nextInt();
			obj.updateBook(id3, price1);
			break;
		case 5:
			System.out.println("Enter Id");
			int id4=sc.nextInt();
			obj.findById(id4);
			break;
		case 6:
			System.exit(0);
			break;
		}
		System.out.println("Press y for menu");
		String str=sc.next();
		y=str;
		
				
	}
	sc.close();
}

}
