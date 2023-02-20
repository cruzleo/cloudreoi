package org.ssglobal.training.codes.itemF;

public class Fraction {
	public short numerator;
	public short denominator; 
	
	public short getDenominator() {
		return denominator;
	}
	
	public short getNumerator() {
		return numerator;
	}
	
	public void printRational() {
		System.out.println(numerator + "/" + denominator);
	}
	
	public Fraction(int numerator, int denominator) {
		this.numerator = (short) numerator;
		this.denominator = (short) denominator;
	}
	
	public Fraction add(Fraction summand) {
		short num = 0;
		short denom = 0;
		
		num = (short) (numerator * summand.getDenominator() 
				       + summand.getNumerator() * denominator);
		denom = (short) (denominator * summand.getDenominator());
		return new Fraction(num, denom);			
	}
	
	public Fraction multiply(Fraction factor) {
		short num = 0;
		short denom = 0;
		
		num =  (short) (numerator * factor.getNumerator());
		denom = (short) (denominator * factor.getDenominator());
		return new Fraction(num, denom);
	}
	
	public String greaterEqual(Fraction comp) {
		float f1 = 0;
		float f2 = 0;
		
		f1 = (float) (comp.getNumerator() / comp.getDenominator());
		f2 = (float) (numerator / denominator);
		if (f2 >= f1) {
			return "f2 : " + numerator + "/" + denominator + " is higher";
		} else {
			return "f1 : " + comp.getNumerator() + "/" 
					       + comp.getDenominator() + " is higher";
		}
	}
}
