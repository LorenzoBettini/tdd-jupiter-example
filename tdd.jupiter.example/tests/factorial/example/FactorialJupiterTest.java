package factorial.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FactorialJupiterTest {

	private Factorial factorial;

	@BeforeEach
	void setup() {
		factorial = new Factorial();
	}

	@ParameterizedTest
	@CsvSource({
		"0, 1",
		"1, 1",
		"2, 2",
		"3, 6",
		"4, 24"
	})
	void testFactorial(int input, int expected) {
		assertEquals(expected, factorial.compute(input));
	}

	@Test
	void testFactorialNegativeInput() {
		IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class,
			() -> factorial.compute(-1));
		assertEquals("Negative input: -1", thrown.getMessage());
	}
}
