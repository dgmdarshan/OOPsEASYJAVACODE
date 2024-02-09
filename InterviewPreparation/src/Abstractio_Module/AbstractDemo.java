package Abstractio_Module;
// In abstraction the abstraction applies for classes and methods

abstract class Bike{
	abstract void run() ;
	
}
class Honda extends Bike{
	public void run() {
		System.out.println("Honda bike is running");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Honda honda=new Honda();
		honda.run();
	}

}
