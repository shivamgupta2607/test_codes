import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	
	
	//https://www.youtube.com/watch?v=irFtGMLbf-s&index=25&list=PLV8H0QrJHjOmhbwotwt3Sy8qlfzqGhVW-
public static void main(String[] args) {
	int a[] = {2, 3, 5, 7};
	Arrays.sort( a);
	List<List<Integer>> res = new CombinationSum().getCombinationSum(a, 7 );
	
	for(int i =0 ; i < res.size(); i++)
	{
		System.out.println(Arrays.toString(res.get(i).toArray()));
	}
}

private List<List<Integer>> getCombinationSum(int a[], int n) {
	List<List<Integer>> res = new ArrayList<>();
	List<Integer> combination = new ArrayList<>();
	getCombinationSumRecursive(res, combination , a, 0, n);
	return res;
	
}

private void getCombinationSumRecursive(List<List<Integer>> res, List<Integer> combination, int[] a, int startIndex, int target) {
	if(target ==0)
	{
		res.add(new ArrayList<>(combination));
		return;
	}
	for(int i = startIndex ; i<a.length; i++)
	{
		if(a[i]>target)
			break;
		combination.add(a[i]);
		getCombinationSumRecursive(res, combination, a, i, target-a[i]);
		combination.remove(combination.size()-1);
		
	}
}
}
