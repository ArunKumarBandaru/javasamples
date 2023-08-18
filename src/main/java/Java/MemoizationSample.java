package Java;

public class MemoizationSample {
	static String s1 = "abc";
	static String s2 = "b";
	static int[][] twoDArray = null;
	public static void main(String args[]) {
		int x = s1.length();
		int y = s2.length();
		twoDArray = new int[x+1][y+1];
		for(int i=0;i<twoDArray.length;i++) {
			for(int j=0;j<twoDArray[0].length;j++) {
				twoDArray[i][j] = 0;
			}
		}
		MemoizationSample sample = new MemoizationSample();
		System.out.println(sample.LCS(1,1));
	}
	
	public int LCS(int m, int n) {
		System.out.println("printing m and n value :: "+ m + " :: " +n);
		for(int i=m;i<twoDArray.length;i++) {
			for(int j=n;j<twoDArray[0].length;j++) {
				if(twoDArray[i][j] == 0) {
					if(s1.charAt(i-1) == s2.charAt(j-1)) {
						twoDArray[i][j] = 1 + twoDArray[i-1][j-1];
					} else {
						twoDArray[i][j] = Math.max(twoDArray[i-1][j], twoDArray[i][j-1]);
					}
				}
			}
		}
		return twoDArray[s1.length()][s2.length()];
	}
}
