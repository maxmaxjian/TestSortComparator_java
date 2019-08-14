import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2,1,3,5,4);

        Collections.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        System.out.println("After sorting:");
        nums.forEach(System.out::println);
    }
}
