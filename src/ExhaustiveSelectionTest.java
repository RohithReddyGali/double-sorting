import selection.sort.SelectionSort;

public class ExhaustiveSelectionTest extends ExhaustiveTest {
	@Override // required
	public void sort(int[] a) {
		SelectionSort selection = new SelectionSort(a);
		selection.sort();
	}
}
