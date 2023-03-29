/**
 * RecursionSubString
 */
public class RecursionSubString {
    public static void subSequence(String input, int idx, String newString) {
        if (idx == input.length()) {
            System.err.println(newString);
            return;
        }
        char curChar = input.charAt(idx);
        // want to add in sub string
        subSequence(input, idx + 1, newString + curChar);
        // if don't want in new string
        subSequence(input, idx + 1, newString);

    }

    public static void main(String[] args) {

        subSequence("abc", 0, "");
    }

}