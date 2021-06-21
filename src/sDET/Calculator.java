package sDET;

public class Calculator {
	
	public static int add(int num1, int num2) {
		
		return num1 + num2;
	}
	
	public static int subtract(int num1, int num2) {
		
		if(num1 > num2) {
			return num1 - num2;
		} else {
			return num2 - num1;
		}
	}
	
	public static int multiply(int num1, int num2) {
		return (num1*num2);
	}
	
	public static int divide(int num1, int num2) {
		if(num1 > num2) {
			return num1/num2;
		} else {
			return num2/num1;
		}
	}

	public static void main(String[] args) {
		
		System.out.println(Calculator.divide(15, 45));
	}

}
