package sorting;

public class SelectionSort {
/*
 * time complexity o(n^2)
 * best case complexity is also the same.
 * 
*
*/	
	public static void main(String[] args) {
		int a[] = { 3, 2, 7, 1, 6, 5 };
		selectionSort(a);
	}

	public static void selectionSort(int a[]) {
		int min;
		int mini;
		for (int i = 0; i < a.length - 1; i++) {
			min = a[i];
			mini = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) {
					min = a[j];
					mini = j;
				}
			}
			int temp = a[i];
			a[i] = a[mini];
			a[mini] = temp;
		}
		for(int i = 0; i< a.length;i++)
		{
			System.out.print(a[i]+ "   ");
		}
	}
	

}
