import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseLine {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t != 0) {
			String s = br.readLine();
			String out = "";
			while (true) {
				if (s.indexOf(".") == -1) {
					if (!"".equals(out))
						out = out + "." + s;
					else
						out = s;
					break;
				}
				if (!"".equals(out))
					out = out + ".";
				out = out + s.substring(s.lastIndexOf(".") + 1);
				s = s.substring(0, s.lastIndexOf("."));
			}
			System.out.println(out);
			t--;
			System.out.println(t);
		}
	}
}
