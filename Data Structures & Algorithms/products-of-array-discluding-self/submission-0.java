class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[]= new int[nums.length];
        int a=1;
        for (int i=0;i<nums.length;i++){
            a=a*nums[i];
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                int p=1;
                for(int j=0 ; j<nums.length;j++){
                    if(j!=i){
                        p=p*nums[j];
                    }
                }
                res[i]=p;
                continue;
        }
                res[i]=a/nums[i];
        }
        return res;
    }
}  
