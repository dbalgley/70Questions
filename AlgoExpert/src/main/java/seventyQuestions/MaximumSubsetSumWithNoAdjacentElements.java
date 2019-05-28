package seventyQuestions;

/**
 * Function that takes an array of positive integers and returns an integer
 * representing the max sum of non-adjacent elements in the array. If a sum
 * cannot be generated, return 0.
 * 
 * @author Davis
 *
 */
public class MaximumSubsetSumWithNoAdjacentElements {
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static int maxSubsetSumNoAdjacent( int[] array ) {
		if ( array.length == 1 ) {
			// Return the singular element as the sum
			return array[ 0 ];
		} else if ( array.length > 1 ) {
			// Build an array that, at each index, stores the max sum possible from 0 ->
			// index
			int[] max = array.clone( );
			// Setup the first index with the higher of the zeroth and first indices
			max[ 1 ] = Math.max( array[ 0 ], array[ 1 ] );
			/*
			 * Step over the rest of the array, storing the max sum for each index.
			 * 
			 * This will either be the n-1 value, or the n-2 value+the n value
			 */
			for( int i = 2; i < array.length; i++ ) {
				max[ i ] = Math.max( max[ i - 1 ], max[ i - 2 ] + array[ i ] );
			}

			/*
			 * Since we've been building up the sums, the last index in the cloned array
			 * will be the best answer.
			 */
			return max[ array.length - 1 ];
		} else {
			// Return zero as the sum cannot be gathered from a size==0 array
			return 0;
		}
	}
}
