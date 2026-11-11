package exception;

public class Exceptiondemo 
import java.util.InputMismatchException;
import java.util.Scanner;
public class DemoOnException
  public static void main(String[] args) {
  int number;
  Scanner myScanner = new Scanner(System.in);
  System.out.print("Enter a number");
  try {
  number = myScanner.nextInt();
  System.out.printIn(number);
  }catch (InputMismatchExeption e) {
	  System.out.println("Error; That is not a valid whole numner!");
	  
  }
 finally {
 myScanner.close();
   }// end of try catch
 }//end of main method
}//end of class

  











}
