/**
 * MathGuru is a class that provides methods to perform mathematical operations.
 * This class allows the user to calculate the MCD or LCM of two numbers using the Euclid algorithm
 * and operations with Angles(Degrees, Minutes, Seconds).
 * 
 * @author Gianluigi Rossi
 * @version 1.0
 * @since 2023-03-11
 */

package org.ireds.mathguru;

import java.util.Scanner;

import org.ireds.mathguru.Impl.Angle;
import org.ireds.mathguru.Impl.MathGuruImpl;
import org.ireds.mathguru.ifc.MathGuruIfc;

/**
 * This is the main class that provides a console interface to calculate MCD and
 * mcm of two integers using the MathGuru library.
 */

public class MathGuru {

	/**
	 * This is the main method that reads two integers from console, validates the
	 * input, and calculates their MCD and mcm using the MathGuru library.
	 * 
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		final MathGuruIfc mathGuruInf = new MathGuruImpl();

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter your choice: ");
			System.out.println("1. Calculate MCD or LCM of two numbers");
			System.out.println("2. Sum of two Angles (Degrees, Minutes, Seconds)");
			int mainChoice = scanner.nextInt();

			switch (mainChoice) {
			case 1:
				System.out.print("Enter first number: ");
				int num1 = scanner.nextInt();

				System.out.print("Enter second number: ");
				int num2 = scanner.nextInt();

				if (num1 == 0 || num2 == 0) {
					throw new IllegalArgumentException("Numbers cannot be zero!");
				}

				System.out.println("You entered " + num1 + " and " + num2);
				System.out.println("Choose an option:");
				System.out.println("1. Calculate MCD");
				System.out.println("2. Calculate LCM");
				int choiceNum = scanner.nextInt();

				switch (choiceNum) {
				case 1:
					int mcd = mathGuruInf.calculateMCD(num1, num2);
					System.out.println("The MCD of " + num1 + " and " + num2 + " is " + mcd);
					break;
				case 2:
					int lcm = mathGuruInf.calculateMCM(num1, num2);
					System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);
					break;
				default:
					throw new IllegalArgumentException("Invalid choice!");
				}
				break;
			case 2:
				System.out.println("Enter first angle:");
				System.out.print("Degrees: ");
				int degrees1 = scanner.nextInt();
				System.out.print("Minutes: ");
				int minutes1 = scanner.nextInt();
				System.out.print("Seconds: ");
				int seconds1 = scanner.nextInt();

				System.out.println("Enter second angle:");
				System.out.print("Degrees: ");
				int degrees2 = scanner.nextInt();
				System.out.print("Minutes: ");
				int minutes2 = scanner.nextInt();
				System.out.print("Seconds: ");
				int seconds2 = scanner.nextInt();

				Angle angle1 = new Angle(degrees1, minutes1, seconds1);
				Angle angle2 = new Angle(degrees2, minutes2, seconds2);
				mathGuruInf.anglesAddition(angle1, angle2);
				break;
			default:
				throw new IllegalArgumentException("Invalid choice!");
			}
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
