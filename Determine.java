import java.util.Scanner;

/**
 * Write a description of class Determine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Determine
{
    public static void main(String [] args){
        int a;
          Scanner reader =new Scanner(System.in); 
        System.out.println("Enter number");
         a=reader.nextInt();
         if(a>0){
             System.out.println(a +"is positive");
         }else if(a<0){
             System.out.println(a +"is negative");
         }else {
             System.out.println(a +"is Zero");
         }
        
    }
}
