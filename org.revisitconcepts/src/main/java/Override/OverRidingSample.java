package Override;

class Vehicle {

	public void startEngine() {

		System.out.println("Vehicle is baseclass");

	}

}

	class Car extends Vehicle {

		public void startEngine() {

			super.startEngine();

			System.out.println("Car is sub class ");

		}

	}

		class Bike extends Vehicle {

			public void startEngine() {

				super.startEngine();

				System.out.println("Bike is sub class1");

			}

		}

			class Truck extends Vehicle {

				public void startEngine() {

					super.startEngine();

					System.out.println("truck is sub class2");

				}

			}

public class OverRidingSample {
	public static void main(String[] args) {
		
		Car obj1 = new Car();
		obj1.startEngine();
		
		Bike obj2 = new Bike();
		obj2.startEngine();
		
		Truck obj3 = new Truck();
		obj3.startEngine();
		
		
	}

}
