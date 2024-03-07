class Solution{

    /**
    * 
    Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

    Note that you must do this in-place without making a copy of the array.

    Example 1:

    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]
    Example 2:

    Input: nums = [0]
    Output: [0]

    */
    public void moveZero(int[] nums){

        int slow = 0; 
        int fast = 0; 
        int n = nums.length;

        while(fast  < n){
            if(nums[fast] != 0){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        for(; slow < n; slow++) nums[slow] = 0;
    }


}
