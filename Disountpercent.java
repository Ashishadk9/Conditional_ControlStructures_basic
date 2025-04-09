import java.util.Scanner;

/**
 * Write a description of class Disountpercent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Disountpercent
{
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float markedPrice; 
        char category;     
        float discount = 0; 
        float sellingPrice; 
         System.out.print("Enter the marked price of the item: ");
        markedPrice = scanner.nextFloat();
         System.out.print("Enter the category of the item (A/B/C/D): ");
        category = scanner.next().charAt(0);
        if (category == 'A' || category == 'a') {
            discount = 60; 
        } else if (category == 'B' || category == 'b') {
            discount = 40; 
        } else if (category == 'C' || category == 'c') {
            discount = 20; 
        } else if (category == 'D' || category == 'd') {
            discount = 10; 
        } else {
            System.out.println("Invalid category entered. Please enter A, B, C, or D.");
            return; 
        }
        sellingPrice = markedPrice - (markedPrice * discount / 100);
          System.out.println("The selling price of the item is" + sellingPrice);
    } 
}