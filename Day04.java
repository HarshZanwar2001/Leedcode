public class Day04 {
    public int minSwaps(String s) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '[') {
                n++;
            } else if (n > 0) {
                n--;
            }
        }
        return (n + 1) / 2;

    }

    public static void main(String[] args) {
        Day04 d = new Day04();
        System.out.println(d.minSwaps("][]["));
    }
}
