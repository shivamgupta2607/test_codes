import java.util.Arrays;

public class EquqlZeroAndOnesInASubArray {
public static void main(String[] args) {
	int a[] = {1, 0, 1, 0, 0, 1, 1 ,0};
	
	System.out.println(getMaxArray(a));
			
}

	private static int getMaxArray(int[] a) {
		for (int i = 0; i < a.length; i++)
			if (a[i] == 0)
				a[i] = -1;
		for (int i = 1; i < a.length; i++)
			a[i] = a[i] + a[i - 1];
		
		System.out.println(Arrays.toString(a));

		// TODO Auto-generated method stub
		return 0;
	}
}
