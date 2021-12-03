/*  Wing Hin Shih (Daniel) 2586897
            22/11/2021             */

import java.util.ArrayList;
import java.util.Collections;

public class Fruit {
    public static void main(String[] args) {
        // Create array fruitsArray
        String[] fruitsArray = {"bananas", "apples", "pears", "oranges"};
        // Create empty arrayList fruitsList
        ArrayList fruitsList = new ArrayList();
        // For loop to save items from array to arrayList
        for (String fruit : fruitsArray) {
            fruitsList.add(fruit);
        }
        // Add strawberries and grapes
        fruitsList.add("strawberries");
        fruitsList.add("grapes");
        // Get index of apples, replace with watermelon
        fruitsList.set(fruitsList.indexOf("apples"), "watermelon");
        // Print arrayList before sorting
        System.out.println("List before sort: " + fruitsList);
        // Sort arrayList
        Collections.sort(fruitsList);
        // Print arrayList after sorting
        System.out.println("List after sort: " + fruitsList);
    }
}

/* Code output

List before sort: [bananas, watermelon, pears, oranges, strawberries, grapes]
List after sort: [bananas, grapes, oranges, pears, strawberries, watermelon]

 */