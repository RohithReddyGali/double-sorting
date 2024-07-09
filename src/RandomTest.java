import java.util.Random;
import java.util.stream.IntStream;
import junit.framework.TestCase;

public abstract class RandomTest extends TestCase{
    protected abstract void sort(int[] a);
    
    public boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        
        return true;
    }

    // Inspired by this stack overflow page with modifications to suit our needs.
    // https://stackoverflow.com/questions/28970799/how-to-create-a-array-with-n-random-integers
    public void testRandom() {
        Random random = new Random();
        
        int[] randomIntsArray = IntStream.generate(() -> random.nextInt(100)) // Generates the individual values
                .limit(random.nextInt(100)) // Limits the length generation of the array to 100
                .toArray(); // Converts the output to an array so we can use it to sort as sort takes an array of ints.
        
        System.out.println("Array Length: " + randomIntsArray.length);
        
        sort(randomIntsArray);
        
        assertTrue(isSorted(randomIntsArray));
    }
}
