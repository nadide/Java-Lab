
public class Commission extends Hourly {
	double totalSales;
	double commRate;
	
	Commission (String eName, String eAddress, String ePhone, 
			String socSecNumber, double rate, double commRate) {
		super (eName, eAddress, ePhone, socSecNumber, rate);
		this.commRate = commRate;	
	}
	
	public void addSales (double totalSales) {
		this.totalSales+= totalSales;
	}
	
	public double pay () {
		double payment = super.pay() + commRate * totalSales ;
		totalSales = 0;
		return payment;
	}

	public String toString () {
		String result = super.toString();
		result += "\nTotal sales: " + totalSales;
		return result;
	}
}
