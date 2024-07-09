package selection.sort;
/**
 * 
 * This is an implementation for selection sort algorithm.
 *
 */
public class SelectionSort {
	private final static int[] DEFAULT_ARRAY = new int[0];
	private int[] sortArray;
	
	
	/**
	 * Default Constructor for selection sort
	 */
	public SelectionSort() {
		 this(DEFAULT_ARRAY);
	}
	/**
	 * Constructor for the selection sort
	 * @param candidate
	 */
	public SelectionSort(int[] candidate) {
		sortArray = candidate;
	}
	
	/**
	 * This method will return sorted array.
	 * @return sortArray
	 */
    public int[] getSortArray() {
    	return sortArray;
    }
	
	// Converted code received via chat gpt. Detailed description listed in sources.
    
    /**
     * The main sort implementation method. The selection sort will be performed after calling this method.
     */
    public void sort() {
        for (int pass = 0; pass < sortArray.length / 2; ++pass) {
            // Set minimum and maximum to first element
            int minIndex = pass;
            int maxIndex = pass;
            
            int min = sortArray[pass];
            int max = sortArray[pass];

            for (int i = pass + 1; i < sortArray.length - pass; ++i) {
                if (sortArray[i] < min) {
                    minIndex = i;
                    min = sortArray[i];
                } else if (sortArray[i] > max) {
                    maxIndex = i;
                    max = sortArray[i];
                }
            }

            // Debugging output
//            System.out.printf("Pass %d, Min %d at index %d, Max %d at index %d%n", pass, min, minIndex, max, maxIndex);

            // Swap minimum element with first element
            if (minIndex != pass) {
            	sortArray[minIndex] = sortArray[pass];
            	sortArray[pass] = min;
            }

            // Swap maximum element with last element
            if (maxIndex == pass) { // max was swapped with min
            	sortArray[minIndex] = sortArray[sortArray.length - pass - 1];
            	sortArray[sortArray.length - pass - 1] = max;
            } else if (maxIndex != sortArray.length - pass - 1) {
            	sortArray[maxIndex] = sortArray[sortArray.length - pass - 1];
            	sortArray[sortArray.length - pass - 1] = max;
            }
        }
    }
}
