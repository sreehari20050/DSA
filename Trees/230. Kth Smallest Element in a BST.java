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
    int result = 0;
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        traversal(root, k);
        return result;
    }
    public void traversal(TreeNode root,int k){
        if(root == null) return;
        traversal(root.left,k);
        count++;
        if(count == k){
            result = root.val;
            return;
        }
        traversal(root.right);
    }
}


//Solution 2
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
    ArrayList<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        traversal(root);
        return list.get(k - 1);
    }
    public void traversal(TreeNode root){
        if(root == null) return;
        traversal(root.left);
        list.add(root.val);
        traversal(root.right);
    }
}
