/* -------------- Question : https://leetcode.com/problems/valid-mountain-array/ ----------------------------*/

class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        int l = 0;
        int r = arr.length - 1;
        while(l + 1 < arr.length - 1 && arr[l] < arr[l + 1]) l++;
        while(r - 1 > 0 && arr[r] < arr[r - 1]) r--;
        return l == r;
        /*int i,j;
        if(arr.length == 1 || arr.length == 2)
            return false;
        for(i = 1, j = arr.length -1 ; i < j ; i++,j--) {
            if(arr[i] <= arr[i-1])
                return false;
            if(arr[j] >= arr[j-1] )
                return false;
        }
        
        return true;
        */
    }
}
/*Success
Details 
Runtime: 3 ms, faster than 27.48% of Java online submissions for Valid Mountain Array.
Memory Usage: 51.7 MB, less than 20.35% of Java online submissions for Valid Mountain Array.
Next challenges:
Minimum Number of Removals to Make Mountain Array*/
