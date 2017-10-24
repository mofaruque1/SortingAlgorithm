import java.util.Arrays;

/*
 * Name: Md Omor Faruque
 * email: mofaruque1@gmail.com
 * 
 * This program takes an unsorted array of signed
 * integers as input and outputs an array with all
 * positive numbers to the right of all the
 * negative numbers e.g. {3,4,-2,-8,-1,-4,6,9}
 * should produce {-4, -1, -2, -8, 4, 3, 6, 9} or 
 * {-2,-8,-1,-4,3,6,4,9} etc. The running time of 
 * this algorithm is O(n) and it require a constant 
 * amount of space
 * 
 * 
 */
public class ReArrangingArray {

	public static void reArrangeArray(int[] array) {

		int posCursor = 0, negCursor = array.length - 1;
		for (int i = 0; i < array.length; i++) {

			if (posCursor >= negCursor) {
				break;
			}
			if (array[posCursor] < 0) {
				posCursor++;
			}
			if (array[negCursor] > 0) {
				negCursor--;
			}
			if (array[posCursor] > 0 && array[negCursor] < 0) {
				int temp = array[posCursor];
				array[posCursor] = array[negCursor];
				array[negCursor] = temp;
				posCursor++;
				negCursor--;
			}
		}

	}
	
	
	public static void main(String[] args) {
		int[] array = {3,4,-2,-8,-1,-4,6,9};
		System.out.println("Before : "+Arrays.toString(array));
		reArrangeArray(array);
		System.out.println("After : "+Arrays.toString(array));
	}

}
