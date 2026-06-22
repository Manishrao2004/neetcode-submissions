class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int m=0;

        int l=0, r=n-1;
        while(l<r){
            int curr = (r-l)* Math.min(heights[l],heights[r]);
            m= Math.max(curr,m);
            if(heights[l]<heights[r])
                l++;
            else if(heights[r]<heights[l])
                r--;
            else
                l++;


        }

        return m;
    }
}
