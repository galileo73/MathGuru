/**
 * MathGuruIfc is An interface for calculating MCD (Maximum Common Divisor) and MCM (Minimum Common Multiple).
 * 
 * @author Gianluigi Rossi
 * @version 1.0
 * @since 2023-03-11
 */
package org.ireds.mathguru.ifc;

import org.ireds.mathguru.Impl.Angle;

public interface MathGuruIfc {

	/**
	 * Calculates the MCD (Maximum Common Divisor) of two numbers.
	 * 
	 * @param num1 The first number.
	 * @param num2 The second number.
	 * @return The MCD of the two numbers.
	 */
	int calculateMCD(int num1, int num2);
	
	/**
	 * Calculates the MCM (Minimum Common Multiple) of two numbers.
	 * 
	 * @param num1 The first number.
	 * @param num2 The second number.
	 * @return The MCM of the two numbers.
	 */
	int calculateMCM(int num1, int num2);
	
	String anglesAddition(Angle angle);
	//String anglesSubtraction();
	//String anglesMultiplier();
	//String anglesDivision();
	
}
