class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

        List<List<Integer>> li= new ArrayList<>();
        for(int i=0;i<nums.length+1;i++){
            li.add(new ArrayList());
        }

        for(int x: map.keySet()){
            li.get(map.get(x)).add(x);
        }

        int res[]= new int[k]; 

        int l=0;

        for(int i= li.size()-1;i>=0;i--){
            for(int num: li.get(i)){
                res[l++]=num;
            }

            if(l==k)
                break;
        }
            return res;
    }
}
