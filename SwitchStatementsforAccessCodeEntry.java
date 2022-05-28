package com.vstl.javaTraining;

public class SwitchStatementsforAccessCodeEntry {

	public int accesscodeentry() {
		
		int intaccesscode = 2915;

		switch(intaccesscode) {
		
		case 1234:
			System.out.println("Case 1:\t" + intaccesscode);
			break;
		
		case 2314:
			System.out.println("Case 2:\t" + intaccesscode);
			break;
			
		case 2915:
			System.out.println("Case 3:\t" + intaccesscode);
			break;
			
		case 4563:
			System.out.println("Case 4:\t" + intaccesscode);
			break;
			
			default:
				System.out.println("Default case:\t" + intaccesscode);
				break;
			
		}
		return intaccesscode;
		
	}

}
