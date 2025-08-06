public class CheckRotation {
    public static void main(String[] args) {
        String str = "abcd";
        String rotStr = "dabc";

        if (str.length() == rotStr.length()) {
            str = str + str;
            System.out.println("is it a rotated string of the original string?" + str.contains(rotStr));
        } else {
            System.out.println("is it a rotated string of the original string?:NO ");

        }
    }
}
