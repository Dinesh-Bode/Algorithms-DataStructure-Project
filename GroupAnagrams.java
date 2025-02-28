/*
Group Anagrams
https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/778
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> map = new HashMap<>();

        for(String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if(!map.containsKey(sortedWord)){
               map.put(sortedWord, new ArrayList<>());
            } 
            map.get(sortedWord).add(word);
        }
        
        return new ArrayList<>(map.values());  
    }
}

//TC - O(m * nlog(n))
//SC - O(n)
