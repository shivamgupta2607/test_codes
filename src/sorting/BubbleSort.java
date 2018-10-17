package sorting;

public class BubbleSort {

	/*
	 * time complexity o(n^2). Best case complexity O(n) when the array is already
	 * sorted.
	 * 
	 *
	 */
	public static void main(String[] args) {

		int a[] = { 3, 2, 7, 1, 6, 5 };
		// int a[] = { 1, 2, 3, 4, 5 }; //best case
		a = bubbleSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "   ");
		}
	}

	private static int[] bubbleSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int swap = 0;
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					swap = 1;
				}
			}
			if (swap == 0)
				break;
		}
		return a;
	}
}
