package org.inheritance;

public class HierarchialInheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HieSalesPerson obj = new HieSalesPerson();
		obj.salesPerson("Saravanan", 145, 60000);
		obj.display("tcs", "chennai", 123);
		
		HieEngineer obj1 = new HieEngineer();
		obj1.display("tcs", "chennai", 123);
		obj1.engineer("kali", 153, 70000);
		
		HieManager obj2 = new HieManager();
		obj2.display("tcs", "chennai", 123);
		obj2.manager("sundarraj", 145, 60000);
		

	}

}
