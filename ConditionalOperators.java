package Java;

public class ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x = 5;
       int y = 10;
       int z = 21;

       System.out.println("CONDITIONAL AND &&");
       System.out.println((x>=y&&(z<=y)));
       System.out.println((z>=x&&(x<=y)));
       System.out.println((z>=x&&(y>=z)));
       System.out.println((z==x&&(y<z)));
       
	}// end of main method

}// end of class
