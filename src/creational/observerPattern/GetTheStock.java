package creational.observerPattern;
import java.text.DecimalFormat;

public class GetTheStock implements Runnable{

	private int startTime;
	private String stock;
	private double price;
	private Subject stockGrabber;
	
	public GetTheStock(Subject stockGrabber,int startTime,String stock,double price){
		this.stockGrabber = stockGrabber;
		this.startTime = startTime;
		this.stock = stock;
		this.price = price;
	}
	@Override
	public void run() {
		for(int i=1;i<=20;i++){
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				
			}
			double randNum = (Math.random()*(0.06)) - 0.03;
			DecimalFormat df = new DecimalFormat("#.##");
			price = Double.valueOf(df.format(price+randNum));
			if(stock == "IBM"){
				((StockGrabber)stockGrabber).setIBMPrice(price);
			}
			if(stock == "APPL"){
				((StockGrabber)stockGrabber).setAPPPrice(price);
			}
			if(stock == "GOOG"){
				((StockGrabber)stockGrabber).setGooglePrice(price);
			}
			System.out.println(stock +": "+df.format(price+randNum)+ " "+df.format(randNum));
			System.out.println();
		}
	}

	
}
