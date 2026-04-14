class Solution {
    public void rotate(int[] nums, int k) {
      int n=nums.length;
      int d=k%n;

      int[] tempArr=new int [n-d];

      for(int i=0;i<n-d;i++){
        tempArr[i]=nums[i];
      }
      for(int i=0;i<d;i++){
        nums[i]=nums[(n-d)+i];
      }
      for(int i=d;i<n;i++){
        nums[i]=tempArr[i-d];
      }
    }
}