package com.kata.training.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import com.kata.training.fizzbuzz.FizzBuzz;

@SpringBootTest
public class FizzBuzzTest {
	FizzBuzz fizzBuzz;

	@BeforeEach
	public void init() {
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void fizzPlay() {
		assertEquals("Fizz", fizzBuzz.play(3));
	}

	@Test
	public void fizzPlayWithOtherValues() {
		assertEquals("Fizz", fizzBuzz.play(6));
	}

	@Test
	public void fizzPlayWithNonDivisible() {
		assertEquals("4", fizzBuzz.play(4));
	}

	@Test
	public void buzzPlay() {
		assertEquals("Buzz", fizzBuzz.play(5));
	}

	@Test
	public void buzzPlayWithOtherValues() {
		assertEquals("Buzz", fizzBuzz.play(10));
	}
}
