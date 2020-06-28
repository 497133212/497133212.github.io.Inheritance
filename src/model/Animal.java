package model;

public class Animal {
	public int age;
	public double weight;
	
	public Animal(int age, double weight) {
		super();
		this.age = age;
		this.weight = weight;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void running() {
		System.out.println("Running");
	}
	
	public void eating() {
		System.out.println("eating");
	}
}
