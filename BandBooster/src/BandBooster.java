
public class BandBooster {

	private String name;
	private int boxesSold;
	
	public BandBooster(String boosterName) {
		name = boosterName;
		boxesSold = 0;
	}
	
	public String getName() {
		return name;
	}

	public void updateSales(int sold) {
		boxesSold += sold;
	}
	
	public String toString() {
		return name + ": " + boxesSold + " boxes";
	}
}
