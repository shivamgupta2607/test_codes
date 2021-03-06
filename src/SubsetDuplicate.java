import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetDuplicate {
	public static void main(String[] args) {

		int arr[] = { 3, 2, 1 };
		Arrays.sort(arr);
		List<List<Integer>>   res = new SubsetDuplicate().findsubset(arr);
		for(int i =0 ; i < res.size(); i++)
		{
			System.out.println(Arrays.toString(res.get(i).toArray()));
		}
	}

	public List<List<Integer>>  findsubset(int a[]) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> subset = new ArrayList<>();
		findSubsetRecursive(res, subset, a, 0);
		return res;
		
	}
	public void findSubsetRecursive(List<List<Integer>> res, List<Integer> subset, int a[], int startIndex)
	{
		res.add(new ArrayList<>(subset));
		for(int i =startIndex; i< a.length; i++)
		{
			if(i!=startIndex && a[i]==a[i-1])
				continue;
			subset.add(a[i]);
			findSubsetRecursive(res, subset, a, i+1);
			subset.remove(subset.size()-1);
			
			
		}

	
}

	
}
