package PROJECT;
import java.util.*;
public class Info {
void Review(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter movie for which you want to get info:");
	System.out.println("1.Justice league");
	System.out.println("2.Golmaal 3");
	System.out.println("3.Daddy's Home 2");
	System.out.println("4.Wonder");
	int choice=sc.nextInt();
	switch(choice){
	case 1:
		System.out.println("Fueled by his restored faith in humanity and inspired by Superman's selfless act,\n"
				+ " Bruce Wayne enlists newfound ally Diana Prince to face an even greater threat. Together,\n "
				+ "Batman and Wonder Woman work quickly to recruit a team to stand against this newly awakened\n"
				+ " enemy. Despite the formation of an unprecedented league of heroes -- Batman, Wonder Woman,\n"
				+ " Aquaman, Cyborg and the Flash -- it may be too late to save the planet from an assault of\n "
				+ "catastrophic proportions");
		break;
	case 2:
		System.out.println("After selling fake examination papers to students, Madhav, Laxman and Lucky re-locate\n"
				+ " to Goa, and not only get into verbal & physical confrontations with Gopal and Laxman, but also\n"
				+ " ruin their jet-ski and fire-works businesses. Feeling threatened, they inform their bus-driver \n"
				+ "father, Pritam, who goes to confront Gopal and Laxman, and finds out that their mother, Geeta P.\n"
				+ " Chopra, is his long-lost love. Gopal's girlfriend, Daboo, overhears their conversation, and gets \n"
				+ "them dramatically married - just in time as Pritam is heavily in debt and is about to be evicted\n"
				+ " by goons led by Raghav. Chaos and violent confrontations will become the order when he takes his\n"
				+ " children to live with Geeta, and the newly married couple may conclude that divorce may be the only\n"
				+ " solution to end their respective children's disputes");
		break;
	case 3:
		System.out.println("Brad Taggart (Will Ferrell) is a kindhearted radio executive who wants to be the best\n"
				+ " possible stepfather to his wife's (Linda Cardellini) two children. When her freewheeling ex-husband\n"
				+ " Dusty (Mark Wahlberg) breezes back into town, Brad's feeling of insecurity quickly develops into an \n"
				+ "inferiority complex. As Dusty demonstrates his flair for athletics, home repair and bad-boy charisma, \n"
				+ "Taggart finds himself in a no-holds-barred battle to one-up his rival and win the approval of his family.\n");
		break;
	case 4:
		System.out.println("August Auggie Pullman is a fifth-grade boy living in North River Heights in upper Manhattan.\n"
				+ " He has an extremely rare medical facial deformity, which he refers to as mandibulofacial dysostosis\n,"
				+ " which is likely Treacher Collins syndrome (although not expressly said in the book) and a cleft palate.\n");
		break;
		default :
		System.out.println("Wrong input");
	}
}
}
