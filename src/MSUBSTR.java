import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class MSUBSTR {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			HashSet<String> set= new HashSet<String>();
			String in = br.readLine();
			
			for (int j = 0; j < in.length(); j++) {
				for (int k = j+2; k <= in.length(); k++) {
					System.out.println("value of j: " + j + " value of k: " + k);
					System.out.println("String is " + in.substring(j, k) );
					System.out.println(" length is" + (k - j));
					set.add(in.substring(j, k));
					
				}
				System.out.println();
			}
			processMSUBSTR(set);
		}
		

	}

	public static void processMSUBSTR(HashSet<String> s) {
		
	}
	public static boolean isPalindrome(String s)
	{
		return true;
	}

}
