public class Permutation {

    public static void printPermutation(String str, String permu, int idx) {
        if (str.length() == 0) {
            System.out.println(permu);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newStr, permu + curChar, idx + 1);
        }
    }

    public static void main(String[] args) {
        printPermutation("ABC", "", 0);

    }
}
