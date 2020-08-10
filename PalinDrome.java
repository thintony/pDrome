package com.chapter4test.chapter4;
import java.util.Scanner;
public class PalinDrome {

	public static void main(String[] args) {
	    int modulus;
		int tempNum = 0;
		int temp = 0;
		int num;
		boolean condition = true;
		
		System.out.print("Enter number to return a palindrome");
		Scanner input = new Scanner(System.in);
	    num = input.nextInt();
		while(condition) {
			if(num >= 10000 && num <= 99999) {
				tempNum = num;
			
			while(tempNum > 0) {
			modulus = tempNum % 10;
			temp = temp * 10 + modulus;
			tempNum = tempNum / 10;
			
			condition = false;
		}
			
	 }
			else {
				System.out.print("Enter a five digit number");
				 num = input.nextInt();
			}
		}
			if(num == temp) { 
			  System.out.println("number is a palindrome:");
			}
		  else {
			      System.out.println("number is NOT a palindrome");
		  }
	}

}
