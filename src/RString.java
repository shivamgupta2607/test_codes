import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			String s = br.readLine();
			String o = "";
			for (int j = s.length(); j > 0;) {
				if (s.lastIndexOf('.') == -1) {
					o = o + s;
					j = 0;
				} else {
					o = o + s.substring(s.lastIndexOf('.')+1, j)+'.';
					s = s.substring(0, s.lastIndexOf('.'));
					j = s.length();
				}
			}
			System.out.println(o);
		}

	}
}
