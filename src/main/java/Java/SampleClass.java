package Java;

public class SampleClass {
	
	static String sampleString1 = "abcd";
	static String sampleString2 = "cdefg";
	
	public static void main(String args[]) {
		int value = SampleClass.LCS(0,0);
		System.out.println("displaying value in the console :: " + value);
	}
	
	public static int LCS(int i, int  j) {
		
		if(i == sampleString1.length() || j == sampleString2.length()) {
			return 0;
		}
		
		if(sampleString1.charAt(i) == sampleString2.charAt(j)) {
			return 1 + LCS(i+1, j+1);
		}
		return Math.max(LCS(i+1, j), LCS(i, j+1));
	}
}

