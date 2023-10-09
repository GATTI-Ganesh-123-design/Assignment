package com.assignment;

import java.util.HashMap;
import java.util.Scanner;

public class RomanNumberToIntegerNumber {
	
    static int convertRomanToInt(String romanNum) {
		int sum=0;
		int len =romanNum.length();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (int i=0; i<len; i++) {
            int s1 = map.get(romanNum.charAt(i));
            if (i+1 <len) {
              int s2 = map.get(romanNum.charAt(i+1));
              if (s1 >= s2) {
                 sum = sum + s1;
              }
              else{
                 sum = sum - s1;
              }
           }
           else {
              sum = sum + s1;
           } 
        }
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Enter the Roman Number");
		Scanner sc =new Scanner(System.in);
		String romanNum =sc.next();
		System.out.println(convertRomanToInt(romanNum));

	}

	

}
