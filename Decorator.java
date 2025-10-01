package structural.decorator;

public class Decorator {
	 public static void main(String[] args) {
	        Text msg = () -> "hello";
	        Text decorated = () -> msg.format().toUpperCase() + "!";
	        System.out.println(decorated.format());
	    }
}




