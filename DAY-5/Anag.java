import java.util.Arrays;

public class Anag {
    public static void main(String[] args) {
        int[] freq = new int[26];
        Arrays.fill(freq, 0);
        String str = "smile";
        String anag = "miles";
        if (str.length() == anag.length()) {
            for (int i = 0; i < str.length(); i++) {
                freq[str.charAt(i) - 97]++;
                freq[str.charAt(i) - 97]--;
            }
        } else {
            System.out.println("not an anagram");
            return;
        }
        for (int i : freq) {
            if (i != 0) {
                System.out.println("not an anagram");
                return;
            }
        }
        System.out.println("It is an anagram");

    }

}
