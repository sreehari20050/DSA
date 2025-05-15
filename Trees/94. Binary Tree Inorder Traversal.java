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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> answer = new ArrayList<>();
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<>();
        while(true){
            if(node != null){
                stack.push(node);
                node = node.left;
            }
            else{
                if(stack.empty() == true) break;
                node = stack.pop();
                answer.add(node.val);
                node = node.right;

            }
        }
        return answer;
    }
}
