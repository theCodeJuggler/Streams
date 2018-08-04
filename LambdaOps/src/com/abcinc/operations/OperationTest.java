package com.abcinc.operations;

import java.util.ArrayList;
import java.util.List;

public class OperationTest {
	
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<>();	//declaring the arraylist
		
		//adding numbers to the list
		for(int i=1;i<100;i++)
			list.add(i);

		System.out.println("The List : ");
		list.stream().forEach(System.out::println);	//displaying the whole list
		
		System.out.println("Odd Numbers :: ");
		list.stream().filter(Lambdas.isOdd()).forEach(System.out::println);	//calling isOdd()
		
		System.out.println("Prime Numbers :: ");
		list.stream().filter(Lambdas.isPrime()).forEach(System.out::println);	//calling isPrime()
		
		System.out.println("Palindrome Numbers :: ");
		list.stream().filter(Lambdas.isPalindrome()).forEach(System.out::println);	//calling isPalindrome()

		System.out.println("Even Numbers :: ");
		list.stream().filter(Lambdas.isEven()).forEach(System.out::println);	//calling isEven()

		System.out.println("Divisible by 6 Numbers :: ");
		list.stream().filter(Lambdas.isDivBy6()).forEach(System.out::println);	//calling isDivBy6()
		
		System.out.println("Less Than 12 Numbers :: ");
		list.stream().filter(Lambdas.isLess12()).forEach(System.out::println);	//calling isLess12()
		
		System.out.println("Greater Than 50 Numbers :: ");
		list.stream().filter(Lambdas.isGreat50()).forEach(System.out::println);	//calling isGreat50()
		
	}

}
