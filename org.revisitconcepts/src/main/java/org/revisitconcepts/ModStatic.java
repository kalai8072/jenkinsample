package org.revisitconcepts;

public class ModStatic {
	
	//Non staic
	
	float num1=50.2f,num2=2,num3=num1/num2;
	
	//Static
	
	static double x=250.35d,y=60.2d,z=x/y;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Non static
		ModStatic modobj = new ModStatic();
		System.out.println("Mod of two number is:"+modobj.num3);
		
		//static
		System.out.println("Mod of two value is:"+z);
	}

}
