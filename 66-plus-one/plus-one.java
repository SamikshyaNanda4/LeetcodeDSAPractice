class Solution {
    public int[] plusOne(int[] digits) {
        int oneCarry=1;
        int i=0;
        reverseArr(digits);
        while(oneCarry!=0){
            if(i<digits.length){
                if(digits[i]==9){
                digits[i]=0;
            }
            else{
                digits[i]=digits[i]+1;
                oneCarry=0;
            } 
            }else{
                int[] newArr = new int[digits.length + 1];
                for(int id=0;id<digits.length;id++){
                    newArr[id]=digits[id];
                }
                digits =new int [newArr.length];
                for(int id=0;id<newArr.length;id++){
                    digits[id]=newArr[id];
                }
                digits[digits.length - 1] = 1;
                oneCarry=0;
            }
            i++;
        }
        reverseArr(digits);
        return digits;
    }

    static void reverseArr(int[] digitsArr){
        int left=0;
        int right=digitsArr.length-1;
        while(left<right){
            int temp=digitsArr[left];
            digitsArr[left]=digitsArr[right];
            digitsArr[right]=temp;
            left++;
            right--;
        }
    }
}