
public abstract class RiskyAttraction extends Attraction {
	int limit;
	boolean Examinateride(int time){
	
			if((time>=limit)) {
				if((time /limit)==(int)(time /limit)) {
					return true;
				} else if ((time % limit)==0) {
					return true;
				} else {
					return false;
				}
				
			} else {
				return false;
			}
			
		
		
	}
	RiskyAttraction(double price) {
		
		super(price);
		// TODO Auto-generated constructor stub
	}

}
