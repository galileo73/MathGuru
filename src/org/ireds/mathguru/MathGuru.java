/**
 * MathGuru is a class that provides methods to perform mathematical operations.
 * This class allows the user to calculate the MCD of two numbers using the Euclid algorithm.
 * 
 * @author Gianluigi Rossi
 * @version 1.0
 * @since 2023-03-11
 */

package org.ireds.mathguru;

import java.util.Scanner;

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
		//Instance the MathGuruImpl class
	    final MathGuruIfc mathGuruInf; 
        
        int num1 = 0;
	    int num2 = 0;
	    
	    mathGuruInf = new MathGuruImpl();
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter first number: ");
                num1 = scanner.nextInt();

                System.out.print("Enter second number: ");
                num2 = scanner.nextInt();

                if (num1 == 0 || num2 == 0) {
                    throw new IllegalArgumentException("Numbers cannot be zero!");
                }

                validInput = true;
            } catch (Exception e) {
                System.out.println("Invalid input: " + e.getMessage() + " Please try again.");
                scanner.nextLine(); // clear input buffer
            }
        }
        
        System.out.println("You entered " + num1 + " and " + num2);
        System.out.println("Choose an option:");
        System.out.println("1. Calculate MCD");
        System.out.println("2. Calculate LCM");
        
        int choice = 0;
        validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();

                if (choice < 1 || choice > 2) {
                    throw new IllegalArgumentException("Invalid choice!");
                }

                validInput = true;
            } catch (Exception e) {
                System.out.println("Invalid input: " + e.getMessage() + " Please try again.");
                scanner.nextLine(); // clear input buffer
            }
        }
        scanner.close();
        
        switch (choice) {
        case 1:
            int mcd = mathGuruInf.calculateMCD(num1, num2);
            System.out.println("The MCD of " + num1 + " and " + num2 + " is " + mcd);
            break;
        case 2:
            int lcm = mathGuruInf.calculateMCM(num1, num2);
            System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm);
            break;
        default:
            System.out.println("Invalid choice!");
            break;
    }
	}
}
