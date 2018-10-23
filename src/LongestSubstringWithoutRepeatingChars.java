
public class LongestSubstringWithoutRepeatingChars {

	public static void main(String[] args) {
		String s = "abcabcbb";
		int i = 0;
		int size=0;
		int maxSize=0;
		StringBuilder sb = new StringBuilder();
		String out ="";
		while (i < s.length()) {
			if (!sb.toString().contains(String.valueOf(s.charAt(i)))) {
				sb.append(s.charAt(i));
				size=sb.length();
				if(maxSize<size)
				{
					out = sb.toString();
					maxSize=size;
				}
				i++;
			}
			else
			{
				while(sb.toString().contains(String.valueOf(s.charAt(i))))
				{
					sb.deleteCharAt(0);
				}
			}

		}
System.out.println(out);
	}

}
