package Polymorphism_Module;
//Runtime polymorphsim
public class Iphone extends Mobile {

	public Iphone(double price) {
		super(price);
		// TODO Auto-generated constructor stub
	}
	public void calculateMobilePrice() {
		System.out.println("Iphone mobile cost is"+getPrice()*20);
	}

}
