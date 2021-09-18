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
		int number = 3;
		String response = fizzBuzz.play(number);
		assertEquals("Fizz", response);
	}
}
