package javaAbstract;

abstract class car { // Parent

	public abstract void engineSecret();

	

	public abstract void companyVault() ;

	

}

class Bmw extends car { // Child1

	public void engineSecret() {

		System.out.println("Bmw engine secret");
	}



	public void companyVault() {
		
		System.out.println("Bmw company vault");
	}

}

class Benz extends car { // Child2

	public void engineSecret() {

		System.out.println("Benz engine secret");
	}

	public void companyVault() {

		System.out.println("Benz company vault");

	}

}

public class ClassAbstractExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car obj = new Bmw(); // Dynamic polymorphism
		obj.engineSecret();
		obj.companyVault();
		System.out.println("  ");

		car obj1 = new Benz();
		obj1.companyVault();
		obj1.engineSecret();

	}

}
