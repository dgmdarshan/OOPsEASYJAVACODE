package Polymorphism_Module;
//Runtime Polymorphsim
import Polymorphism_Module.Android;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mobile=null;
		Android a=new Android(2000);
		Iphone i=new Iphone(3000);
		
		mobile=a;
		mobile.calculateMobileprice();
		mobile=i;
		mobile.calculateMobileprice();
		System.out.println();
		

	}

}
