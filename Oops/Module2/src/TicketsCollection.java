
public class TicketsCollection implements Comparable {
	long pnr;
	Double price;
	String from;
	String to;
	String date;

	public TicketsCollection(Long pnr,Double price,String from,
	String to,String date) {
		this.pnr=pnr;
		this.price=price;
		this.from=from;
		this.to=to;
		this.date=date;
	}
	@Override
	public String toString() {
		return "TicketsCollection [pnr=" + pnr + ", price=" + price + ", from=" + from + ", to=" + to + ", date=" + date
				+ "]";
	}
	@Override
	public int compareTo(Object o) {
    	TicketsCollection t=(TicketsCollection)o;
    	return this.price.compareTo(t.price);
    }
	
}

    
