
// Java program to print all substrings of a string 
public class GFG { 
  
    // Function to print all substring 
    public static void SubString(String str, int n) 
    { 
    	for(int len = str.length(); len>=1;len--)
    		for (int i = 0; i <= n-len; i++)  
                System.out.println(str.substring(i, len+i)); 
    } 
  
    public static void main(String[] args) 
    { 
        String str = "abcd"; 
        SubString(str, str.length()); 
    } 
} 
  
// This code is contributed by ASHISH KUMAR PATEL 
