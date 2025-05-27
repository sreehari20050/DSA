class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int v = adj.size();
        int[] vis = new int[v];
        vis[0] = 1;
        Queue<Integer> q = new LinkedList<>();
        q.offer(0);
        ArrayList<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            int node = q.poll();
            ans.add(node);
            for(int it : adj.get(node)){
                if(vis[it] == 0){
                    q.offer(it);
                    vis[it] = 1;
                }
            }
        }
        return ans;
    }
}
