import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination {

	public static void main(String[] args) {

		int arr[] = { 3, 2, 1 };
		Arrays.sort(arr);
		List<List<Integer>>   res = new Combination().findComb(arr);
		for(int i =0 ; i < res.size(); i++)
		{
			System.out.println(Arrays.toString(res.get(i).toArray()));
		}
	}

	public List<List<Integer>>  findComb(int a[]) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> subset = new ArrayList<>();
		findCombRecursive(res, subset, a);
		
		return res;
		
	}
	
	private void findCombRecursive(List<List<Integer>> list, List<Integer> tempList, int [] nums){
		   if(tempList.size() == nums.length){
		      list.add(new ArrayList<>(tempList));
		   } else{
		      for(int i = 0; i < nums.length; i++){ 
		         if(tempList.contains(nums[i])) continue; // element already exists, skip
		         tempList.add(nums[i]);
		         findCombRecursive(list, tempList, nums);
		         tempList.remove(tempList.size() - 1);
		      }
		   }
		} 
	
	

	
}
