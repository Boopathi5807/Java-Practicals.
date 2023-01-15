package java8features;

interface Engine {
	public void speed();

}

class Car {
	public static void design() {
		System.out.println("the design of this car is very good  ");
	}
	public static void weels() {
		System.out.println("the weels of this car is very good  ");
	}
	
}

public class MethodReference {

	public static void main(String[] args) {
		Engine object = () -> System.out.println("the Speed of this car is very Good");
		object.speed();
 
		// Reference
		Car c=new Car();
		Engine object2 = Car::weels,design;
		object2.speed();

	}

}
