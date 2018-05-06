package com.oxoo88oo.other.palindrome;

/**
 *  @author 0x008800
 *  
 * A palindromic number reads the same both ways. The largest palindrome made from the product of 
 * two 2-digit numbers is 9009 = 91 * 99.Find the largest palindrome made from the product of 
 * two 3-digit numbers.
 * 
 * */

public class Palindrome {
private final static int MIN = 100;
private final static int MAX = 999;
private final static int PALINDROME_MAX_VALUE = MAX * MAX;
private final static int PALINDROME_MIN_VALUE = MIN * MIN;

	public static void main(String[] args) {
		
		int palindrome = 0;
		int maxPalindrome = 0;
		
		for(int i = 999; i >= 0; i--){
			String tempString = "";
			tempString += i;
			palindrome = Integer.parseInt(tempString + new StringBuilder(tempString).reverse());
			if(palindrome > PALINDROME_MAX_VALUE || palindrome < PALINDROME_MIN_VALUE) continue;
			for(int t = MAX; t >= MIN; t--)
				if(palindrome % t == 0 && palindrome / t < MAX && palindrome > maxPalindrome) maxPalindrome = palindrome;		
		}
		
		for(int i = 999; i >= 0; i--){
			String tempString = "";
			tempString += i;
			palindrome = Integer.parseInt(tempString.substring(1) + new StringBuilder(tempString).reverse());
			if(palindrome > PALINDROME_MAX_VALUE || palindrome < PALINDROME_MIN_VALUE) continue;
			for(int t = MAX; t >= MIN; t--)
				if(palindrome % t == 0 && palindrome / t < MAX && palindrome > maxPalindrome) maxPalindrome = palindrome;
		}
		System.out.println(maxPalindrome);
		
	}

}
