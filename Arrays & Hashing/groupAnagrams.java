import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List> mapping = new HashMap<String, List>();

        for (String str : strs) {
            char[] count = new char[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            } 
            String key = String.valueOf(Arrays.toString(count));
            if(!mapping.containsKey(key)) {
                mapping.put(key, new ArrayList());
            }
            mapping.get(key).add(str);
        }
        return new ArrayList(mapping.values());
    }
}
