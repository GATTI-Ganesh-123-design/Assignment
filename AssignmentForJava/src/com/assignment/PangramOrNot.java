package com.assignment;

import java.util.Scanner;

public class PangramOrNot {

	 static void containAllLetters(String str) {
		String string =str.toLowerCase();
		boolean allLetterPresent = true;  
		  
		for (char ch = 'a'; ch <= 'z'; ch++){  
		
		  if (!string.contains(String.valueOf(ch))){  
		      allLetterPresent = false;  
		      break; 
		  }  
		}  
		
		if (allLetterPresent) {
			System.out.println("Pangram String");  
		}else {
			System.out.println("Not a Pangram String");
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the string: ");  
		String str =sc.next();
		containAllLetters(str);


	}

}
