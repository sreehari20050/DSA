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

class Pair{
    TreeNode node;
    int val;
    Pair(TreeNode _node , int _val){
        node = _node;
        val = _val;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0));
        int first = 0;
        int last = 0;
        int ans = 0;
        while(!q.isEmpty()){
            int mmin = q.peek().val; 
            int size = q.size();
            for(int i = 0 ; i < size ; i++){
                int current_id = q.peek().val - mmin;
                TreeNode node = q.peek().node;
                q.poll();
                if(i == 0) first = current_id;
                if(i == size-1) last = current_id;
                if(node.left != null) q.offer(new Pair(node.left,current_id * 2 + 1));
                if(node.right != null) q.offer(new Pair(node.right,current_id * 2 + 2));
            }   
            ans = Math.max(ans, last - first + 1);
        }
        return ans;
    }
}
