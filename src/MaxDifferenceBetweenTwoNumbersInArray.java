
public class MaxDifferenceBetweenTwoNumbersInArray {

	public static void main(String[] args) {
		int a[] = { 2, 3, 10, 6, 4, 8, 1 };
		findmax(a);
	}

	public static void findmax(int a[]) {
		int cSum = 0, maxSum = 0;
		for (int i = 0, j = 1; i < a.length - 1 && j < a.length; j++) {
			cSum = a[j] - a[i];
			if (maxSum < cSum)
				maxSum = cSum;
			if (a[j] < a[i])
				i = j;
		}
		System.out.println(maxSum);
	}
	
}
