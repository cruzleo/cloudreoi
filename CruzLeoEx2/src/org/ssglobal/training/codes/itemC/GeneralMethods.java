package org.ssglobal.training.codes.itemC;

public class GeneralMethods {
	public void powersOfTwo() {
		byte length = 11;
		byte counter = 2;
		short power = 2;
		
		while (counter <= length) {
			power = (short) (2 * power); 
			System.out.println("2" + "^" + counter + " = "+ power);
			counter++;
		}
	}
	
	public void alarm(int num) {
		for (int counter = 1; counter <= num; counter++) {
			System.out.println("Alarm!");
		}
	}
	
	public int sum100() {
		byte length = 100;
		byte counter = 1;
		int sum = 0;
		
		while (counter <= length) {
			sum = sum + counter;
			counter++;
		}
		return sum;
	}
	
	public void sumRange(int num1, int num2) {
		if (num1 < num2) {
			int sum = 0;
			
			for (int counter = 1; counter <= num1; counter++) {
				sum = sum + counter;
			}
			System.out.println(sum); 
			
		} else {
			System.out.println("num1 is larger than num2"); 
		}
	}
	
	public int maxOfTwo(int num1, int num2) {
		int largerNum = (num1 > num2) ? num1: num2;
		return largerNum;
	}
 
	public boolean larger(double num1, double num2) {
		boolean largerDbl = (num1 > num2) ? true : false;
		return largerDbl;
	}
	
	public boolean evenlyDivisible(int num1, int num2) {
		boolean divide = (num1 % num2 == 0) ? true: false;
		return divide;
	}
}
