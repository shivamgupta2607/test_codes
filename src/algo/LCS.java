package algo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//https://www.geeksforgeeks.org/printing-longest-common-subsequence/
public class LCS {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char a[] = "AGGTAB".toCharArray();
		char b[] = "ABCDGH".toCharArray();
		int L[][] = new int[a.length][b.length];
		String out = "";
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
                if (i == 0 || j == 0) 
                    L[i][j] = 0; 
                else if (a[i-1] == b[j-1]) 
                    L[i][j] = L[i-1][j-1] + 1; 
                else
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]); 

			}
		}
	}
}
