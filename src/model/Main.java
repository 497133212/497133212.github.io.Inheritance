package model;

public class Main {
	public static void main(String[] args) {
		int age = 5;
		double weight = 30.6;
		Tiger tiger = new Tiger(age, weight);
		tiger.sound();
	}
}
