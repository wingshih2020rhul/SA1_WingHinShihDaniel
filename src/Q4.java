/*  Wing Hin Shih (Daniel) 2586897
            22/11/2021             */

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // Initialise input scanner
        Scanner sc = new Scanner(System.in);
        // Initialise array of length 5
        int[] arr = {0, 0, 0, 0, 0};
        // For loop to ask user for 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        // Initialise counter for while loop
        int i = 0;
        // Flag for number 6 check
        boolean num6 = false;
        // While loop to find if number 6 is in array
        while (i < arr.length) {
            if (arr[i] == 6) {
                num6 = true;
                break;
            }
            i++;
        }
        // Output appropriate text based on num6 flag
        System.out.println("Number 6 " + (num6 ? "is" : "isn't") + " in the array.");
    }
}

/* Example output

Enter number 1: 1
Enter number 2: 2
Enter number 3: 3
Enter number 4: 4
Enter number 5: 5
Number 6 isn't in the array.

Enter number 1: 6
Enter number 2: 5
Enter number 3: 4
Enter number 4: 3
Enter number 5: 2
Number 6 is in the array.

 */
