package Java;

public class LongestCommonSubstring {
	String s1 = "xyzabcxyzd";
	String s2 = "abcd";
	public static void main(String args[]) {
		LongestCommonSubstring commonString = new LongestCommonSubstring();
		System.out.println(commonString.LCS(0, 0));
	}
	
	public int LCS(int i, int j) {
		if(i >= s1.length() || j >= s2.length()) {
			return 0;
		}
		if(s1.charAt(i) ==  s2.charAt(j)) {
			return 1+LCS(i+1, j+1);
		} 
		return Math.max(LCS(i+1, j), LCS(i, j+1));
	}
}
