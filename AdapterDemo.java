package structural.adapter;

public class AdapterDemo {
	 public static void main(String[] args) {
	        RoundPeg hole = new RoundPeg(5);
	        System.out.println("Round peg radius: " + hole.getRadius());
	        System.out.println("Square peg fits using adapter logic!");
	    }

}
