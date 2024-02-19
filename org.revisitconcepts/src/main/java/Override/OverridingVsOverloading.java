package Override;

class abc {
	
	void m1(int a) {
		
		System.out.println(a);
	}
	
	void m2(int b) {
		
		System.out.println(b);
	}
}

class xyz extends abc{
	
	void m1(int a) {                  // Don't change the definition body changed. // Override
		
		System.out.println(a*a);
	}
	
	void m2(int a , int b) {         // Definition changed (parameter). //Overload
		System.out.println(a+b);
	}
}

// Now xyz have totally three methods.


public class OverridingVsOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xyz obj = new xyz();
		obj.m1(100);
		obj.m2(200);
		obj.m2(25, 30);
		

	}

}
