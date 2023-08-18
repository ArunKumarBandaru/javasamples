package Java;

public class Numberofilands {
	public static void main(String args[]) {
		String[][] grid = {
				{"1","1","1","1","0"},
				{"1","1","0","1","0"},
				{"1","1","0","0","0"},
				{"0","0","0","0","0"}
		};
		int count=0;
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[0].length;j++) {
				if(grid[i][j] == "1") {
					count++;
					dfs(grid, i, j);
				}
			}
		}
		System.out.println("printing count in the " + count);
	}
	
	public static void dfs(String[][] grid, int i, int j) {
		if(i< 0 || j<0 || i>=grid.length || j >= grid[0].length || grid[i][j] == "0") {
			return;
		}
		
		grid[i][j] = "0";	
		
		dfs(grid, i-1, j);
		dfs(grid, i, j-1);
		dfs(grid, i, j+1);
		dfs(grid, i+1, j);
	}
}
