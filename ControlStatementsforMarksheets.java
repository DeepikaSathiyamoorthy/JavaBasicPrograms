package com.vstl.javaTraining;

public class ControlStatementsforMarksheets {

	public static void marksheets() {

		int intsoftwaretesting = 97, intcommunication = 90;
		
		 if (intsoftwaretesting >= intcommunication)
			{
		
			System.out.println("Scored Good marks, No Need of training\\n");
			
			}
		else if (intsoftwaretesting <= intcommunication) {
			
			if(intsoftwaretesting >= 70) {
				
				System.out.println("Scored very less, need to put in long training ");
			}
			else if (intsoftwaretesting < 70) {
				
				System.out.println("Not a good Scored, Cannot give a chance ");
			}
		}
	}

}
