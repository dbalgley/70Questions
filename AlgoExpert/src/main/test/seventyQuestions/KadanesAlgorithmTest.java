package seventyQuestions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KadanesAlgorithmTest {
	@Test
	public void TestCase1( ) {
		int[] input = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		assertTrue( KadanesAlgorithm.kadanesAlgorithm( input ) == 55 );
	}

	@Test
	public void TestCase2( ) {
		int[] input = { -1, -2, -3, -4, -5, -6, -7, -8, -9, -10 };
		assertTrue( KadanesAlgorithm.kadanesAlgorithm( input ) == -1 );
	}

	@Test
	public void TestCase3( ) {
		int[] input = { -10, -2, -9, -4, -8, -6, -7, -1, -3, -5 };
		assertTrue( KadanesAlgorithm.kadanesAlgorithm( input ) == -1 );
	}

	@Test
	public void TestCase4( ) {
		int[] input = { 1, 2, 3, 4, 5, 6, -20, 7, 8, 9, 10 };
		assertTrue( KadanesAlgorithm.kadanesAlgorithm( input ) == 35 );
	}

	@Test
	public void TestCase5( ) {
		int[] input = { 1, 2, 3, 4, 5, 6, -22, 7, 8, 9, 10 };
		assertTrue( KadanesAlgorithm.kadanesAlgorithm( input ) == 34 );
	}

	@Test
	public void TestCase6( ) {
		int[] input = { 1, 2, -4, 3, 5, -9, 8, 1, 2 };
		assertTrue( KadanesAlgorithm.kadanesAlgorithm( input ) == 11 );
	}

	@Test
	public void TestCase7( ) {
		int[] input = { 3, 4, -6, 7, 8 };
		assertTrue( KadanesAlgorithm.kadanesAlgorithm( input ) == 16 );
	}

	@Test
	public void TestCase8( ) {
		int[] input = { 3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4 };
		assertTrue( KadanesAlgorithm.kadanesAlgorithm( input ) == 19 );
	}

	@Test
	public void TestCase9( ) {
		int[] input = { 8, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4 };
		assertTrue( KadanesAlgorithm.kadanesAlgorithm( input ) == 23 );
	}

	@Test
	public void TestCase10( ) {
		int[] input = { 8, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 6 };
		assertTrue( KadanesAlgorithm.kadanesAlgorithm( input ) == 24 );
	}

	@Test
	public void TestCase11( ) {
		int[] input = { 8, 5, -9, 1, 3, -2, 3, 4, 7, 2, -18, 6, 3, 1, -5, 6 };
		assertTrue( KadanesAlgorithm.kadanesAlgorithm( input ) == 22 );
	}

	@Test
	public void TestCase12( ) {
		int[] input = { 8, 5, -9, 1, 3, -2, 3, 4, 7, 2, -18, 6, 3, 1, -5, 6, 20, -23, 15, 1, -3, 4 };
		assertTrue( KadanesAlgorithm.kadanesAlgorithm( input ) == 35 );
	}

	@Test
	public void TestCase13( ) {
		int[] input = { 100, 8, 5, -9, 1, 3, -2, 3, 4, 7, 2, -18, 6, 3, 1, -5, 6, 20, -23, 15, 1, -3, 4 };
		assertTrue( KadanesAlgorithm.kadanesAlgorithm( input ) == 135 );
	}
}
