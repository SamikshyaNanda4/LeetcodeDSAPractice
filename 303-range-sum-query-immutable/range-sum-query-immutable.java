class NumArray {
        int[] arr;
        int[] prefixSum;
    public NumArray(int[] nums) {
        this.arr=nums;
        this.prefixSum=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i==0){
                this.prefixSum[0]=nums[0];
            }else{
                this.prefixSum[i]=prefixSum[i-1]+nums[i];
            }
        }
    }
    
    public int sumRange(int left, int right) {
        if(left!=0){
            return this.prefixSum[right]-this.prefixSum[left-1];
        }
        else return this.prefixSum[right];
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */