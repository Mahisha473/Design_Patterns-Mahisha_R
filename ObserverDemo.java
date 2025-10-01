package behavioral.observer;
import java.util.ArrayList;
import java.util.List;

public class ObserverDemo {
	 public static void main(String[] args) {
	        List<Observer> observers = new ArrayList<>();
	        observers.add(msg -> System.out.println("Email: " + msg));
	        observers.add(msg -> System.out.println("SMS: " + msg));
	        observers.forEach(o -> o.update("New Assignment Posted!"));
	    }
}
