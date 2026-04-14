class Solution {
    public void rotate(int[] nums, int k) {
        int d=k%nums.length;
        reverse(nums,nums.length-d,nums.length-1);
        reverse(nums,0,nums.length-d-1);
        reverse(nums,0,nums.length-1);
    }
 static void reverse(int[] arr, int start, int end){
            while(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
    }
}