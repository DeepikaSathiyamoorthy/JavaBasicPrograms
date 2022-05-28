package com.vstl.javaTraining;

public class Datatypes {
	
	String strvalue = "2345671";// Global Instance Variable
	
	public void basicofdatatypes()
	{
		int integervalue = 10;
		float floatvalue = 4.13f;
		double doublevalue = 4.234545d;
		char charvalue = 'D';
		long longvalue = 12345l;
		short shortvalue = 1234;
		String stringvalue = "Deepika's Datatypes Workout";
		
		boolean booleanvalue = true;	
		int add = (int)floatvalue+(int)doublevalue; //Implicit type conversion
		byte sub = (byte) ((byte)longvalue - (byte)shortvalue); // Implicit type conversion
		
		System.out.println("Java Basic Datatypes");
		System.out.println("Integer\t"+ " " + integervalue);
		System.out.println("Type conversion  of integer\t" + add);
		System.out.println("Float\t" + floatvalue);
		System.out.println("Double\t" + doublevalue);
		System.out.println("Char\t" + charvalue);
		System.out.println("String\t" + stringvalue);
		System.out.println("Boolean\t" + booleanvalue);
		System.out.println("long\t" + longvalue);
		System.out.println("short\t" + shortvalue);
		System.out.println("Conversion of byte\t" + sub);
	}

	public void typeconversionoflongtostring()
	{
		
		long longtype = Long.parseLong(strvalue); 
		
		System.out.println("Stringtype\t" + strvalue);
		System.out.println("String to Long Conversion\t" + longtype);
	}
	
	public void typeconversionofstringtolong() {
		
		long longnumber = strvalue.length();
		
		System.out.println("Long to String\t" + longnumber);
		}
}
