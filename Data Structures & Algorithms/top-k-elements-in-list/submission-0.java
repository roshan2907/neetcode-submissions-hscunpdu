class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap <Integer, Integer> A = new HashMap<>();
        int count = 0 ;

        for(int i =0; i< nums.length ; i++){


            if(A.containsKey(nums[i])){
                
              count =  A.get(nums[i]) ;

              A.put(nums[i], count + 1);
            }           
            else{
              A.put(nums[i], 1 ) ;
            } 
        }

    List<Integer> keys = new ArrayList<>(A.keySet());
    Collections.sort(keys, (a, b) -> A.get(b) - A.get(a) ); 

    int[] result = new int[k] ;
    for(int i =0; i < k; i++){
      result[i] = keys.get(i);
    }

    return result;

    }
}
