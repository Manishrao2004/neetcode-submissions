class Solution {
    public int findDuplicate(int[] nums) {
        int slow=0,fast=0;

        while(true){
            slow = nums[slow];
            fast = nums[nums[fast]];

            if (slow==fast)
                break;
        }

        int ptr = 0;
        while(true){
            ptr=nums[ptr];
            slow=nums[slow];

            if(slow==ptr)
                break;
        }
        return ptr;
    }
}