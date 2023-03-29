package Recursion;

public class Recursion2 {
    public static int first = -1;
    public static int last = -1;

    public static void Strings(int ind, String sor, char ele) {

        if (ind == sor.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char cur = sor.charAt(ind);
        if (cur == ele) {
            if (first == -1) {
                first = ind;
            } else {
                last = ind;
            }
        }
        Strings(ind + 1, sor, ele);
    }

    public static void main(String[] args) {
        String sor = "abbaacdbca";
        Strings(0, sor, 'a');
    }
}
