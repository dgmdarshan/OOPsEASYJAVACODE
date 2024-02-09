package Encapsulation_Module;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dogobj=new Dog();
		dogobj.setDog_Name("Tommy");
		dogobj.setDog_color("Brown");
		dogobj.setDog_breed("German Shepeard");
		dogobj.setDog_age(4);
		System.out.println("DOG NAME:"+dogobj.getDog_Name());
		System.out.println("DOG COLOR:"+dogobj.getDog_color());
		System.out.println("DOG BREED:"+dogobj.getDog_breed());
		System.out.println("Dog AGE:"+dogobj.getDog_age());
		
	}

}
