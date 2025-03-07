import java.util.*;
//3. Longest Substring Without Repeating Characters
class LongestSubString {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int max = 0;
        int right = 0;
        int left = 0;
        while(right < s.length()){
            char c = s.charAt(right);
            if(seen.add(c)){
                max = Math.max(max, right - left +1);
                right++;
            }else{
                while(s.charAt(left) != c){
                    seen.remove(s.charAt(left));
                    left++;
                }
                seen.remove(c);
                left++;
            }
        }
        return max;
    }
}