import java.util.Scanner;

/**
 * Write a description of class DivisibleusingNestedif here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DivisibleusingNestedif
{
    public static void main(String[] args){
     Scanner reader= new Scanner(System.in);
      System.out.println("Enter a number");
       int num=reader.nextInt();
       if(num % 3==0){
          if(num % 5==0){
               System.out.println(num +" is divisible by both 3 and 5");
          }else{
              System.out.println(num +" is divisible by 3 but not by 5");
            }
       }else{
         if(num % 5==0){
              System.out.println(num +" is divisible by 5 but not by 3");
         }else{
              System.out.println(num +" is not divisible by both 3 and 5");
         }
       }
  }
 }
