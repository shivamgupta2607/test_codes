

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountDistinctPairsForSum {
	static int numberOfPairs(int[] a, long k) {

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {

			if (!map.containsKey(a[i]))
				map.put(a[i], 1);
			else
				map.put(a[i], map.get(a[i]) + 1);
		}
		int c = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			int val = entry.getKey();
			if (map.get(Math.toIntExact(k - val)) != null) {
				if ((val == Math.toIntExact(k - val)) && (map.get(Math.toIntExact(k - val)) > 1)) {
					c += 2;
				} else {
					c += 1;
				}
			}
		}
		return c / 2;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int aCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] a = new int[aCount];

		for (int i = 0; i < aCount; i++) {
			int aItem = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			a[i] = aItem;
		}

		long k = scanner.nextLong();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int res = numberOfPairs(a, k);

		/*
		 * bufferedWriter.write(String.valueOf(res)); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */
		System.out.println(res);

		scanner.close();
	}
}
