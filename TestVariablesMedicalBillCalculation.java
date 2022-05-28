package com.vstl.javaTraining;

public class TestVariablesMedicalBillCalculation {

	
	public static void main(String[] args) {
		
		//Cannot call a non static variable inside the static variable directly. So we are using object
		
		VariablesMedicalBillCalulation objvarmedBill = new VariablesMedicalBillCalulation();
		
		objvarmedBill.bills();
	}
}
