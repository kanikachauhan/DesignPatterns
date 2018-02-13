package creational.observerPattern;

public class GrabStock {

	public static void main(String[] args){
		StockGrabber stockGrabber = new StockGrabber();
		StockObserver observer1 = new StockObserver(stockGrabber);
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAPPPrice(677.00);
		stockGrabber.setGooglePrice(506.00);
		stockGrabber.unregister(observer1);
		StockObserver observer2 = new StockObserver(stockGrabber);
		stockGrabber.setIBMPrice(127.00);
		stockGrabber.setAPPPrice(117.00);
		stockGrabber.setGooglePrice(106.00);
		
		Runnable getIbM = new GetTheStock(stockGrabber, 1, "IBM", 197.00);
		Runnable getApp= new GetTheStock(stockGrabber, 1, "APPL", 197.00);
		Runnable getGoogl = new GetTheStock(stockGrabber, 1, "GOOG", 197.00);
		new Thread(getIbM).start();
		new Thread(getApp).start();
		new Thread(getGoogl).start();
	}
}
