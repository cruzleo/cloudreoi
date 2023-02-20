package org.ssglobal.training.codes.itemC;

public class TestGeneralMethods {

	public static void main(String[] args) {
		GeneralMethods gm = new GeneralMethods();
		gm.powersOfTwo();
		gm.alarm(5);
		System.out.println(gm.sum100());
		gm.sumRange(5, 10);
		System.out.println(gm.maxOfTwo(20, 10));
		System.out.println(gm.larger(10.4, 6.5));
		System.out.println(gm.evenlyDivisible(10, 5));

	}

}
