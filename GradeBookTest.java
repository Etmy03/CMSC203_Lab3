import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook obj1;
	GradeBook obj2;
	@BeforeEach
	void setUp() throws Exception {
		obj1 = new GradeBook(5);
		obj2= new GradeBook(5);
		
		obj1.addScore(3.0);
		obj1.addScore(9.0);
		
		obj2.addScore(7.0);
		obj2.addScore(13.0);
	}

	@AfterEach
	void tearDown() throws Exception {
		obj1 = null;
		obj2= null;
	}

	@Test
	void testAddScore() {
		assertEquals(obj2.addScore(17.0), true);
	}

	@Test
	void testSum() {
		assertEquals(obj1.sum(), 12.0);
	}

	@Test
	void testMinimum() {
		assertEquals(obj2.minimum(), 7.0);
	}

	@Test
	void testFinalScore() {
		assertEquals(obj1.finalScore(), 9.0);
	}

	@Test
	void testGetScoreSize() {
		assertEquals(obj1.getScoreSize(), 2);
	}

	@Test
	void testToString() {
		assertTrue(obj1.toString().equals("3.0 9.0"));
	}

}
