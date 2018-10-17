import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PChecker {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = br.readLine();
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < in.length(); i++) {
			
				if ((st.size() != 0) && ((st.lastElement() == '(' && in.charAt(i) == ')') || (st.lastElement() == '{' && in.charAt(i) == '}') || (st.lastElement() == '[' && in.charAt(i) == ']'))) {
					st.pop();
				} else
					st.push(in.charAt(i));

			}
			
		if (st.size() == 0)
			System.out.println("balanced parantheses");
		else
			System.out.println("Unbalanced parantheses");

	}

}
