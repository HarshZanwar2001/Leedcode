import java.util.*;

public class Day06 {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; ++i) {
            if (s.isEmpty() || nums[s.peek()] > nums[i]) {
                s.push(i);
            }
        }

        int maxwdt = 0;
        for (int j = n - 1; j >= 0; --j) {
            while (!s.isEmpty() && nums[s.peek()] <= nums[j]) {
                maxwdt = Math.max(maxwdt, j - s.pop());
            }
        }
        return maxwdt;
    }

    public static void main(String[] args) {
        Day06 d = new Day06();
        System.out.println(d.maxWidthRamp(new int[] { 6, 0, 8, 2, 1, 5 }));
    }
}
