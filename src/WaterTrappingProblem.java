
public class WaterTrappingProblem {

	public static void main(String[] args) {
		//int arr[]   = {2, 0, 2};
		int arr[]   = {3, 0, 0, 2, 0, 4};
		//int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		findmax(arr);
	}

	public static void findmax(int a[]) {
		int l = 0 ; 
		int r= a.length-1;

		int leftMax = 0;
		int rightMax=0;
		int ans = 0;
		while(l<r)
		{
			if(a[l]<a[r])
			{
				if(a[l]>leftMax)
					leftMax=a[l];
				else
					ans+=leftMax-a[l];
				l++;
			}
			else
			{
				if(a[r]>rightMax)
					rightMax = a[r];
				else
					ans+=rightMax-a[r];
				r--;
			}
		}
		System.out.println(ans);
		
		
	}
	
}
