class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int maxLefts[]= new int[n];
        int maxRights[]= new int[n];

        for(int i=1;i<n;i++){
            maxLefts[i]=Math.max(height[i-1], maxLefts[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            maxRights[i]=Math.max(height[i+1],maxRights[i+1]);
        }

        int s=0;
        for(int i=0;i<n;i++){
            int x = Math.min(maxLefts[i],maxRights[i])- height[i];
            if(x>0)
                s+=x;
        }
        return s;
    }
}
