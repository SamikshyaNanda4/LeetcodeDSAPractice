class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int i=0;
        int j=nums.length-1;
        int pointerI=0;
        int pointerJ=nums.length-1;
        int[] res=new int[nums.length];

        while(i<nums.length){
            if(nums[i]<pivot){
                res[pointerI++]=nums[i];
            }
            if(nums[j]>pivot){
                res[pointerJ--]=nums[j];
            }
            i++;
            j--;
        }
        while(pointerI<=pointerJ){
            res[pointerI++]=pivot;
            res[pointerJ--]=pivot;
        }
        return res;
    }
}