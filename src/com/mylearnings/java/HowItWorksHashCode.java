package com.mylearnings.java;

/**
 * Object's Hash Code
 * In Java, Hash code can be any integer 
 *  
 * @author Intensive Coding (intensive.coding@gmail.com)
 */
public class HowItWorksHashCode {
	int val = 0;
	
	public static void main(String[] args) {
		HowItWorksHashCode obj1 = new HowItWorksHashCode();
		HowItWorksHashCode obj2 = obj1;
		HowItWorksHashCode obj3 = new HowItWorksHashCode();
		
		obj1.val = 10;
		obj3.val = obj1.val;
		obj2.val = 20;
				
		System.out.println("Object 1 Value = " + obj1.val);
		System.out.println("Object 2 Value = " + obj2.val);
		System.out.println("Object 3 Value = " + obj3.val);
		
		// Printing object's hash code
		System.out.println("Object's HashCode 1 = " + obj1.hashCode());
		System.out.println("Object's HashCode 2 = " + obj2.hashCode());
		System.out.println("Object's HashCode 3 = " + obj3.hashCode());
	}

/*	
	// Overriding hashCode
	@Override
	public int hashCode() {
		int hash = 10;
		
		return hash;
	}
*/	

}
