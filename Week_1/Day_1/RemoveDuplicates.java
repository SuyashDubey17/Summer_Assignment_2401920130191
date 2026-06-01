class Solution {
    public int removeDuplicates(int[] arr) {

        if(arr.length == 0) return 0;

        int uniqueIndex = 0;

        for(int current = 1; current < arr.length; current++) {

            if(arr[current] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[current];
            }
        }

        return uniqueIndex + 1;
    }
}
