/* ---------- Question: https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/ ----------------*/

class Solution {
    public int mostWordsFound(String[] sentences) {
        int length = Integer.MIN_VALUE;
        for(String x : sentences) {
            length = Math.max(length, x.split("\\s").length);
        }
        return length;
    }
}

/*Success
Details 
Runtime: 41 ms, faster than 5.17% of Java online submissions for Maximum Number of Words Found in Sentences.
Memory Usage: 47.8 MB, less than 5.02% of Java online submissions for Maximum Number of Words Found in Sentences.
Next challenges:
Number of Valid Words in a Sentence
