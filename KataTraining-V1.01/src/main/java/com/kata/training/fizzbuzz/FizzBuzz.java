package com.kata.training.fizzbuzz;

public class FizzBuzz {

	public String play(int number) {
		if(number%3 == 0) {
			return "Fizz";
		}
		return String.valueOf(number);
		
	}

}
