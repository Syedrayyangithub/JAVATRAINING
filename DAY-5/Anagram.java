import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        boolean isAnagram = true;
        String str = "smile";
        String anag = "miles";
        HashMap<Character, Boolean> mp = new HashMap<>();
        if (str.length() == anag.length()) {
            for (int i = 0; i < str.length(); i++) {
                mp.put(str.charAt(i), false);
            }
            for (int i = 0; i < anag.length(); i++) {
                if (mp.containsKey(anag.charAt(i))) {
                    mp.replace(anag.charAt(i), true);
                }
            }
            for (int i = 0; i < anag.length(); i++) {
                if (mp.get(str.charAt(i)) == false) {
                    isAnagram = false;
                }
            }
        } else {
            System.out.println("not an anagram");
            return;
        }

        if (isAnagram == true) {
            System.out.println("it is an anagram");
        } else {
            System.out.println("its not an anagram");
        }

    }

}
