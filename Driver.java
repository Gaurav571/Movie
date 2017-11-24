package PROJECT;
import java.util.*;
public class Driver {
	public static void main(String[] args) {
		int choice;
		do{
		Scanner sc=new Scanner(System.in);
		System.out.println("Hello!,");
		System.out.println("Enter choice");
		System.out.println("1.Book Tickets");
		System.out.println("2.Cancel Tickets");
		System.out.println("3.Get info");
		System.out.println("0.Exit");
		choice=sc.nextInt();
		if(choice==1){
			Seat s=new Seat();
			Book b=new Book();
			s.SeatArrange();
			b.BookTicket();
		}
		if(choice==2){
			Cancel c=new Cancel();
			c.cancel();
		}
		if (choice==3){
			Info i=new Info();
			i.Review();
		}
		}while(choice!=0);
		System.out.println("Hope you Enjoyed !!!");
		
	}

}
