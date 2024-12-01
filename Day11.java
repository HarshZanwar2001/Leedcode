import java.util.HashSet;

public class Day11 {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i : arr) {
            if (set.contains(i * 2) || (i % 2 == 0 && set.contains(i / 2))) {
                return true;
            }
            set.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 2, 5, 3 };
        Day11 d1 = new Day11();
        System.out.println(d1.checkIfExist(arr));
    }
}
