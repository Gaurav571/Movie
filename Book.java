package PROJECT;
import java.util.*;
public class Book{
	Seat s=new Seat();
	Transaction t=new Transaction();
	Scanner sc=new Scanner(System.in);
	void BookTicket(){
		double rate=0;
		System.out.println("Enter your name and phone number for security purpose ");
		String name=sc.next();
		long ph=sc.nextLong();
		System.out.println("How many ticket do you want to book ?");
		int num=sc.nextInt();
		for(int a=0;a<num;a++){
			System.out.println("Enter Row number and Seat number for "+(a+1)+" ticket");
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(x<4)
				rate=rate+(num*300);
			else
				rate=rate+(num*200);
			if(s.check(x,y)=='b')
			{	int flag=1;
				validation(flag);
			}
				else{
				s.change(x, y,'b');
		}
	}
		t.Transaction(name,ph,num,rate);
	}
	void validation(int f){
		if(f==1)
			throw new NullPointerException("SEAT IS ALREADY BOOKED!!");
		else
			System.out.println("SEAT BOOKED,CHAUD");
	}
	
}
