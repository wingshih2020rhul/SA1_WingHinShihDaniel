/*  Wing Hin Shih (Daniel) 2586897
            22/11/2021             */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Initialise input scanner
        Scanner sc = new Scanner(System.in);
        // Prompt for input number x
        System.out.println("Please enter x: ");
        // Accept number input as x
        double x = sc.nextDouble();
        // Prompt for input number y
        System.out.println("Please enter y: ");
        // Accept number input as y
        double y = sc.nextDouble();
        // Initialise variable z
        double z;
        // If x greater than y
        if (x > y)
            //assign x to z
            z = x;
            // If x less than y
        else
            //assign y to z
            z = y;
        // Print result of z
        System.out.println("The result is " + z);
    }
}

// The program gets two numbers from the user and prints the larger number of the two.

/* Example output

Please enter x:
1
Please enter y:
2
The result is 2.0

 */