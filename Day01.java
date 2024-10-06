class Day01 {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] s1cnt = new int[26];
        int[] s2cnt = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1cnt[s1.charAt(i) - 'a']++;
            s2cnt[s2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (matches(s1cnt, s2cnt)) {
                return true;

            }
            s2cnt[s2.charAt(i) - 'a']--;
            s2cnt[s2.charAt(i + s1.length()) - 'a']++;
        }
        return matches(s1cnt, s2cnt);
    }

    private boolean matches(int[] s1cnt, int[] s2cnt) {
        for (int i = 0; i < 26; i++) {
            if (s1cnt[i] != s2cnt[i])
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Day01 s = new Day01();
        boolean res = s.checkInclusion("ab", "eidbaooo");
        System.out.println(res);

    }
}