public class Day05 {
    public int minAddToMakeValid(String s) {

        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                cnt1++;
            } else if (s.charAt(i) == ')' && cnt1 > 0) {
                cnt1--;
            } else {
                cnt2++;
            }
        }
        return cnt1 + cnt2;

    }

    public static void main(String[] args) {
        Day05 d = new Day05();
        System.out.println(d.minAddToMakeValid("())("));
    }
}