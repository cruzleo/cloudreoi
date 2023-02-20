package org.ssglobal.training.codes.itemA;

public class BadNews {
	public static int maxOdd = 21;
	
	public static void writeOdds() {
		
		// print each odd number
		for (int count = 1; count <= (maxOdd - 1); count++) {
			System.out.print(count + " ");
			count++;
		}
		
		//print the last odd number
		System.out.println(maxOdd);
	}
	
	public static void main(String[] args) {
		// write all odds up to 21
		writeOdds();
		
		// now, write all odds up to 11
		maxOdd = 11;
		writeOdds();
	}
}
