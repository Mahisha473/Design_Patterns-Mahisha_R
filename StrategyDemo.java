package behavioral.strategy;

public class StrategyDemo {
	 public static void main(String[] args) {
	        PaymentStrategy paypal = amt -> System.out.println("Pay $" + amt + " via PayPal");
	        PaymentStrategy card = amt -> System.out.println("Pay $" + amt + " via Credit Card");
	        paypal.pay(100);
	        card.pay(200);
	    }
}
