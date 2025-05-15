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
    List<Integer> list = new ArrayList<>(); 
    int curr = 0;
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return list;
        rightview(root,list,0);
        return list;
    }
    public void rightview(TreeNode root,List<Integer> list, int curr){
        if(root == null) return;
        if(curr == list.size()){
            list.add(root.val);
        }
        rightview(root.right,list,curr + 1);
        rightview(root.left,list,curr + 1);
    }
}
