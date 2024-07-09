import selection.sort.SelectionSort;

public class BaseImplementationSelectionTest extends BaseImplementationTest {
	@Override // required
	public void sort(int[] a) {
		SelectionSort selection = new SelectionSort(a);
		selection.sort();
	}
}
