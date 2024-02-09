package Inheritance_Module;
// This is a single level inheritance 
 class Doctor{
	int salary=10000;
	String Doctor_ID="DOC121";
	
}
 class Sergon extends Doctor{
	 int bonous=4500;
	 
 }

public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sergon ser=new Sergon();
		System.out.println("The salary of sergon with bonousis:"+(ser.salary+ser.bonous));

	}

}
