/*------ Question : https://leetcode.com/problems/word-pattern/  --------  */

class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        //Map of pattern letters as keys and corresponding words as values
        Map<Character, String> hmap = new HashMap<>();
        StringBuilder mappedString = new StringBuilder();
        
        int index = 0;
        int i,j;
        
        String words[] = s.split("\\s+");
        
        //If length of both the inputs is not equal then it is unmatched for sure.
        if(pattern.length() != words.length)
            return false;
        
        for(i=0, j=0; i < pattern.length() ; ++i) {
            if(!hmap.containsKey(pattern.charAt(i))) {
                if(index < words.length) {
                    if(!hmap.containsValue(words[index])) {
                        hmap.put(pattern.charAt(i),words[index]);
                        j = j+words[index].length()+1;  
                        }  
                } else {
                    return false;
                }
            } 
            ++index;
        }
     
        for(i=0; i < pattern.length() ; i++) {
            mappedString.append(hmap.get(pattern.charAt(i)));
            if(i < pattern.length()-1){
                mappedString.append(" ");
            }
        }
        
        //System.out.println("mappedString is "+mappedString);
        
        //System.out.println("Pattern is "+s);
        
        if(s.equals(mappedString.toString()))
            return true;
        return false;
    }
}


/*Success
Details 
Runtime: 7 ms, faster than 5.86% of Java online submissions for Word Pattern.
Memory Usage: 39.8 MB, less than 7.03% of Java online submissions for Word Pattern.
*/
