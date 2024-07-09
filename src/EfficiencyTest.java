import junit.framework.TestCase;
import java.util.Arrays;
import java.util.Random;

public abstract class EfficiencyTest extends TestCase {
    private static final int POWER = 18;
    private static final int BIG = (1<<POWER);
    private static final int RANDOM_MAX = 1<<(POWER-2);

    protected static int[] unsorted;
    protected int[] big;

    public abstract void sort(int[] toSort);

    protected void setUp() throws Exception {
        super.setUp();
        Random random = new Random();
        try {
            assert false;
            assertTrue(true);
        } catch (NullPointerException ex) {
            throw new IllegalStateException("Cannot run test with assertions enabled");
        }
        unsorted = new int[BIG];
        for(int j = 0; j < BIG; ++j){
            unsorted[j] = (random.nextInt(RANDOM_MAX));
        }
    }
    
    private int[] copyArray(int[] original) {
        return Arrays.copyOf(original, original.length);
    }

    protected void assertIsSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            assertTrue("Array not sorted at index " + i, array[i] <= array[i + 1]);
        }
    }

    public void testSortedOddLength() {
        for (int p = 10; p <= POWER; ++p) {
            int size = (1 << p) - 1;  // Odd length
            big = new int[size];
            for (int i=0; i < size; ++i) {
                big[i] = i;
            }
            
            int[] copy = copyArray(big);

            long startTime = System.currentTimeMillis();
            sort(copy);
            long endTime = System.currentTimeMillis();

            assertIsSorted(copy);
            System.out.println("Array (Odd Length): " + size + " took " + (endTime - startTime) + " milliseconds");
        }
    }

    public void testSortedEvenLength() {
        for (int p = 10; p <= POWER; ++p) {
            int size = (1 << p);  // Even length
            big = new int[size];
            for (int i=0; i < size; ++i) {
                big[i] = i;
            }
            
            int[] copy = copyArray(big);

            long startTime = System.currentTimeMillis();
            sort(copy);
            long endTime = System.currentTimeMillis();

            assertIsSorted(copy);
            System.out.println("Array (Even Length): " + size + " took " + (endTime - startTime) + " milliseconds");
        }
    }

    public void testReverseSortedEven() {
        for (int p = 10; p <= POWER; ++p) {
            int size = 1 << p;
            big = new int[size];
            for (int i = 0; i < size; ++i) {
                big[i] = size - i - 1;
            }
            
            int[] copy = copyArray(big);
            
            long startTime = System.currentTimeMillis();
            sort(copy);
            long diff = System.currentTimeMillis() - startTime;
            assertIsSorted(copy);
            System.out.println("Time to sort (even size) " + size + " elements that are in reverse order = " + diff);
        }
    }

    public void testReverseSortedOdd() {
        for (int p = 10; p <= POWER; ++p) {
            int size = (1 << p) - 1;
            big = new int[size];
            for (int i = 0; i < size; ++i) {
                big[i] = size - i - 1;
            }
            
            int[] copy = copyArray(big);
            
            long startTime = System.currentTimeMillis();
            sort(copy);
            long diff = System.currentTimeMillis() - startTime;
            assertIsSorted(copy);
            System.out.println("Time to sort (odd size) " + size + " elements that are in reverse order = " + diff);
        }
    }

    public void testUnsortedEven(){
        for (int p=10; p <= POWER; ++p) {
            int size = 1 << p;
            big = new int[size];
            System.out.println(size);
            System.arraycopy(unsorted, 0, big, 0, size);
            
            int[] copy = copyArray(big);

            long startTime = System.currentTimeMillis();
            sort(copy);
            long diff = System.currentTimeMillis()-startTime;
            assertIsSorted(copy);
            System.out.println("Time to sort (even size) " + size + " random elements = " + diff);
        }
    }

    public void testUnsortedOdd(){
        for (int p=10; p <= POWER; ++p) {
            int size = (1 << p) - 1;
            big = new int[size];
            System.out.println(size);
            System.arraycopy(unsorted, 0, big, 0, size);
            
            int[] copy = copyArray(big);

            long startTime = System.currentTimeMillis();
            sort(copy);
            long diff = System.currentTimeMillis()-startTime;
            assertIsSorted(copy);
            System.out.println("Time to sort (odd size) " + size + " random elements = " + diff);
        }
    }
}
