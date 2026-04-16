class Solution {

    public String encode(List<String> strs) {
    
    String temp = "" ;
    String result = "";
      for(int i = 0; i < strs.size() ; i++){
        temp = strs.get(i) ;
        result = result + temp.length() + "#" + temp     ; 
      }
 
    return result ;
    }

    public List<String> decode(String str) {

      List<String> decoded = new ArrayList();
	      int numb ;
	      String temp = "";
	      for(int i= 0 ; i < str.length() ; i++){

	        numb = str.indexOf('#', i);

	       int wordLength = Integer.parseInt(str.substring(i, numb)) ;
        
         temp  = str.substring(numb + 1, numb + 1 + wordLength) ;

         decoded.add(temp);
         i = numb + wordLength;
      }
return decoded ;
    }
}
