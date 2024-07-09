import insertion.sort.InsertionSort;

public class EfficiencyInsertionTest extends EfficiencyTest {
	@Override // required
	public void sort(int[] a) {
		InsertionSort insertion = new InsertionSort(a);
		insertion.arraySort();
	}
}