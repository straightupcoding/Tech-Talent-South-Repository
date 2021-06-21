package sDET;

import java.util.Scanner;

public class Arrays {
	//1.  Write a program to sum all the values of a given Array in Java.
	public static int sumArrayValues(int [] array) {
		int total = 0;
		for(int i = 0; i < array.length; i++) {
			total += array[i];
		}
		System.out.println(total);
		return total;
	}
	//3.Write a public static method called "toPower" that takes in as param....
	public static int[] toPower(int arraySize, int nthpower) {
		int[] ar = new int[arraySize];
		
		for(int i=0; i < arraySize; i++) {
			ar[i] = (int)(Math.pow(i, nthpower));
			
			
		}
		return ar;
		
	}
	
	
	public static void main(String[] args) {
		//1.  Write a program to sum all the values of a given Array in Java.
		int[] addThese = {1, 2, 3};
		Arrays.sumArrayValues(addThese);
		//2.  What is the output? - The output is 2 
		  double[ ] exampleArray = {1,5,6,5,4,1};

          double maximum = exampleArray[0];

          int index = 0;

          for (int i = 1; i<exampleArray.length; i++){

               if (exampleArray[ i ] > maximum) {

                    maximum = exampleArray[ i ];

                    index = i;

               }

          }

          System.out.println(index);
          
        //3.Write a public static method called "toPower" that takes in as param....
          Scanner input = new Scanner(System.in);
          System.out.println("Enter a number for the array size.");
          int size = input.nextInt();
          System.out.println("Enter a number for the array power.");
          int power = input.nextInt();
          
          int[] result = toPower(size, power);
          for(int i = 0; i < size; i++)
        	  System.out.println(result[i] + " ");
	}

}
