import java.util.Arrays;

public class SegregatePositiveAndNegativeNumbers {

	public static void main(String[] args) {
		int a[] = { -1, 3, 8, -4, 5, -6, 7, -20, 30, 40 };
		segregate(a);
	}

	private static void segregate(int a[]) {

		int temp = 0;
		int i = -1;
		for (int j = 0; j <= a.length - 1; j++) {
			if (a[j] < 0) {
				i++;
				if (i != j) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
