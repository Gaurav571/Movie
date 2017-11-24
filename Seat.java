package PROJECT;
import java.util.*;
public class Seat {
Scanner sc=new Scanner(System.in);
static char s[][]={ {'v','v','v','v','v','v','v','v','v','v','v','v'},{'v','v','v','v','v','v','v','v','v','v','v','v'},
					{'v','v','v','v','v','v','v','v','v','v','v','v'},{'v','v','v','v','v','v','v','v','v','v','v','v'},
					{' ','v','b','v','v','v','v','b','v','v','v',' '},{' ','v','b','v','v','v','v','b','v','v','v',' '},
					{' ','v','b','v','v','v','v','b','v','v','v',' '},{' ','v','b','v','v','v','v','b','v','v','v',' '}};
void SeatArrange(){
	for(int n=0;n<8;n++){
		for(int m=0;m<12;m++){
			System.out.print(s[n][m]+"	");
		}
		System.out.println();	
	}
	System.out.println();	
	System.out.println();	
	System.out.println("\t\t    ----------------------Screen---------------------");	
}
char check(int x,int y){
	return s[x][y];
}
void change(int x,int y,char a){
	s[x][y]=a;
	SeatArrange();
}
}

