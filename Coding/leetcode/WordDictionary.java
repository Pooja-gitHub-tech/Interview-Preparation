/* --------------------------------------- Question: https://leetcode.com/problems/design-add-and-search-words-data-structure/ -----------*/

class WordDictionary {

    class Node {
        Node links[];
        Node() {
            links = new Node[26];
        }

        boolean flag = false;


        boolean containsKey(Character ch) {
            return (links[ch - 'a'] != null);
        }

        void put(Character ch, Node n) {
            links[ch - 'a'] = n;
        }

        Node get(Character ch) {
            return links[ch - 'a'];
        }

        void setFlag() {
            flag = true;
        }

        boolean isEnd() {
            return flag;
        }

        public boolean find(String word,int i) {
            if(i==word.length()) {
                return isEnd();
            }
            if(word.charAt(i) == '.') {
                for(Node child: links) {
                    if(child!= null && child.find(word,i+1)) {
                        return true;
                    }
                }
                return false;
            } else {
                if (links[word.charAt(i) - 'a'] == null)
                    return false;
                else
                    return links[word.charAt(i) - 'a'].find(word, i + 1);
            }
        }
    }

    private Node root;

    public WordDictionary() {
        root = new Node();
    }


    public void addWord(String word) {
        Node node = root;
        for(int i = 0 ; i < word.length(); i++) {
            Character ch = word.charAt(i);
            if(!node.containsKey(ch)) {
                Node n = new Node();
                node.put(ch,n);
            }
            node = node.get(ch);
        }
        node.setFlag();
    }

    public boolean search(String word) {
        Node node = root;
        return root.find(word,0);
    }
}

/*


Input/Output pattern :  Input
["WordDictionary","addWord","addWord","addWord","search","search","search","search"]
[[],["bad"],["dad"],["mad"],["pad"],["bad"],[".ad"],["b.."]]
Output
[null,null,null,null,false,true,true,true]

Explanation
WordDictionary wordDictionary = new WordDictionary();
wordDictionary.addWord("bad");
wordDictionary.addWord("dad");
wordDictionary.addWord("mad");
wordDictionary.search("pad"); // return False
wordDictionary.search("bad"); // return True
wordDictionary.search(".ad"); // return True
wordDictionary.search("b.."); // return True


Success
Details 
Runtime: 111 ms, faster than 24.17% of Java online submissions for Design Add and Search Words Data Structure.
Memory Usage: 81.8 MB, less than 15.42% of Java online submissions for Design Add and Search Words Data Structure.
Next challenges:
Implement Trie (Prefix Tree)
Prefix and Suffix Search*/



