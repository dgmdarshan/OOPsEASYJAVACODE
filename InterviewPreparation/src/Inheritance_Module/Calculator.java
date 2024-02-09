package Inheritance_Module;
//This is the multi-level inheritance
class Addition{
	public void add(int a,int b) {
		System.out.println("The addition of the two number is :"+(a+b));
	}
}
class Subtraction  extends Addition{
	public void sub(int a , int b) {
		System.out.println("The Subtraction of given two number is :"+(a-b));
	}
}
class Multiplication extends Subtraction{
	public void mul(int a,int b) {
		System.out.println("The multiplication of the given two number is :"+(a*b));
	}
}
class Division extends Multiplication {
	public void div(int a ,int b) {
		try {
			System.out.println("The Division of given two number is :"+(a/b));
		}
		catch (Exception e) {
			System.out.println("The given number cannot be divisible its goes to infinity");
		}
	}
	public void CallAllMethods() {
		add(7,8);
		sub(7,3);
		mul(4,9);
		div(4,0);
	}
}


public class Calculator extends Division{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Division divobj=new Division();
		divobj.CallAllMethods();

	}

}
