import insertion.sort.InsertionSort;

public class ExhaustiveInsertionTest extends ExhaustiveTest {
	@Override // required
	public void sort(int[] a) {
		InsertionSort insertion = new InsertionSort(a);
		insertion.arraySort();;
	}
}
