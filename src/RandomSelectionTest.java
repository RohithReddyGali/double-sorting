import selection.sort.SelectionSort;

public class RandomSelectionTest extends RandomTest {

	@Override // required
	public void sort(int[] a) {
		SelectionSort insertion = new SelectionSort(a);
		insertion.sort();
	}
}
