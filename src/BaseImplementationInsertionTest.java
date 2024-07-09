import insertion.sort.InsertionSort;

public class BaseImplementationInsertionTest extends BaseImplementationTest {
	@Override // required
	public void sort(int[] a) {
		InsertionSort insertion = new InsertionSort(a);
		insertion.arraySort();
	}
}
