package Polymorphism_Module;

public class Shapes {
	public void area(String Circle) {
		System.out.println("Circle");
	}
	public void area(String Circle,String Triangle ) {
		System.out.println("Circle and Triangle");
	}
	public void area(String Circle,String Triangle , String Square) {
		System.out.println("Circle,Triangle and Square");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes s=new Shapes();
		s.area("Circle");
		s.area("Circle","triangle");
		s.area("Circle", "triangle", "square");

	}

}
