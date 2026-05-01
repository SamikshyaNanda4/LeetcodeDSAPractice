class Solution {
    public int[] diStringMatch(String s) {
        int min=0;
        int max=s.length();
        int[] res=new int [s.length()+1];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                res[i]=min++;  
            }else{
                res[i]=max--;
            }
        }
        if(s.charAt(s.length()-1)=='I'){
            res[s.length()]=min++;
        }else{
            res[s.length()]=max--;
        }
        return res;
    }
}