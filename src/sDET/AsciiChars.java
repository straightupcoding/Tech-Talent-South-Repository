package sDET;

import java.util.Random;
import java.util.Scanner;

public class AsciiChars 

{
	

	
  public static void printNumbers()
  {
	int[] asciiNums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	int i;
    for (i = 0; i < asciiNums.length; i++) {
    	System.out.println(asciiNums[i]);
    }
  }

  public static void printLowerCase()
  {
	int i;
	char[] asciiLowerCase = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	for (i = 0; i < asciiLowerCase.length; i++) {
	    System.out.println(asciiLowerCase[i]);
	    }
  }

  public static void printUpperCase()
  {
	int i;
	char[] asciiUpperCase = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	for (i = 0; i < asciiUpperCase.length; i++) {
	    System.out.println(asciiUpperCase[i]);
	    }
  }
  
  public static void artificialInteraction() {
	  Scanner scanner = new Scanner(System.in);
	  System.out.print("Please enter your name \n");
	  String playerName = scanner.next();
	  System.out.println("Hello " + playerName);
	  System.out.println("Would you like to continue to the interactive portion?");
	  String yorYes = scanner.next();
	  
	  	if (yorYes.equals("y") || yorYes.equals("yes"))  {
	  		System.out.println("Ok! \n");
	  		System.out.println("Do you have a red car? (yes, no): \n");
	  		String redCar = scanner.next();
	  		System.out.println("\n");
	  		System.out.println("What is the name of your favorite pet? \n");
	  		String favoritePet = scanner.next();
	  		System.out.println("\n");
	  		System.out.println("What is the age of your favorite pet? \n");
	  		int favoritePetAge = scanner.nextInt();
	  		System.out.println("\n");
	  		System.out.println("What is your lucky number? \n");
	  		int luckyNumber = scanner.nextInt();
	  		System.out.println("\n");
	  		System.out.println("What is the jersey number for your favorite quarterback? \n");
	  		int favoriteQB = scanner.nextInt();
	  		System.out.println("\n");
	  		System.out.println("What is the two-digit model year of your car? \n");
	  		int modelYear = scanner.nextInt();
	  		System.out.println("\n");
	  		System.out.println("What is the first name of your favorite actor or actress? \n");
	  		String favoriteStar = scanner.next();
	  		System.out.println("\n");
	  		System.out.println("Enter a random number between 1 and 50 \n");
	  		int between1and50 = scanner.nextInt();
	  		System.out.println("\n");
	  		
	  		Random randNum = new Random();
	  		int magicRandomNumber = 0;
	  		
	  		int random1 = randNum.nextInt(50);
	  		int random2 = randNum.nextInt(50);
	  		int random3 = randNum.nextInt(50);
	  		if((randNum.nextInt(2) == 1) && (favoriteQB != 0)) {
	  			magicRandomNumber = favoriteQB * random1;
	  		} else {
	  			magicRandomNumber = luckyNumber * random1;
	  		} 
	  		if(magicRandomNumber > 75) {
	  			magicRandomNumber = magicRandomNumber - 75;
	  		}
	  		int numeroUno, numeroDos, numeroTres, numeroQuatro, numeroCinco;
	  		
	  		numeroUno = modelYear + luckyNumber;
	  		if(numeroUno > 65)
	  			numeroUno = numeroUno - 65;
	  		if(numeroUno < 1)
	  			numeroUno = numeroUno + 65;
	  		numeroDos = random2 - randNum.nextInt(50);
	  		if (numeroDos > 65)
	  			numeroDos = numeroDos - 65;
	  		if (numeroDos < 1)
	  			numeroDos = numeroDos + 65;
	  		numeroTres = 42;
	  		numeroQuatro =  favoritePetAge + modelYear;
	  		if (numeroQuatro > 65)
	  			numeroQuatro = numeroQuatro - 65;
	  		if (numeroQuatro < 1)
	  			numeroQuatro = numeroQuatro + 65;
	  		numeroCinco = (int)favoriteStar.charAt(0);
	  		if (numeroCinco > 65) 
	  			numeroCinco = numeroCinco - 65;
	  		if (numeroCinco < 1)
	  			numeroCinco = numeroCinco + 65;
	  		System.out.print("\nLottery numbers : ");
            System.out.print(numeroUno+", ");
            System.out.print(numeroDos+", ");
            System.out.print(numeroTres+", ");
            System.out.print(numeroQuatro+", ");
            System.out.print(numeroCinco+", ");
            System.out.print(" Magic ball: "+ magicRandomNumber);
            System.out.println("\n");
            System.out.println("Would you like to generate another set of numbers?");
            String anotherRound = scanner.next();
            
            if (anotherRound.equals("yes")) {
            	return;
            }
 	  	} else {
	  		System.out.println("Please return later to complete the survey.");
	  	}
  }
  
  public static void main(String[] args) {
	  AsciiChars.printNumbers();
	  AsciiChars.printUpperCase();
	  AsciiChars.printLowerCase();
	  System.out.print("Hello World \n");
	  AsciiChars.artificialInteraction();
}
  
}