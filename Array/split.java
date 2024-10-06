package Array;
public class split {
    private String[] splitWords(String sentence) {
        return sentence.split(" ");
    }

    public static void main(String[] args) {
        split s = new split();
        String[] res = s.splitWords("Hello World");
        for (String word : res) {
            System.out.println(word);
        }
        
    }
    
}
