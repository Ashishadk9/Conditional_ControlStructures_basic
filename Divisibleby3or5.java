import java.util.Scanner;

/**
 * Write a description of class Divisibleby3or5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Divisibleby3or5
{
    public static void main(String[] args){
        
        Scanner reader =new Scanner(System.in);
        System.out.println("Enter a number");
        int num = reader.nextInt();
     if(num % 3==0 && num % 5==0){
           System.out.println(num +"is divisible by both 3 and 5");
     }else{
    
           System.out.println(num +"is not divisible by both 3 and 5");
    }
  }
}