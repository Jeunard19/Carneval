public abstract class  Attraction {
	 double revenue;
	String name;
	 double price;
	double floor;
	int ticketsold;
	public abstract void runAttraction();

	public double getPrice() {
		return price;
	}
	public void setRevenue() {
		revenue+=price;
	}
	public void setTickets() {
		ticketsold++;
	}
	public int getTickets() {
		return ticketsold;
		
		
	}
	
	public double getRevenue() {
		return revenue;
	}
	Attraction(double price){
		this.price=price;
		
	}
}
