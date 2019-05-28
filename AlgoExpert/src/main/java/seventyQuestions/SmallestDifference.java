package seventyQuestions;

import java.util.Arrays;

public class SmallestDifference {

	/**
	 * Function that accepts two arrays, and returns an array with the value from
	 * each whos absolute difference is closest to 0
	 * 
	 * @param arrayOne The first int[]. Can include zeroes and negatives.
	 * @param arrayTwo the second int[] Can include zeroes and negatives.
	 * @return an int[ 2 ] that contains the two values whos absolute difference is
	 *         closest to zero.
	 */
	public static int[] smallestDifference( int[] arrayOne, int[] arrayTwo ) {
		/*
		 * Sort the two arrays, putting the largest value at the right side.
		 */
		Arrays.sort( arrayOne );
		Arrays.sort( arrayTwo );

		int i = arrayOne.length - 1;
		int j = arrayTwo.length - 1;
		int[] pair = new int[ ] { arrayOne.length - 1, arrayTwo.length - 1 };
		int result = Integer.MAX_VALUE;

		/*
		 * Starting at the right side (largest values) of the arrays, reverse iterate
		 * down the arrays.
		 * 
		 * While the difference isn't zero, and the iterators are not going to go into
		 * the negative index, continue to loop
		 * 
		 * The hope is that by going from high to low, the smallest differences will
		 * come first. Not always the case, however.
		 */
		while ( Math.abs( arrayOne[ i ] - arrayTwo[ j ] ) != 0 && ( i >= 0 && j >= 0 ) ) {
			/*
			 * Check the "victory" condition. If the new difference is lower than the
			 * previous, store it and the answer.
			 */
			if ( Math.abs( arrayOne[ i ] - arrayTwo[ j ] ) < result ) {
				result = Math.abs( arrayOne[ i ] - arrayTwo[ j ] );
				pair[ 0 ] = arrayOne[ i ];
				pair[ 1 ] = arrayTwo[ j ];
			}

			/*
			 * Reverse iteration.
			 * 
			 * Check to make sure that we're stepping the correct array (we want the values
			 * to be close to one another, so if array_1[ x ] > array_2[ y ], we want to
			 * lower the value of array_1 currently being indexed. We also want to make sure
			 * that we're not going into the negative.
			 * 
			 * Also, we want to make sure we step through to the "bottom" of the other array
			 * if the current one is already being pointed to its lowest address.
			 */
			if ( ( arrayOne[ i ] > arrayTwo[ j ] || j == 0 ) && i > 0 ) {
				i--;
			} else if ( ( arrayOne[ i ] < arrayTwo[ j ] || i == 0 ) && j > 0 ) {
				j--;
			}

			//Return the lowest pair if we didn't find a difference == 0
			if ( ( i == 0 && j == 0 ) || result == 0 ) {
				return pair;
			}
		}
		
		/*
		 * Check the "victory condition" if it breaks early due to result == 0
		 */
		pair[ 0 ] = arrayOne[ i ];
		pair[ 1 ] = arrayTwo[ j ];

		return pair;
	}
}
