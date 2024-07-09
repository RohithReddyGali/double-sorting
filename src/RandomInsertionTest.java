import insertion.sort.InsertionSort;

public class RandomInsertionTest extends RandomTest {

	@Override // required
	public void sort(int[] a) {
		InsertionSort insertion = new InsertionSort(a);
		insertion.arraySort();
	}
}
