import java.util.Random;

public class Taxman {
	
	CashDesk Collecttax(CashDesk cashdesk,Attraction attraction) {
		try {
			Gamble attraction1=(Gamble) attraction;
			Random rand = new Random();
			if(rand.nextInt(14)==10) {
				double tax = cashdesk.taxtopay;
				cashdesk.buildrevenue(cashdesk.gettotalrevenue()-tax);
				System.out.println("The taxman has collected "+tax);
				cashdesk.taxmanvisit=true;
				cashdesk.taxtopay=0;
				return cashdesk;
				
			} else {
				cashdesk.taxmanvisit=false;
				return cashdesk;
			}
		} catch(RuntimeException e) {
			cashdesk.taxmanvisit=false;
			return cashdesk;
		}
		
		
	}

}
