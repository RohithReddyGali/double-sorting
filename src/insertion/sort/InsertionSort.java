package insertion.sort;
/**
 * The InsertionSort class provides methods to perform insertion sort
 * on an array of integers. It supports both odd and even-sized arrays.
 */
public class InsertionSort {
	
	private int[] sortArray; // array to be sorted
	private static final int minSize = 0; // minSize variable to create a default array with size 0
	private int size; // variable to keep track of the size
	
	/**
     * Constructs an InsertionSort object with a default empty array.
     */
	public InsertionSort() {
		setSortArray(new int[minSize]);
	}
	
	/**
     * Constructs an InsertionSort object with the specified array.
     *
     * @param array The array to be sorted.
     */
	public InsertionSort(int[] array) {
		setSortArray(array);
		size = getSortArray().length;
	}
	
	/**
     * Gets the array to be sorted.
     *
     * @return The array to be sorted.
     */
	public int[] getSortArray() {
		return sortArray;
	}
	
	/**
     * Sets the array to be sorted.
     *
     * @param ls The array to be sorted.
     */
	public void setSortArray(int[] ls) {
		this.sortArray = ls;
	}
	
	/**
     * Performs insertion sort on an array with odd size.
     */
	public void InsertionSortOdd() {
		// Implementation details...
		int smallerItem;
		int largerItem;
        int arraySize = getSortArray().length;
        int toMove, middle = arraySize / 2;

        for (int fringe = 0; fringe < arraySize / 2; fringe++) {
            // Put the pair being inserted into "smallerItem" and "largerItem"
            if (getSortArray()[middle - fringe - 1] > getSortArray()[middle + fringe + 1]) {
                smallerItem = getSortArray()[middle + fringe + 1];
                largerItem = getSortArray()[middle - fringe - 1];
            } else {
                largerItem = getSortArray()[middle + fringe + 1];
                smallerItem = getSortArray()[middle - fringe - 1];
            }

            // Now insert the larger item from the top
            for (toMove = middle + fringe; toMove >= 0 && getSortArray()[toMove] > largerItem; toMove--) {
                getSortArray()[toMove + 1] = getSortArray()[toMove];
            }
            getSortArray()[toMove + 1] = largerItem;

            // And insert the smaller item from the bottom
            for (toMove = middle - fringe; toMove < arraySize && getSortArray()[toMove] < smallerItem; toMove++) {
                getSortArray()[toMove - 1] = getSortArray()[toMove];
            }
            getSortArray()[toMove - 1] = smallerItem;
        }
	}
	
	/**
     * Performs insertion sort on an array with even size.
     */
	public void InsertionSortEven() {
		// Implementation details...
		int smallerItem;
		int largerItem;
	    int arraySize = getSortArray().length;
	    int toMove, middle = arraySize / 2;
	    for (int fringe = 0; fringe < arraySize / 2; fringe++) {
	        // Put the pair being inserted into "smallerItem" and "largerItem"
	        if (getSortArray()[middle - fringe - 1] > getSortArray()[middle + fringe]) {
	            smallerItem = getSortArray()[middle + fringe];
	            largerItem = getSortArray()[middle - fringe - 1];
	        } else {
	            largerItem = getSortArray()[middle + fringe];
	            smallerItem = getSortArray()[middle - fringe - 1];
	        }
	        // Now insert the larger item from the top
	        for (toMove = middle + fringe - 1; getSortArray()[toMove] > largerItem; toMove--) {
	            getSortArray()[toMove + 1] = getSortArray()[toMove];
	        }
	        getSortArray()[toMove + 1] = largerItem;
	        // And insert the smaller item from the bottom
	        for (toMove = middle - fringe; getSortArray()[toMove] < smallerItem; toMove++) {
	            getSortArray()[toMove - 1] = getSortArray()[toMove];
	        }
	        getSortArray()[toMove - 1] = smallerItem;
	    }
	}
	
	/**
     * Determines the array size and delegates to the appropriate sorting method.
     */
	public void arraySort() {
		 // Implementation details...
		if (getSortArray().length % 2 == 0) {
			InsertionSortEven();
		} else {
			InsertionSortOdd();
		}
	}
}