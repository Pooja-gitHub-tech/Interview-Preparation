/* Question GFG --- https://practice.geeksforgeeks.org/problems/non-repeating-character-1587115620/1/#problems ------------*/


// **********************************       Approach ONE : Using Array ******************************** i think this one is better approach

class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        int arr[] = new int[26];
        int k;
        for(int i = 0 ; i < S.length(); i++) {
            arr[S.charAt(i) - 'a']++;
        }
        
        for(k = 0 ; k < S.length(); k++) {
            if(arr[S.charAt(k) - 'a']==1)
                return S.charAt(k);
        }
        
        return '$';
    }
}


// **********************************       Approach ONE : Using HashMap ********************************
class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        HashMap<Character,Integer> hmap = new HashMap<>();
        int k;
        int count = 1 ;
        for(int i = 0 ; i < S.length(); i++) {
            if(hmap.containsKey(S.charAt(i)))
                hmap.put(S.charAt(i),hmap.get(S.charAt(i))+1);
            else
                hmap.put(S.charAt(i),count);
        }
        
        for(k = 0 ; k < S.length(); k++) {
            if(hmap.get(S.charAt(k))==1)
                return S.charAt(k);
        }
        
        return '$';
    }
}
