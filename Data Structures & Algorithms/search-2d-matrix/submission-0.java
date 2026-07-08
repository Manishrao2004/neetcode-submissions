class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;

        for(int i=0;i<matrix.length;i++){
        int left=0;
        int right = n-1;
        if(matrix[i][right]<target)
            continue;

        while(left<=right){
                int mid=(left+right)/2;
                if(matrix[i][mid]==target)
                    return true;

                else if(matrix[i][mid]>target)
                    right=mid-1;
                
                else left =mid+1;
            
            }
        }
        return false;

    }
}
