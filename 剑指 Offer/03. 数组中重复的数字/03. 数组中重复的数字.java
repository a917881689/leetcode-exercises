class Solution {
    public int findRepeatNumber(int[] nums) {
        int [] temp = new int[nums.length]
        for (int i = 0,j = nums.length-1; i < j; i++,j--) {
        	temp[nums[i]]++;
        	temp[nums[j]]++;
        	if(temp[nums[i]] > 1){
        		return nums[i]
        	}else if(temp[nums[j]] > 1){
        		returnnums[j]
        	}
        }
        return -1;
    }
}