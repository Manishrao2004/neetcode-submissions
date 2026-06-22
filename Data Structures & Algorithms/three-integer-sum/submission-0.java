class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List <Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }

            int l=i+1,r=n-1;

            while(l<r){
                int threeSum=nums[i]+nums[l]+nums[r];

                if(threeSum> 0)
                    r--;
                
                else if(threeSum<0)
                    l++;
            
                else{
                    List<Integer> x = new ArrayList<>();
                    x.add(nums[i]);
                    x.add(nums[l]);
                    x.add(nums[r]); 
                    res.add(x);

                    l++;
                    while(nums[l]==nums[l-1] && l<r){
                        l++;
                    }
                } 
            }
        }
        return res;
    }
}
