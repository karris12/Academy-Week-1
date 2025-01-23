package com.bptn.course_01_variables;

public class VariablesOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare two integer variables and assign them values
		
		int numGirls = 30;
		int numBoys = 15;
		
		//Perform arithmetic operations
		
		int totalStudents = numGirls + numBoys;
		
		System.out.println("The number of Girls: " + numGirls + " number of Boys: " + numBoys);

		System.out.println("Total number of students: " + totalStudents);
		
		//Reassign new values to the original integer variables and print them to show the changes.
		numGirls = 40;
		numBoys = 60;
		totalStudents = numGirls + numBoys;
		System.out.println("The number of Girls: " + numGirls + " number of Boys: " + numBoys);

		System.out.println("Total number of students: " + totalStudents);
		
		//Declare a character variable and a string variable and print them.
		
		char c = 'R';
		String namCountry = "Russia";	
		
		System.out.println("The initial for  " + namCountry + "  is " + c);
		
		
	}

}
