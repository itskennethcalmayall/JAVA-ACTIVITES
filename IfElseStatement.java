package Java;
import java.io.*;
public class Ifelsestatementz {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		String num = "";
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the a number");
		num = myReader.readLine();
		
		int myNum = Integer.parseInt(num);
		
		      if(myNum>100) {
		    	    System.out.println(myNum + " is greater than or equal to 100");
		      }else{	  
		    	    System.out.println(myNum + "is below 100");
		    	    
		      }//end of if else statement
		

	}// end of main method

}// end of main class
