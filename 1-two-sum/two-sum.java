class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //Create a Hashmap
        Map<Integer,Integer> hm =new HashMap<>();
        //Iterate through array and try find 2nd addition number or else add to Hashmap
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                return new int[]{i,hm.get((target-nums[i]))};
            }else{  
                hm.put(nums[i],i);
            }
        }
        return null;
    }
}