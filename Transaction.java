package PROJECT;

public class Transaction {
String name;
long phone;
String time;
int num_seat;
double price;
Transaction(){
	name="";
	phone=0;
	time="";
	num_seat=0;
	price=0.0;
}
public void Transaction(String n,long p,int num,double pr){
	name=n;
	phone=p;
	num_seat=num;
	price=pr;
	data();
}
void data(){
	System.out.println("NAME:"+name+"\n PHONE: "+phone+"\n SEAT NUM: "+num_seat+"\nPRICE: "+price+" ");
}
}
