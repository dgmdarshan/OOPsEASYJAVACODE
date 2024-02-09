package Inheritance_Module;
//By using interface concept we can implement the multiple inhertitance 
interface A{
	public void Show() ;
}
interface B{
	public void Show() ;
}
public class ByUsingInterfaceConcept implements A,B{
	
	@Override
	public void Show() {
		// TODO Auto-generated method stub
		System.out.println("Show the methods are invoked");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ByUsingInterfaceConcept multiple=new ByUsingInterfaceConcept();
		multiple.Show();
		
	
	
	}



}
