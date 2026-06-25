class Solution {

    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        height(root);
        return diameter;
    }

    public int height(TreeNode root){

        if(root == null){
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        if(left + right > diameter){
            diameter = left + right;
        }

        return Math.max(left, right) + 1;
    }
}
