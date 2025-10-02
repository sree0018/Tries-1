package sree;

class Trie {
    TrieNode root;
    class TrieNode{
        TrieNode[] children;
        boolean isEnd;

        public TrieNode(){
            this.children= new TrieNode[26];
        }
    }
    public Trie() {
        this.root= new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode curr= root;
        for(char c: word.toCharArray()){
            if(curr.children[c-'a']== null){
                curr.children[c-'a']= new TrieNode();
            }
            curr= curr.children[c-'a'];
        }
        curr.isEnd= true;
    }
    
    public boolean search(String word) {
        TrieNode curr= root;
        for(char c: word.toCharArray()){
            if(curr.children[c-'a']== null){
                return false;
            }
            curr= curr.children[c-'a'];
        }
        return curr.isEnd;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr= root;
        for(char c: prefix.toCharArray()){
            if(curr.children[c-'a']== null){
                return false;
            }
            curr= curr.children[c-'a'];
        }
        return true;
    }
}
