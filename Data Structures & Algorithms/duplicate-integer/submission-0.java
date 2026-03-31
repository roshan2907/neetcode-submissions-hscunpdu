class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> UniNum = new HashSet<> () ;
        boolean conDupli = false ;
        for(int i =0; i < nums.length ; i++){
           
         conDupli =   UniNum.add(nums[i] );

         if(conDupli==false){
           return true ;
         }
         
        }

        return false ;
    }
}