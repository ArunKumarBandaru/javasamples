package Java;

public class NQueriesSample {
	public static void main(String args[]) {
		int n = 3;
		char[][] charValues = new char[n][n];
		
		for(int i=0;i<charValues.length;i++ ) {
			for(int j=0;j<charValues[0].length;j++) {
				charValues[i][j] = '.';
			}
		}
		charValues[0][0] = 'Q';
		NQueriesSample sample = new NQueriesSample();
		
		for(int i=0;i<charValues.length;i++ ) {
			for(int j=0;j<charValues[0].length;j++) {
				sample.validateCharValues(charValues, i, j);
			}
		}
	}
	
	
	public boolean validateCharValues(char[][] charValues, int row, int col) {
		//diagonal check
		while(row >= 0 && col >= 0) {
			if(charValues[row][col] == 'Q') {
				return false;
			}
			row--;
			col--;
		}
		
		while(row >= 0 && col >= 0) {
			if(charValues[row][col] == 'Q') {
				return false;
			}
			col--;
		}
		
		while(row < charValues.length) {
			if(charValues[row][col] == 'Q') {
				return false;
			}
			row++;
		}
		
		return true;
	}
}
