package DPProblemsAndRecurrsion;

public class LongestStringsubseq {
	static String s = "ab";
	static String s1 = "amnocb";
	public static void main(String args[]) {
		int valuedisplay = LCSubstring(s,s1, 0, 0);
		System.out.println(valuedisplay);
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
			return Math.max(LCSubstring(s, s1,i+1,j) , LCSubstring(s, s1, i, j+1));
		}
	}
}
