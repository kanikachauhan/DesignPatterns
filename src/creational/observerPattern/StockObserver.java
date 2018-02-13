package creational.observerPattern;

public class StockObserver implements Observer{

	private double ibmPrice;
	private double appPrice;
	private double googlePrice;
	private static int observerIDTracker = 0;
	private int observerID;
	private Subject stockGrabber;
	public StockObserver(Subject stockGrabber) {
		this.stockGrabber = stockGrabber;
		this.observerID = ++observerIDTracker;
		System.out.println("New Observer "+this.observerID);
		stockGrabber.register(this);
	}
	@Override
	public void update(double ibmPrice, double appPrice, double googlePrice) {
		this.ibmPrice = ibmPrice;
		this.appPrice = appPrice;
		this.googlePrice = googlePrice;
		printThePrices();
	}
	public void printThePrices(){
		System.out.println(observerID+" \nIBM "+ibmPrice+" \nAPPl "+appPrice+" \nGooglePrice "+googlePrice);
	}
}
