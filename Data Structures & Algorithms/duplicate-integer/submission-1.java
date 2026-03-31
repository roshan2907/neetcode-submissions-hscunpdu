class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> UniNum = new HashSet<> () ;
       
        for(int i =0; i < nums.length ; i++){
           
         if(UniNum.add(nums[i] ) ==false){
           return true ;
         }
         
        }

        return false ;
    }
}