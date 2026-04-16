class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<3) return new ArrayList<>();
    Arrays.sort(nums);
    Set<List<Integer>> set = new HashSet<>();
    for(int i=0;i<nums.length-2;i++){
        int left=i+1;
        int right=nums.length-1;
            while(left<right){
                if(nums[i]+nums[left]+nums[right]==0){
                    set.add(new ArrayList<>(List.of(nums[i],nums[left],nums[right])));
                }
                if(nums[i]+nums[left]+nums[right]<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return new ArrayList<List<Integer>>(set);
    }
}