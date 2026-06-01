class Solution {
    public int[] twoSum(int[] arr, int target) {

        for(int first = 0; first < arr.length; first++) {

            for(int second = first + 1; second < arr.length; second++) {

                int sum = arr[first] + arr[second];

                if(sum == target) {
                    return new int[]{first, second};
                }
            }
        }

        return new int[]{-1, -1};
    }
}
