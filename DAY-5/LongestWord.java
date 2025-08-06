public class LongestWord {
    public static void main(String[] args) {
        String str = "The quick  brown fox";
        int i = 0;
        int longest = 0;
        String[] strr = str.split(" ");
        int length = 0;

        for (i = 0; i < strr.length; i++) {
            length = strr[i].length();
            if (strr[i].length() > longest) {
                longest = strr[i].length();
            }
        }

        // while (i < str.length()) {
        // int currentLength = 0;
        // while (i < str.length() && str.charAt(i) != ' ') {
        // currentLength++;
        // i++;
        // }
        // if (currentLength > longest) {
        // longest = currentLength;
        // }
        // i++;
        // }

        System.out.println(longest);

    }
}
