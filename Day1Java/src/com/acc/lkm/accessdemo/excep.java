package com.acc.lkm.accessdemo;

public class excep {

	public static void main(String[] args) {

		try {	
			try {
				int[] numbers = {1, 2, 3};
				System.out.println(numbers[3]); 
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
			}
			try {
			String numberStr = "abc";
			int parsedNumber;
			
				parsedNumber = Integer.parseInt(numberStr);
			} catch (NumberFormatException e) {
				System.out.println("Caught NumberFormatException: " + e.getMessage());
			}

			try {
			String str = null;
			
				System.out.println(str.length()); // Attempting to access the length of a null string
			} catch (NullPointerException e) {
				System.out.println("Caught NullPointerException: " + e.getMessage());
			}
			
		}
		catch (Exception e) {
			System.out.println("invalid");
		}
		finally {
			System.out.println("execute");
		}


	}

}
