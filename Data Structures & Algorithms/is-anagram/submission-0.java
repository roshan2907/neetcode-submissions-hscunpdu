class Solution {
    public boolean isAnagram(String s, String t) {
        
     int count = 0 ;
     HashMap<Character, Integer> A = new HashMap<>();
      HashMap<Character, Integer> B = new HashMap<>();
        
        for(int i=0 ; i < s.length() ; i++ ){
          
         
            if(A.containsKey(s.charAt(i)) ){
                count = A.get(s.charAt(i)) ;
                count++ ;
                A.put( s.charAt(i), count ) ;
            }
            else{
                A.put(s.charAt(i), 1);
            }
           
        }

        for(int i=0 ; i < t.length() ; i++ ){
          
         
            if(B.containsKey(t.charAt(i)) ){
                count = B.get(t.charAt(i)) ;
                count++ ;
                B.put(t.charAt(i), count ) ;
            }
            else{
                B.put(t.charAt(i), 1);
            }
           
        }

        if(A.equals(B)){
            return true ;
        }
        else {
            return false;
        }
    }
}
