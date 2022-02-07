/* -================================ Question : https://leetcode.com/problems/find-the-difference/ =============================================- */


class Solution {
    public char findTheDifference(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray()) c^=cs;
        for(char ct : t.toCharArray()) c^=ct;
        
        return c;
        
        /*int S = 0;
        int T = 0;
        int temp;
        for(int i = 0 ; i < s.length(); i++) {
            S += s.charAt(i);
        }
        
        for(int i = 0 ; i < t.length(); i++) {
            T += t.charAt(i);
        }
        temp = T - S;
        return (char)temp;*/
        
        /*int arr[] = new int[26];
        char c=' ';
        for(int i = 0 ; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0 ; i < t.length(); i++) {
            arr[t.charAt(i) - 'a']--;
        }
        
        for(int i = 0 ; i < 26; i++) {
            if(arr[i] == -1){
                i = i + 97;
                c = (char) i;
            }  
        }
        return c;*/
        
        /*int arr[] = new int[26];
        int brr[] = new int[26];
        char c=' ';
        for(int i = 0 ; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0 ; i < t.length(); i++) {
            brr[t.charAt(i) - 'a']++;
        }
        
        for(int i = 0 ; i < 26; i++) {
            if(arr[i] != brr[i]) {
                i = i + 97;
                c = (char) i;
            }
                
        }
        return c;*/

        
        /*int arr[] = new int[26];
        char c=' ';
        for(int i = 0 ; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0 ; i < t.length(); i++) {
            arr[t.charAt(i) - 'a']--;
        }
        
        for(int i = 0 ; i < 26; i++) {
            if(arr[i] == -1){
                i = i + 97;
                c = (char) i;
            }  
        }
        return c;*/
        
        /*int arr[] = new int[26];
        int brr[] = new int[26];
        char c=' ';
        for(int i = 0 ; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0 ; i < t.length(); i++) {
            brr[t.charAt(i) - 'a']++;
        }
        
        for(int i = 0 ; i < 26; i++) {
            if(arr[i] != brr[i]) {
                i = i + 97;
                c = (char) i;
            }
                
        }
        return c;*/
    }
}






/*
Success
Details 
Runtime: 1 ms, faster than 99.82% of Java online submissions for Find the Difference.
Memory Usage: 42.4 MB, less than 9.71% of Java online submissions for Find the Difference.
Next challenges:
Single Number(/
