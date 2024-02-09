package Encapsulation_Module;

public class Dog {

	private String Dog_Name;
	private String Dog_color;
	private int  Dog_age;
	private String Dog_breed;
	// Know I have encapsulated the data by using getter and setter
	public String getDog_Name() {
		return Dog_Name;
	}
	public void setDog_Name(String dog_Name) {
		Dog_Name = dog_Name;
	}
	public String getDog_color() {
		return Dog_color;
	}
	public void setDog_color(String dog_color) {
		Dog_color = dog_color;
	}
	public int getDog_age() {
		return Dog_age;
	}
	public void setDog_age(int dog_age) {
		
		Dog_age = dog_age;
		
	}
	public String getDog_breed() {
		return Dog_breed;
	}
	public void setDog_breed(String dog_breed) {
		Dog_breed = dog_breed;
	}
	
	
	
}
