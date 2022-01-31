/* ------------------------------ Question: https://leetcode.com/problems/valid-palindrome/  ----------------------*/

class Solution {
    public boolean isPalindrome(String s) {
        int i = 0 ;
        int j = s.length() - 1;
        for(; i<j ; ) {
            if(!(isAlphaNumric(s.charAt(i)))){
                ++i;
                continue;
            }
                
            if(!(isAlphaNumric(s.charAt(j)))) {
                --j;
                continue;
            }
                
            if(toLower(s.charAt(i)) != toLower(s.charAt(j)))
                return false;
            i++;
            j--;
        }
        return true;
    }
    
    public char toLower(char c) {
        if(c >='a' && c<='z')
            return c;
        return (char) (c+32);
    }
    
    public boolean isAlphaNumric(char ch) {
        return (ch >='a' && ch <= 'z') ||
            (ch >='A' && ch <= 'Z') ||
            (ch >='0' && ch <= '9');
    }
}



/*Success
Details 
Runtime: 3 ms, faster than 83.33% of Java online submissions for Valid Palindrome.
Memory Usage: 43.6 MB, less than 21.66% of Java online submissions for Valid Palindrome.*/
