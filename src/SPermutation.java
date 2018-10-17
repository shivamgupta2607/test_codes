import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;

public class SPermutation {
	private static HashSet<String> hs =new HashSet<>();
	public static void main(String[] args) throws IOException {
		 
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		SPermutation sp =new SPermutation();
		sp.permute(s, 0, s.length()-1);
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

	public void permute(String s, int i, int j)
	{
		if (i == j)
		{
			hs.add(s);
		}
		else
		{
			for(int k=i; k<=j; k++)
			{
				s= swap(s, k, i);
				permute(s, i+1, j);
				s= swap(s, k, i);
						
			}
		}
	}

	public String swap(String s, int i, int j)
	{
		char chArray[] =s.toCharArray();
		char temp = chArray[i];
		chArray[i]= chArray[j];
		chArray[j]= temp;
		return String.valueOf(chArray);
	}	
}
