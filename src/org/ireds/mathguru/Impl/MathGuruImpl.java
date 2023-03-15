/**
 * This class implements the MathGuruIfc interface and provides methods to calculate the MCD
 * (maximum common divisor) and MCM (minimum common multiple) of two integers.
 * 
 * @author Gianluigi Rossi
 * @version 1.0
 * @since 2023-03-11
 */

package org.ireds.mathguru.Impl;

import org.ireds.mathguru.ifc.MathGuruIfc;

public class MathGuruImpl implements MathGuruIfc {

	private int num1;
	private int num2;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	@Override
	public String toString() {
		return "MathGuruImpl [num1=" + num1 + ", num2=" + num2 + "]";
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public MathGuruImpl(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public MathGuruImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calculateMCD(int num1, int num2) {
		// TODO Auto-generated method stub
		// Ensure that num1 is the larger number
		if (num2 > num1) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		// Apply the Euclidean algorithm to find the MCD
		while (num2 != 0) {
			int remainder = num1 % num2;
			num1 = num2;
			num2 = remainder;
		}
		// The MCD is the last non-zero remainder
		return num1;
	}

	@Override
	public int calculateMCM(int x, int y) {
		/*
		 * The Euclidean algorithm cannot be used to directly calculate the least common
		 * multiple (LCM) of two numbers. However, the following formula can be used to
		 * calculate the LCM based on their MCD: LCM(x, y) = |x * y| / MCD(x, y)
		 * 
		 */		 
		int mcd = calculateMCD(x, y);
		return Math.abs(x * y) / mcd;
		
	}

	@Override
	public void anglesAddition(Angle angle1, Angle angle2) {
		// TODO Auto-generated method stub
		

        System.out.println("First angle:");
        System.out.println(angle1.toString());
        System.out.println("Second angle:");
        System.out.println(angle2.toString());
        
        int totalSeconds = (angle1.getSeconds() + angle2.getSeconds()) % 60;
        int extraMinutes = (angle1.getSeconds() + angle2.getSeconds()) / 60;

        int totalMinutes = (angle1.getMinutes() + angle2.getMinutes() + extraMinutes) % 60;
        int extraDegrees = (angle1.getMinutes() + angle2.getMinutes() + extraMinutes) / 60;

        int totalDegrees = angle1.getDegrees() + angle2.getDegrees() + extraDegrees;

        System.out.println("The sum of the two angles is:");
        System.out.printf("%d° %d' %d''", totalDegrees, totalMinutes, totalSeconds);
        
	}

}
