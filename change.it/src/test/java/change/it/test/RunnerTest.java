package change.it.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import change.it.Runner;

class RunnerTest {
	
	public Runner it;

	@BeforeEach
	public void setUp() {
		it = new Runner();
	}

	@Test
	void test() {
		assertEquals(10, it.somma(5, 5));
	}

}
