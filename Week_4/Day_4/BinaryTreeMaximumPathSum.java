class Solution {

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {

        solve(root);
        return maxSum;
    }

    public int solve(TreeNode root){

        if(root == null){
            return 0;
        }

        int left = Math.max(0, solve(root.left));
        int right = Math.max(0, solve(root.right));

        int current = root.val + left + right;

        if(current > maxSum){
            maxSum = current;
        }

        return root.val + Math.max(left, right);
    }
}
