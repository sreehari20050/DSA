/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxi =  Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        pathsum(root);
        return maxi;
    }

    public int pathsum(TreeNode root) {
        if (root == null)
            return 0;
        int left = Math.max(0, pathsum(root.left));
        int right = Math.max(0, pathsum(root.right));
        maxi = Math.max(maxi, left + right + root.val);
        return Math.max(left, right) + root.val;
    }
}
