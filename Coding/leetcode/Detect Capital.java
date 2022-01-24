/* --------------------- Question : https://leetcode.com/problems/detect-capital/ ------------------*/


class Solution {
    public boolean detectCapitalUse(String word) {
        Character c = word.charAt(0);
        if(c >= 65 && c<=90)
            return allSmall(word) || allCapital(word);
        else if(c>=97 && c<=122)
            return allSmall(word);
        return false;
    }

    public boolean allSmall(String word) {
        for (int i = 1 ; i < word.length() ; i++) {
            if(word.charAt(i) - 'a' >= 26 || word.charAt(i) - 'a' < 0)
                return false;
        }
        return true;
    }
    
    public boolean allCapital(String word) {
        for (int i = 1 ; i < word.length() ; i++) {
            if(word.charAt(i) - 'A' >= 26 ||  word.charAt(i) - 'A' < 0)
                return false;
        }
        return true;
    }
}

/*Success
Details 
Runtime: 1 ms, faster than 99.35% of Java online submissions for Detect Capital.
Memory Usage: 39.1 MB, less than 26.92% of Java online submissions for Detect Capital.
Next challenges:
Capitalize the Title*/
