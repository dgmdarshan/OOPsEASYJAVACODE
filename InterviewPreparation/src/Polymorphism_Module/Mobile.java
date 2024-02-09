package Polymorphism_Module;

//Mobile is a super class
public class Mobile {

	private double price;
	//Method Overriding or RunTime Polymorphism
//need to initialize in constructor
	public Mobile(double price) {
		super();
		// TODO Auto-generated constructor stub
		this.price=price;
	}

	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public void calculateMobileprice() {
		
		
	}
	
}
