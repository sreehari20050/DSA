class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); // Sort greed factors
        Arrays.sort(s); // Sort cookie sizes
        int child = 0, cookie = 0;

        while (child < g.length && cookie < s.length) {
            if (g[child] <= s[cookie]) {
                // Cookie satisfies this child
                child++;
            }
            // Try next cookie (whether assigned or not)
            cookie++;
        }

        return child; // Number of content children
    }
}
