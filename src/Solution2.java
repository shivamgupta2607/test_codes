
public class Solution2 {
  public static void main(String[] args) {
/*    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Hello, World!");
    strings.add("Welcome to CoderPad.");
    strings.add("This pad is running Java " + Runtime.version().feature());

    for (String string : strings) {
      System.out.println(string);
    }
*/    int arr[] = {2, 0, 1, 0, 1, 1, 0, 2, 1};
    segregate(arr);
  }
  
  public static void segregate(int [] arr)
  {
    int i= 0;
    for(int j = 0 ; j < arr.length; j++)
    {
      if((i==0&& arr[j] == 0 && i!=j)||(arr[i]==arr[j] && i!=j))
      {
        i++;
        swap(i, j, arr);
      }    	  
    }
    for(int j = i ; j < arr.length; j++)
    {
      if((i==0 && arr[j] == 1)||(arr[i]==arr[j]))
      {
        i++;
        swap(i, j, arr);
      }    	  
    }
  }

private static void swap(int i, int j, int arr[]) {
	int temp = arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}
    
}