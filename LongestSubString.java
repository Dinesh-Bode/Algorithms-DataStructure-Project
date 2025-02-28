/*

https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

Given a string s, find the length of the longest substring without duplicate characters.
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        
        for(int right = 0; right<s.length(); right++) {
            if(!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(right-left+1, maxLength);
            } else {
              while(set.contains(s.charAt(right))) { //To remove duplicates
                  set.remove(s.charAt(left));
                  left++;
              }  
              set.add(s.charAt(right));  
            }
        }
        return maxLength;
    }
}
