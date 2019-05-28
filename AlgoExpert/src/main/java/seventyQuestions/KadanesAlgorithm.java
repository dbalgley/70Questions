package seventyQuestions;

/**
 * 
 * Algorithm that takes in a non-empty array of ints and returns the max sum
 * that can be obtained by summing up all the numbers in a non-empty subset of
 * the input array. Subarray must contain adjacent numbers according to the
 * input array.
 * 
 * @author Davis
 *
 */
public class KadanesAlgorithm {
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static int kadanesAlgorithm( int[] array ) {
		int maxVal = array[ 0 ];
		int maxCollected = array[ 0 ];
		for( int i = 1; i < array.length; i++ ) {
			maxVal = Math.max( array[ i ], maxVal + array[ i ] );
			maxCollected = Math.max( maxVal, maxCollected );
			System.out.println( maxCollected );
		}
		
		for( int i = 0; i < array.length; i++ ) {
			System.out.print( array[ i ] + ", " );
		}
		System.out.println( );
		return maxCollected;
	}
}
