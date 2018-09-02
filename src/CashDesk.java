
public class CashDesk {
	 double totalrevenue;
	 int totalticketsold;
	 double taxtopay;
	 boolean taxmanvisit;
	 
	 void buildrevenue(double revenue) {
		 totalrevenue+=revenue;
	 }

	 void storetax(double tax) {
		 taxtopay+=(tax);
	 }
	 double gettotalrevenue() {
		 return totalrevenue;
	 }
	 void setticketsold(int ticketsold) {
		 totalticketsold+=1;
	 }
	 int getticketsold() {
		 return totalticketsold;
	 }
}
