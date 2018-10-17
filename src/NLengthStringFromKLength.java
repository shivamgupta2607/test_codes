public class NLengthStringFromKLength {
 static int a = 0;
	public void print(int n, char[] k, char[] A) {
		System.out.println("print is called with: ");
		System.out.println("K : "+k[0]+k[1]+k[2]+k[3]);
		System.out.println("A : "+A[0]+A[1]);
		System.out.println("N : "+n);
		a++;
		if (n <= 0) {
			System.out.println(String.valueOf(A) + " ");
		} else {
			for (int i = 0; i < k.length; i++) {
				A[n - 1] = k[i];
				print(n - 1, k, A);
			}
		}
	}

	public static void main(String[] args) {
		String k = "ALGO";
		int n = 2;
		NLengthStringFromKLength i = new NLengthStringFromKLength();
		i.print(n, k.toCharArray(), new char[n]);
		System.out.println(a);
	}
}