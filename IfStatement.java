package Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ifstatement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String num = "";
		BufferedReader myReader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the a number:");
		num = myReader.readLine();
		
		int myNum = Integer.parseInt(num);
		
		         if(myNum>=100) {
		        	 System.out.print("myNum + is greater than or equal to 100");
		         }//end of if

	}// end of main method

}// end of the class
