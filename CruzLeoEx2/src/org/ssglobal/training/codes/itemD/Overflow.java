package org.ssglobal.training.codes.itemD;

public class Overflow {
	public static boolean sumOverflow(byte x, byte y) {
		int sum = 0;
		
		sum = x + y;
		boolean overflowCheck = ((sum > 127) || (sum < -128)) ? true: false;
		return overflowCheck;
	}
}
