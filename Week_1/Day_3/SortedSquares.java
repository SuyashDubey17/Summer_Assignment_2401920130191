class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while(left <= right){

            int leftVal = nums[left] * nums[left];
            int rightVal = nums[right] * nums[right];

            if(leftVal > rightVal){
                ans[index] = leftVal;
                left++;
            } else {
                ans[index] = rightVal;
                right--;
            }

            index--;
        }

        return ans;
    }
}
