package sDET;

import java.util.ArrayList;
import java.util.Scanner;

public class LoopMapExercise {

	public static void main(String[] args) {
		//              #1
		ArrayList<Double> list = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter a number ");
			list.add(scan.nextDouble());
		}
		
		double sum = 0;
		double product = 1;
		double largest = list.get(0);
		double smallest = list.get(0);
		
		for (int i = 0; i < 5; i++) {
			sum += list.get(i);
			product *= list.get(i);
			largest = Math.max(largest,  list.get(i));
			smallest = Math.min(smallest, list.get(i));
		}
		System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);
        System.out.println("The largest is: " + largest);
        System.out.println("The smallest is: " + smallest);
		
	}

}
