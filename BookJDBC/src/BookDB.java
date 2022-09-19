import java.util.*;

public class BookDB {
	//public static TreeSet<Book> details=new TreeSet<>();
	public static  TreeSet<Book> details;
	static{
	details=new TreeSet<>();
	details.add(new Book(1,"AAA","aaa",1000));
	details.add(new Book(2,"BBB","bbb",2000));
	details.add(new Book(3,"CCC","ccc",3000));
	details.add(new Book(4,"DDD","ddd",4000));
	//System.out.println(details);
	}
	/*public static TreeSet<Book> getCollection(){
		return details;
	}*/
	

}