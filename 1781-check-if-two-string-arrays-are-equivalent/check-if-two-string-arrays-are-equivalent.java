class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuilder res1 = new StringBuilder();
        StringBuilder res2 = new StringBuilder();

        for(String word : word1){
            res1.append(word);
        }

        for(String word : word2){
            res2.append(word);
        }

        return (res1.toString().equals(res2.toString()));
    }
}