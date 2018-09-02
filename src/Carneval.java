
public class Carneval {
	static public void main(String[] args) {
		 
		Carnevalrunner runner = new Carnevalrunner() ;
		runner.run();


		
	
}
	
	}


class Carnevalrunner{
	CashDesk cashDesk = new CashDesk();
	Attraction attractionarray[]= {new Bumbercars(2.50) ,new Spin(2.25),new Mirrorpalace(2.75),new Hauntedhouse(3.20),new Hawaii(2.50),new Ladderclimbing(5.00)};
	int timeSpin=1, timeHawai =1;
	Taxman taxman = new Taxman();
	void run() {
		String input = new Inputprocessor().getInput();
		//Integer newinput= Integer.getInteger(input); 
		System.out.println(input);
	runAllattraction(input,attractionarray);

	}


	void runAllattraction(String input,Attraction ... attractions ) {
		
		 
		
		switch (input) {
		default:
			System.out.println("Illegal input.");
			run();
			break;
			case "1" :
				attractions[0]=runthisattraction(attractions[0]);
				cashDesk.setticketsold(attractions[0].getTickets());
				run();
				break;
			case "2" :
				attractions[1]=runthisattraction((Spin)attractions[1],timeSpin);
				cashDesk.setticketsold(attractions[1].getTickets());
				timeSpin++;
				run();
				
				break;
			case "3" :
				attractions[2]=runthisattraction(attractions[2]);
				cashDesk.setticketsold(attractions[2].getTickets());
				run();
				break;
			case "4" :
				attractions[3]=runthisattraction(attractions[3]);
				cashDesk.setticketsold(attractions[3].getTickets());
				run();
				break;
			case "5" :
				attractions[4]=runthisattraction((Hawaii)attractions[4],timeHawai );
				cashDesk.setticketsold(attractions[4].getTickets());
				timeHawai++;
				run();
				break;
			case "6" :
				attractions[5]=runthisattraction(attractions[5]);
				cashDesk.setticketsold(attractions[5].getTickets());
				run();
				break;
			case "o" :
				System.out.println(cashDesk.totalrevenue);
				run();
				break;
			case "k" :
				System.out.println(cashDesk.getticketsold());
				run();
				break;
			}
			}
		
		
	Attraction runthisattraction(Attraction attraction) {
		attraction.runAttraction();
		attraction.setRevenue();
		attraction.setTickets();
		cashDesk.buildrevenue(attraction.getRevenue());
		if (attraction instanceof Gamble) {
			cashDesk.storetax(((Gamble) attraction).getTax());
		}
		cashDesk=taxman.Collecttax(cashDesk,attraction);
		//System.out.println(attraction.getRevenue());
		return attraction;
	
	}
	
	Attraction runthisattraction(Attraction attraction1,int time) {
		RiskyAttraction attraction =  (RiskyAttraction) attraction1;
		//System.out.println(time);
		try{
			
				System.out.println(attraction.Examinateride(time));
				attraction.runAttraction();
				attraction.setRevenue();
				attraction.setTickets();
				cashDesk.buildrevenue(attraction.getRevenue());
				if (attraction instanceof Gamble) {
					cashDesk.storetax(((Gamble) attraction).getTax());
				}
				cashDesk=taxman.Collecttax(cashDesk,attraction);
				//System.out.println(attraction.getRevenue());
			return  attraction;
		}  catch(Exception e){
			
			System.out.println(e);
		
			return attraction;

			
			
			
		}
	
	}
	}




