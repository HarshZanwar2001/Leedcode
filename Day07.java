public class Day07 {
    public long minimumSteps(String s) {
        long swap = 0;
        int black = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                swap += (long) black;
            } else {
                black++;
            }
        }
        return swap;

    }

    public static void main(String[] args) {
        Day07 d = new Day07();
        System.out.println(d.minimumSteps("110110"));
    }
}
