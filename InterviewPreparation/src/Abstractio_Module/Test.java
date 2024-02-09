package Abstractio_Module;
// By default complier take the methods in the interface are abstract methods
interface A{
	void a();
	void b();
	void c();
	void d();
}
class B implements A{
	public void a() {
		System.out.println("I am A");
	}

	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("I am B");
	}

	@Override
	public void c() {
		// TODO Auto-generated method stub
		System.out.println("I am C");
	}

	@Override
	public void d() {
		// TODO Auto-generated method stub
		System.out.println("I am D");
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B();
		a.a();
		a.b();
		a.c();
		a.d();

	}

}
