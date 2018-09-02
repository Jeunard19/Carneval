
public abstract class RiskyAttraction extends Attraction {
	int limit;
	boolean Examinateride(int time) throws Exception{
	
			if((time>=limit)) {
				if((time /limit)==(int)(time /limit)) {
					throw new Exception("This attraction is undergoing maintinance, please come back later");
				} else if ((time % limit)==0) {
					throw new Exception("This attraction is undergoing maintinance, please come back later");
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
