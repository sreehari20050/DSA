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
    TreeNode prev = null;
    public boolean isValidBST(TreeNode root) {
        return checkBST(root);
    }
    public boolean checkBST(TreeNode root){
        if(root == null) return true;
        boolean leftnode = checkBST(root.left);
        if(leftnode == false) return false;
        if(prev != null && root.val <= prev.val) return false;
        prev = root;
        boolean rightnode = checkBST(root.right);
        if(rightnode == false) return false;
        return true;
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
    List<Integer> list = new LinkedList<>();
    public boolean isValidBST(TreeNode root) {
        list.clear();
        if(root == null) return true;
        inOrder(root);
        int prev = list.get(0);
        for (int i = 1 ; i < list.size() ; i++){
            if(prev >= list.get(i)){
                return false;
            }
            prev = list.get(i);
        }
        return true;
    }
    public void inOrder(TreeNode root){
        if(root == null) return;
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
}
