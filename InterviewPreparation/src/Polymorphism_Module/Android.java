package Polymorphism_Module;
//Runtime Polymorphsim
public class Android extends Mobile{

	public Android(double price) {
		super(price);
		// TODO Auto-generated constructor stub
	}
	public void calculateMobilePrice() {
		System.out.println("Android Mobile cost is :"+getPrice());
	}

}
