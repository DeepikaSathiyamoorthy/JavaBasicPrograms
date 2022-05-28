package com.vstl.javaTraining;

public class VariablesMedicalBillCalulation {

			static int introombill; // static variable
			double wholebill;//Instance Variable
	
	
			public void bills() {
				double doubleoperationamt = 20000; // Local variable
				double doublemedicine = 3000; 
				introombill = 1000;
				double doublehospitalbills = doubleoperationamt + doublemedicine;
				System.out.println("Total Bill amount/t" + doublehospitalbills);
				double doublediscountamt = doublehospitalbills - (double)introombill;
				System.out.println("Bill Payable after discount\t" + doublediscountamt);
	}
			
	
}
