class Solution {
    public int maxArea(int[] heights) {
        int m=0;
        int n = heights.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int curr = (j-i)* Math.min(heights[i],heights[j]);
                m = Math.max(curr, m);
            }
        }
        return m;
    }
}
