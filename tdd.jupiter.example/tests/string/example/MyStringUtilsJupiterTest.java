package string.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MyStringUtilsJupiterTest {

	private MyStringUtils myStringUtils;

	@BeforeEach
	void setup() {
		myStringUtils = new MyStringUtils();
	}

	@ParameterizedTest
	@CsvSource({
		",",
		"'', ''",
		"' abc', abc",
		"abc, abc",
		"'\tabc', abc",
		"'  abc', abc",
		"'  ', ''",
		"'\t abc', abc"
	})
	void testLeftTrim(String input, String expected) {
		assertEquals(expected, myStringUtils.leftTrim(input));
	}

}
