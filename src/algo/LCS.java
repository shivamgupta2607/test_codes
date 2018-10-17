package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LCS {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char a[] = "AGGTAB".toCharArray();
		char b[] = "ABCDGH".toCharArray();
		int o[][] = new int[a.length][b.length];
		String out = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i] == b[j])
				{
					
				}

			}
		}
	}
}
