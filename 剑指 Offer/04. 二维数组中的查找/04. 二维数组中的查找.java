class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
    	// 数组为空
    	if(matrix.length <= 0 || matrix[0].length <= 0){
    		return false;
    	}
    	// 记录列
    	int m = 0;
    	// 记录行，从右上角开始
    	int n = matrix[0].length - 1;

    	// m和n 越界退出循环
    	while(m < matrix.length && n >= 0){
    		// 找到target返回true
    		if(matrix[m][n] < target){
				// 当前节点小于target，下移
				m++;
			}else if (matrix[m][n] > target) {
				// 当前节点大于target，左移
				n--;
			}else{
				return true;
			}
    	}
    	// 没找到返回false
    	return false;
    }
}