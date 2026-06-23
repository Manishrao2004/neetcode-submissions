class Solution {
    public int trap(int[] height) {
        int leftMax=0;
        int rightMax=0;
        int s=0;

        int i=0;
        int j=height.length-1;
        while(i<j){
            if(height[i]<=height[j]){
                leftMax= Math.max(leftMax,height[i]);
                int c= leftMax-height[i];
                s+=c;
                i++;
            }
            else{
                rightMax= Math.max(rightMax,height[j]);
                int c= rightMax-height[j];
                s+=c;
                j--;
            }
        }
        return s;
    }
}
