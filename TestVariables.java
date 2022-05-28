package com.vstl.javaTraining;

public class TestVariables {

	public static void main(String[] args) {
		//global(); Cannot call a non static variable inside the static variable.
		Variables objvtypes = new Variables();
		objvtypes.vartypes();
		objvtypes.global();
	}

}
