package DPProblemsAndRecurrsion;

public class LongestPalindromicSubstring {
	
	public static void main(String args[]) {
		String s1 = "abba";
		String s2 = new StringBuffer(s1).reverse().toString();
		int value = LCSubstring(s1, s2, 0, 0);
		System.out.println(value);
	}
	
	
	public static int LCSubstring(String s, String s1, int i, int j) {
		
		if(i >= s.length() ||  j >= s1.length()) {
			return 0;
		}
		
		if(i < 0 || j < 0) {
			return 0;
		}
		
		if(s.charAt(i) == s1.charAt(j)) {
			return 1 + LCSubstring(s, s1, i+1, j+1);
		} else {
			return 0;
		}
	}

}
