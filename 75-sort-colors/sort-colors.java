class Solution {
    public void sortColors(int[] nums) {
        int start=0;
        int mid=0;
        int end=nums.length-1;

        while(mid<=end){
            switch(nums[mid]){
                case 0:
                    swap(nums,start,mid);
                    start++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums,mid,end);
                    end--;
                    break;
            }
        }


    }

     static void swap(int[] nums, int s1,int s2){
        int temp=nums[s1];
        nums[s1]=nums[s2];
        nums[s2]=temp;
    }
}