package zooanimal;

public class Zooanimal {

	
	private int age;
	private boolean hungry;
	
	public Zooanimal(String name, String type, int age,boolean hungry) {
		
		this.name = name;
		this.type = type;
		this.age = age;
		this.hungry = hungry;
	}
	   
	public void SetName(String name) {
	this.name = name;
	}
	
	public void setType(String type) {
	this.type = type;
	}
	
	public void setAge(int age) {
	this.age = age;
	}
	
	public void ishungry(boolean hungry) {
	this.hungry = hungry;
	}
	
	public String getName() {
	  return name;
	}
	
	public String getType {
	  return type;
	}
	
	public int getage() {
		return age;
	}
	
	public boolean gethungry() {
		return hungry;
	}
	
	public void issleep() {
		System.out.println("The Animal is sleeping");
	}
	public void eat() {
System.out.println("The animal is Eating");
System.out.println("Is eating" + myFirstAnimal.iseating());
	}
	
}
	 
	}
}//end of class
