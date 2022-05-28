package com.vstl.javaTraining;

public class Variables {
	
		int instvar = 11; // Instance variable - Global variable
		static byte stvar; // Static variable declaration
	
	
	
	public void vartypes()
		{
				int localvar=10; // Local Variable
				
				stvar = (byte)localvar;
				System.out.println("Static Variable"+stvar);
				
				byte add = (byte)((byte)localvar + (byte)stvar);
				System.out.println("Variables Type Casting" + add);
			
				float ovrflow = (float)localvar;
				System.out.println("Overflow" + ovrflow);
		
		}

	
	void global()
		{
			float ovrflow = (float)instvar;
			System.out.println("instance variable" + ovrflow);
		}

	}
