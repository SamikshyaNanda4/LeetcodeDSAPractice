class Solution {
    public int fib(int n) {
        
        if(n<=1){
            return n;
        }

        int[] indexedMap=new int[n+1];

        indexedMap[0]=0;
        indexedMap[1]=1;

        for(int i=2;i<=n;i++){
            indexedMap[i]=indexedMap[i-1]+indexedMap[i-2];
        }
        return indexedMap[n];
    }
}