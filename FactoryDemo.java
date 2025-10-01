package creational.factory;

public class FactoryDemo {
	 public static void main(String[] args) {
	        Shape circle = () -> System.out.println("Drawing Circle");
	        Shape square = () -> System.out.println("Drawing Square");
	        circle.draw();
	        square.draw();
	    }
	}





	