package creational.observerPattern;

import java.util.ArrayList;

public class StockGrabber implements Subject{

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double appPrice;
	private double googlePrice;
	
	public StockGrabber(){
		observers = new ArrayList<Observer>();
	}
	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver);
	}

	@Override
	public void unregister(Observer deleteObserver) {
		int observerIndex = observers.indexOf(deleteObserver);
		System.out.println("Observer "+(observerIndex+1)+" deleted");
		observers.remove(observerIndex);
	}

	@Override
	public void notifyObserver() {
		for(Observer observer:observers){
			observer.update(ibmPrice, appPrice, googlePrice);
		}
	}

	public void setIBMPrice(double newIbmPrice){
		ibmPrice = newIbmPrice;
		notifyObserver();
	}
	public void setAPPPrice(double newAppPrice){
		appPrice = newAppPrice;
		notifyObserver();
	}
	public void setGooglePrice(double newGooglePrice){
		googlePrice= newGooglePrice;
		notifyObserver();
	}
}
