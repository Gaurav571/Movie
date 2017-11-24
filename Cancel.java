package PROJECT;
import java.util.*;
public class Cancel {
	Seat s=new Seat();
Scanner sc=new Scanner(System.in);
void cancel(){
System.out.println("Enter your phone number");
long ph=sc.nextLong();
if(ph==9560){
	s.SeatArrange();
	System.out.println("Enter row and seat number for which you want to cancel the ticket");
	int x=sc.nextInt();
	int y=sc.nextInt();
	s.change(x, y, 'v');
}
}
}
