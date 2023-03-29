package Recursion;

public class MoveAllX {
    public static void MoveXEnd(int idx, String input, String newString, int count) {
        if (idx == input.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = input.charAt(idx);
        if (currChar == 'x') {
            count++;
            MoveXEnd(idx + 1, input, newString, count);
        } else {
            newString += currChar;
            MoveXEnd(idx + 1, input, newString, count);
        }

    }

    public static void main(String[] args) {
        String input = "sxkxegwxxewi", NewString = "";
        MoveXEnd(0, input, NewString, 0);
    }
}
