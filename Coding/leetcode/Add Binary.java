/*--------------------------- Question : https://leetcode.com/problems/add-binary/ ------------------*/

class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        Integer sum,carry = 0;
        for(int i = a.length() -1 , j = b.length() - 1; i>=0 || j>=0 ; i--,j--) {
            sum = carry;
            if(i>=0) {
                sum+= a.charAt(i) - '0';
            }
            if(j>=0) {
                sum+= b.charAt(j) - '0';
            }
            carry = sum / 2;
            sum = sum % 2;
            result = result.append(sum.toString());
            
        }
        
        if(carry!=0)
            result.append('1');
        return result.reverse().toString();
    }
}

/*Success
Details 
Runtime: 4 ms, faster than 42.09% of Java online submissions for Add Binary.
Memory Usage: 39.6 MB, less than 29.08% of Java online submissions for Add Binary.*/
