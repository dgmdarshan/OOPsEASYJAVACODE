package Inheritance_Module;
//This code contains the hierachical inhertitance implementation main point is we want to use static keyword  for all classea which are inhertiting 
public class HierachicalInheritance {

	//Parent class
	static class Animal{
		 void eat() {
			System.out.println("Eating");
		}
	}
	//Child class 1
	static class Dog extends Animal{
		 void bark() {
			System.out.println("barking");
		}
	}
	//Child class 2
	static class Cat extends Animal{
		 void memo() {
			System.out.println("Memoing");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//In this inheritance the bark method can't be inherited because I have called only cat class object and the cat class inherit the only animal class property
		Cat c=new Cat();
		c.memo();
		c.eat();
		
		//Know i will create a dog class object and call methods which are present in dog class , dog class contains only bark method and eat method because the dog class only inhertit the property of the animal class
		Dog dog=new Dog();
		dog.bark();
		dog.eat();
		
	}

}
