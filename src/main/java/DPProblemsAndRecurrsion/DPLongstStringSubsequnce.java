package DPProblemsAndRecurrsion;

public class DPLongstStringSubsequnce {
	
	public static void main(String args[]) {
		
		String s1 = "abc";
		String s2 = "abc";
		
		int[][] twodstrings = new int[s1.length()+1][s2.length()+1];
		
		//System.out.println(twodstrings.length);
		//System.out.println(twodstrings[0].length);
		
		formLongestString(s1,s2, 1, 1, twodstrings);
		
		for(int i=1;i<twodstrings.length;i++) {
			for(int j=1;j<twodstrings[i].length;j++)  {
				formLongestString(s1, s2, i, j, twodstrings);
			}
			//System.out.println();
		}
		
		
		for(int i=0;i<twodstrings.length;i++) {
			for(int j=0;j<twodstrings[i].length;j++)  {
				System.out.print(twodstrings[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void formLongestString(String s1, String s2, int i, int j, int[][] twodstrings) {
		
		if(i > s1.length() ||  j > s2.length()) return;
		
		if(i < 1 || j < 1) return ;
		
		if(s1.charAt(i-1) == s2.charAt(j-1)) {
			twodstrings[i][j] =  1 + twodstrings[i-1][j-1];
		} else {
			twodstrings[i][j] =  Math.max(twodstrings[i-1][j], twodstrings[i][j-1]);
		}
	}
	
	

}
