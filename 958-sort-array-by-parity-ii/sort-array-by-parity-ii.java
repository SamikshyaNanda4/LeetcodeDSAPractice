class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int evenCounter=0;
        int oddCounter=1;
        int[] newArr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                newArr[evenCounter]=nums[i];
                evenCounter+=2;
            }else{
                newArr[oddCounter]=nums[i];
                oddCounter+=2;
            }
        }
        return newArr;
    }
}