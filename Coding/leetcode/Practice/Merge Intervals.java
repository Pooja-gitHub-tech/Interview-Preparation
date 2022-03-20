/* --------------- Question : https://leetcode.com/problems/merge-intervals/ ---------------------------------------*/

class Solution {
    public int[][] merge(int[][] intervals) {
        //[ [1,3], [2,4], [2,6], [8,9]]
        
        List<int[]> result = new ArrayList<>();
        //Integer [][] arr = new int[][];
        
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        int start = intervals[0][0];
        int end = intervals[0][1];
        
        for(int[] row : intervals) {
            if(row[0]<=end) {
                end = Math.max(end,row[1]);
            } else {
                result.add(new int[]{start,end});
                start = row[0];
                end = row[1];
            }
        }
        
        result.add(new int[]{start,end});
        int[][] ans = new int[result.size()][];
        
        /*for(int i = 0 ; i < result.size(); i++) {
            for(int j = 0 ; j < result.get(i).length; j++) {
                ans[i][j] = result.get(i)[j];
            }
        }*/
        return result.toArray(new int[0][]);
    }
}

/*
Success
Details 
Runtime: 15 ms, faster than 40.65% of Java online submissions for Merge Intervals.
Memory Usage: 55.7 MB, less than 15.85% of Java online submissions for Merge Intervals.
Next challenges:
Insert Interval
Meeting Rooms
Meeting Rooms II
Teemo Attacking
Add Bold Tag in String
Range Module
Employee Free Time
Partition Labels
Interval List Intersections
Amount of New Area Painted Each Day
Longest Substring of One Repeating Character
*/
