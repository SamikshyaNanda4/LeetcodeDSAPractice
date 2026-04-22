class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ansList=new ArrayList<>();

        backtrack(ansList, new ArrayList<Integer>(), nums);
        return ansList;
    }

    public static void backtrack(List<List<Integer>> resList,List<Integer> tempList, int[] nums){

        //base condition 
        if(tempList.size()==nums.length){
            resList.add(new ArrayList<>(tempList));
            return;
        }

        //loops through permutes
        for(int number:nums){
            //if already present skip as we need everytime latest
            if(tempList.contains(number)) 
            continue;
            //add the number latest not present 
            tempList.add(number);

            backtrack(resList, tempList, nums);

            tempList.remove(tempList.size()-1);
        }
    }
}