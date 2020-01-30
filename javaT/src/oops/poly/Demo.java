package oops.poly;


class Car{
	public void run() {
		System.out.println("Car is moving : ");
	}
}
class Bike extends Car{
	public void run() {
		System.out.println("Bike is moving : ");
	}
}
public class Demo {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.run();
		Car c = new Car();
		c.run();

	}

}
