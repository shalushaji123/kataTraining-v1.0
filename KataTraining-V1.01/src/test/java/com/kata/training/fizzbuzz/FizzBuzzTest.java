package com.kata.training.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;
import com.kata.training.fizzbuzz.FizzBuzz;

@SpringBootTest
public class FizzBuzzTest {
	@Test
	public void fizzPlay() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Fizz", fizzBuzz.play(3));
	}

	@Test
	public void fizzPlayWithOtherValues() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Fizz", fizzBuzz.play(6));
	}

	@Test
	public void fizzPlayWithNonDivisible() {
		FizzBuzz fizzBuzz = new FizzBuzz();
		assertEquals("Fizz", fizzBuzz.play(5));
	}
}
