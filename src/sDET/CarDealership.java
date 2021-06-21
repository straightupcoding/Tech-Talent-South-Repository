package sDET;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CarDealership {

	public static void main(String[] args) {
		
		HashMap<String, ArrayList<Integer>> automobiles = new HashMap<String, ArrayList<Integer>>();
		
		automobiles.put("CyberTruck", new ArrayList<Integer>(Arrays.asList(2005, 2010, 2015)));
		automobiles.put("Corvette", new ArrayList<Integer>(Arrays.asList(2005, 2010, 2015)));
	    automobiles.put("Hummer", new ArrayList<Integer>(Arrays.asList(2005, 2010, 2015)));
	    
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a car");
	    String input = scan.nextLine();
	    
	    if (automobiles.containsKey(input)) {
	    	System.out.println("So, your in the market for a " + input + "?");
	    	
	    	ArrayList<Integer> list1 = automobiles.get(input);
	    	
	    	for(Integer manufacturedBy : list1) {
	    		System.out.println(input + manufacturedBy);
	    	}
	    } else {
	    	System.out.println("We do not have any of the " + input +"s");
	    }
	}

}
