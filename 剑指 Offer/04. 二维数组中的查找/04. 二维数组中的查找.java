class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
    	int n = matrix.length;
    	if(n <= 0 || matrix[0].length <= 0){
    		return false;
    	}
    	int token;
    	int temp ;
    	int m = matrix[0].length;
    	if(m >= 2){
			for (int i = 0; i < n; i++) {
				if(matrix[i][0] <= target && matrix[i][m-1] >=target){
					for (int j = 0; j < m; j++) {
						if(matrix[i][j] == target){
							return true;
						}
					}
				}
			}
    	}else{
    		for (int i = 0; i < n; i++) {
    			if(matrix[i][0] == target){
    				return true;
    			}
    		}
    	}
    	return false;

    }
}