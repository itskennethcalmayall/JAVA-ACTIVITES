package cage.java;

public class mycage {
	
	private int length;
	private int width;
	private int height;
	private boolean clean;
	private boolean covered;
	
	public void Cage() {
	}
	
public void Cage (int length , int width , int height , boolean clean, boolean covered) {
	    
	   this.length = length;
	   this.width = width;
	   this.height = height;
	   this.clean = clean;
	   this.covered = covered;
	   
}
      //Length
  public void setlength(int length) {
  this.length = length;	  
     }
     //width
  public void setwidth(int width) {
  this.width = width;
     }
    //height
  public void setheight(int height) {
  this.height = height;	  
  }
   //clean
  public void setclean(boolean clean) {
  this.clean = clean;	  
  }
   //covered
  public void setCovered(boolean covered) {
  this.covered = covered;
  }
  
  public int getlength() {
   return length;
  }
  
  public int getwidth() {
   return width;  
  }
  
  public int getheight() {
   return height;
  }
  
  public boolean getclean() {
  return clean;
  }
  
  public boolean getcovered( ) {
  return covered;	  
  }

}//End of class
