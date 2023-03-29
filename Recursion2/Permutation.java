public class Permutation {
    public static void permuteString(String str, String permuteString) {
        if (str.length() == 0) {
            System.out.println(permuteString);
            return;
        }
        for (int i = 0; i < str.length(); i++) {

            char currChar = str.charAt(i);
            // to convert current string into newstring(abc --> bc)
            String newstr = str.substring(0, i) + str.substring(i + 1);
            permuteString(newstr, permuteString + currChar);

        }
    }

    public static void main(String[] args) {
        permuteString("abc", "");
    }
}
