/*------- Question: https://leetcode.com/problems/sequential-digits/ ------------------*/
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> output = new ArrayList<>();
        String digits = "123456789";
        int nl = String.valueOf(low).length();
        int nh = String.valueOf(high).length();
        //System.out.println("length of s1 "+nl);
        
        for(int i = nl ; i <= nh ; i++) {
            for(int j = 0; j < 10 - i ; j++ ){
                int temp = Integer.parseInt(digits.substring(j, j+i));
                if(temp >= low && temp <= high)
                    output.add(temp);
            }
        }
        
        
        return output;
    }
}


/*Success
Details 
Runtime: 1 ms, faster than 41.30% of Java online submissions for Sequential Digits.
Memory Usage: 37.7 MB, less than 52.72% of Java online submissions for Sequential Digits.
Next challenges:
Detect Pattern of Length M Repeated K or More Times
Count Subtrees With Max Distance Between Cities
Next Greater Numerically Balanced Number
*/
