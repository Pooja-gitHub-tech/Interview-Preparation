/* ================ Question : https://leetcode.com/problems/word-pattern/  ====================*/
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ") ; // new String[s.split(" ").length];
        //arr = ;
        StringBuilder temp = new StringBuilder();
        Map<Character, String> hmap = new HashMap<>();
        if(pattern.length() > s.length())
            return false;
        if(arr.length != pattern.length())
            return false;
        
        for(int i = 0 ; i < pattern.length(); i++) {
            if(!hmap.containsValue(arr[i]))
                hmap.put(pattern.charAt(i),arr[i]);
        }
        
        for(int i = 0 ; i < pattern.length(); i++) {
            if(hmap.get(pattern.charAt(i)) != null)
                temp.append(hmap.get(pattern.charAt(i)));
            if(i != pattern.length() - 1)
                temp.append(" ");
        }
        
        //System.out.println("temp is "+temp+"till here");
        
        if(s.equals(temp.toString()))
            return true;
        return false;
    }
}
