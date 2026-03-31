class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        
        HashMap<String, List<String>> A = new HashMap<>();
        
      for(int i = 0; i <strs.length ; i++)
      {
          char[] chars = strs[i].toCharArray();
          Arrays.sort(chars);
          String key = new String(chars);
          
          if(A.containsKey(key))
          {
            A.get(key).add(strs[i].toString());
          }
          else
          {
            List<String> B = new ArrayList<>();
            B.add(strs[i]);
             A.put(key, B);
          }
 
      }
      return new ArrayList<>(A.values());
    }
}

