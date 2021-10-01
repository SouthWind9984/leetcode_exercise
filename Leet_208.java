package LeetCode_ADailyTopic;

public class Leet_208 {

}
/*
字典树
a
  p
    p
      p
        l
          e
 */
class Trie {

    //字典树节点
    class TrieNode{
        private TrieNode [] next = new TrieNode[26];
        private boolean isEnd;
        public void setIsEnd(boolean isEnd){
            this.isEnd = isEnd;
        }
    }

    private TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode();
    }


    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        int len = word.length();
        for (int i = 0; i < len; i++) {
            int index = word.charAt(i)-'a';
            if (node.next[index]==null){
                node.next[index] = new TrieNode();
            }
            node=node.next[index];
        }
        node.setIsEnd(true);
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = root;
        int len = word.length();
        for (int i = 0; i < len; i++) {
            int index = word.charAt(i)-'a';
            if (node.next[index]==null){
                return false;
            }
            node=node.next[index];
        }
        return node.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        int len = prefix.length();
        for (int i = 0; i < len; i++) {
            int index = prefix.charAt(i)-'a';
            if (node.next[index]==null){
                return false;
            }
            node=node.next[index];
        }
        return true;
    }
}
