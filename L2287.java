package LeetCode;
import java.util.*;
public class L2287 {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        for(char c : s.toCharArray()){
            map1.put(c, map1.getOrDefault(c,0)+1);
        }
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(char c : target.toCharArray()){
            map2.put(c, map2.getOrDefault(c,0)+1);
        }
        int min = Integer.MAX_VALUE;
        for(char c : map2.keySet()){
            if(!map1.containsKey(c)){
                return 0;
            }
            min = Math.min(min, map1.get(c) / map2.get(c));
        }
        return min;
    }
}
