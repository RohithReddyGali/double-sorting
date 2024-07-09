import selection.sort.SelectionSort;

public class EfficiencySelectionTest extends EfficiencyTest {

	@Override // required
	public void sort(int[] a) {
		SelectionSort selection = new SelectionSort(a);
		selection.sort();
	}
}
