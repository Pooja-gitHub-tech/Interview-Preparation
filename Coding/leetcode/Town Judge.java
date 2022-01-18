/*---------------------- Question: https://leetcode.com/problems/find-the-town-judge/ ----------------*/

class Solution {
  int findTownJudge(int n, int trust[][]) {
    int trusted [] = new int[n+1];
    for(int person[] : trust) {
      trusted[person[0]]--;
      trusted[person[1]]++;
    }
    
    for(int i = 1 ; i <= n ; i++) {
      if(trusted[i]==n-1)
        return i;
    }
    return -1;
  }
}


/*Success
Details 
Runtime: 3 ms, faster than 91.76% of Java online submissions for Find the Town Judge.
Memory Usage: 47.1 MB, less than 74.21% of Java online submissions for Find the Town Judge.
*/
