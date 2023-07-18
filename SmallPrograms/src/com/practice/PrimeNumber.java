package com.practice;

public class PrimeNumber {

	public static void main(String args[]) {
		System.out.println(isPrime(Integer.MAX_VALUE));
	}
	
	private static boolean isPrime(int number) {
		if(number == 1)
			return false;
//		for(int i=2; i <= Math.sqrt(Double.valueOf(number+"")); i++) {
		for(int i=2; i*i <= number ; i++) {
			if(number % i ==0) {
				return false;
			}
		}
		return true;
	}
}
