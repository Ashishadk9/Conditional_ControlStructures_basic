import java.util.Scanner;

/**
 * Write a description of class DisountCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DisountCalculator
{
  public static void main(String[] args){
   Scanner input=new Scanner(System.in);
    System.out.println("Enter the marked price");
     float markedprice=input.nextFloat();//the category of the item(a,b,c,d)
      System.out.println("Enter the category of the item(A,B,C,orD)");
       char category=input.next().toUpperCase().charAt(0);//uppercase for easy comparison
    //let calculate the discount percentage & selling price
    float discountPercentage=0.0f;
     float sellingPrice;
   switch(category){
    case 'A':
     discountPercentage=0.60f;
     break;
    case 'B':
     discountPercentage=0.40f;
     break;
    case 'C':
     discountPercentage=0.20f; 
     break;
    case 'D':
     discountPercentage=0.10f; 
     break;
    default:
     System.out.println("Invalid category.no discount");
     discountPercentage=0.0f;
   }
   //Calculate the selling price
   sellingPrice=markedprice-(markedprice*discountPercentage);
   //Display the selling price to the user
    System.out.println("Selling price of the item"+ sellingPrice);
  }
}
