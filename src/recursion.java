
public class recursion {
	public int MaxPath(int[][] grid, int r, int c) {
		int n = grid.length;
		if(r == c && c == n) {
			return grid[r][c];
		}
		if(r>n-1 || c > n-1) {
			
		}
		int d = MaxPath(grid, r+1, c);
		int r = MaxPath(grid, r, c+1);
		
		return Max(d,r) + grid[r][c];
	}
	
	public void printPermutations(char[] word) {
		if(word.length == 1) {
			string output = append(word);
			System.out.println(output);
		}
		if(word.length > 1) {
			printPermutations(removeOne(word));
		}
	}
}


//

FindHeight(node root) {
	if(root == null) {
		return -1; //each level automatically gets a +1, but leaf needs to get +0
	}
	int leftHeight = FindHeight(root->left);
	int rightHeight = FindHeight(root->right);
	return max(leftHeight, rightHeight) + 1;
}
}