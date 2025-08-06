public class ReverseString {

    public static void main(String[] args) {
        String str = "mabcdefgh";
        StringBuilder s = new StringBuilder(str);
        for (int i = 0; i < s.length() / 2; i++) {
            int start = i;
            int end = s.length() - 1 - i;
            char startChar = s.charAt(start);
            char endChar = s.charAt(end);
            s.setCharAt(start, endChar);
            s.setCharAt(end, startChar);

        }
        System.out.println(s);

    }
}