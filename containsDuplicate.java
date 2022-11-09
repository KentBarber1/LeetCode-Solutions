import java.util.Set;
import java.util.HashSet;

public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // Create hashset to store unique numbers
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
