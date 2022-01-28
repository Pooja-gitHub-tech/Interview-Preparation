/* --------------- Question :       https://leetcode.com/problems/maximum-xor-of-two-numbers-in-an-array/  ----------------------*/

class Solution {
    public static int findMaximumXOR(int[] nums) {
        Trie trie = new Trie();
        int maximum = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < nums.length; i++) {
            trie.insert(nums[i]);
        }
        
        for(int i = 0 ; i < nums.length; i++) {
            maximum = Math.max(maximum, trie.getMax(nums[i]));
        }
        return maximum;
    }
}

class Node {
    
    Node links[] = new Node[2];
    
    Node get(int bit) {
        return links[bit];
    }
    
    void put(int bit, Node n) {
        links[bit] = n;
    }
    
    boolean containsKey(int bit) {
        return (links[bit] != null);
    }
    
}

class Trie {
    private static Node root;
    
    Trie() {
        root = new Node();
    }
    
    public static void insert(int num) {
        Node node = root;
        for(int i = 31 ; i >= 0 ; i--) {
            int bit = (num >> i) & 1;
            if(!node.containsKey(bit)) {
                node.put(bit,new Node());
            }
            node = node.get(bit);
        }
    }
    
    public int getMax(int num) {
        Node node = root;
        int maxNum = 0 ;
        for(int i = 31 ;i >= 0; i--) {
            int bit = (num >> i) & 1;
            if(node.containsKey(1-bit)) {
                maxNum = maxNum | 1 << i ;
                node = node.get(1-bit);
            } else {
                node = node.get(bit);
            }
        }
        return maxNum;
    }
    
}

/*Success
Details 
Runtime: 126 ms, faster than 74.52% of Java online submissions for Maximum XOR of Two Numbers in an Array.
Memory Usage: 80 MB, less than 56.08% of Java online submissions for Maximum XOR of Two Numbers in an Array.
Next challenges:
Maximum XOR With an Element From Array*/
