public class Day02 {
    private String[] splitWords(String sentence) {
        return sentence.split(" ");
    }

    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] str1 = splitWords(sentence1);
        String[] str2 = splitWords(sentence2);

        if (str1.length < str2.length) {
            String[] temp = str1;
            str1 = str2;
            str2 = temp;
        }

        int start = 0, end = 0;
        int n1 = str1.length, n2 = str2.length;

        while (start < n2 && str1[start].equals(str2[start])) {
            start++;
        }

        while (end < n2 && str1[n1 - end - 1].equals(str2[n2 - end - 1])) {
            end++;
        }

        return start + end >= n2;
    }

    public static void main(String[] args) {
        Day02 s = new Day02();
        boolean res = s.areSentencesSimilar("Hello World", "Hello Wor");
        System.out.println(res);
    }
}