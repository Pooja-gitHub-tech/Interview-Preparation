/* ================== Question : https://leetcode.com/problems/add-digits/ ===========================*/
class Solution {
    public int addDigits(int num) {
        if(num == 0)
            return 0;
        else if(num % 9 == 0)
            return 9;
        else 
            return num % 9;
        
        /* int sum = 0 ; 
        int a = num;
        if(num / 10 == 0)
            return num;
        while(a != 0) {
            sum = sum + a%10;
            a = a/10;
        }
        return addDigits(sum);
        */
    }
    
}




/*Success
Details 
Runtime: 2 ms, faster than 59.15% of Java online submissions for Add Digits.
Memory Usage: 42.5 MB, less than 5.27% of Java online submissions for Add Digits.
Next challenges:
Happy Number
Sum of Digits in the Minimum Number
Sum of Digits of String After Convert
Minimum Sum of Four Digit Number After Splitting Digits*/
