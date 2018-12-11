
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class BalancedParantheses {

	static String[] braces(String[] values) {
		String[] out = new String[values.length];
		for (int in = 0; in < values.length; in++) {
			String word = values[in];
			char wordArray[] = word.toCharArray();
			Stack<Character> stack = new Stack<>();
			boolean f = false;
			for (int i = 0; i < wordArray.length; i++) {
				if (wordArray[i] == '{' || wordArray[i] == '(' || wordArray[i] == '[')
					stack.push(wordArray[i]);
				if (wordArray[i] == '}' || wordArray[i] == ')' || wordArray[i] == ']') {
					if (stack.isEmpty()) {
						out[in] = "NO";
						f = true;
						break;
					} else if (!characterMatches(stack.pop(), wordArray[i])) {
						out[in] = "NO";
						f = true;
						break;
					}
				}
			}
			if (!f) {
				if (stack.isEmpty()) {
					out[in] = "YES";
				} else {
					out[in] = "NO";
				}
			}
		}
		return out;
	}

	static boolean characterMatches(char a, char b) {
		if (a == '(' && b == ')')
			return true;
		else if (a == '[' && b == ']')
			return true;
		else if (a == '{' && b == '}')
			return true;
		else
			return false;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int valuesCount = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String[] values = new String[valuesCount];

		for (int i = 0; i < valuesCount; i++) {
			String valuesItem = scanner.nextLine();
			values[i] = valuesItem;
		}

		String[] res = braces(values);
		for (String r : res) {
			System.out.println(r);
		}
		scanner.close();
	}
}
