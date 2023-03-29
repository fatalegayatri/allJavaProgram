// import java.util.*;;

public class Strings {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("GAYATRI");

        // System.out.println(name);
        for (int i = 0; i < name.length() / 2; i++) {
            int fornt = i;
            int last = name.length() - i - 1;

            char frontChar = name.charAt(fornt);
            char lastChar = name.charAt(last);

            name.setCharAt(fornt, lastChar);
            name.setCharAt(last, frontChar);

        }
        System.out.print(name);
    }
}
