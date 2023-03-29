import java.util.*;

public class SetBit {
    public static void main(String[] args) {
        System.out.println("Enter a number ");
        int n;
        Scanner se = new Scanner(System.in);
        n = se.nextInt();
        System.out.println("Enter position to shift bit ");
        int pos;
        Scanner sr = new Scanner(System.in);
        pos = sr.nextInt();
        int shift = 1 << pos;// Bit mask
        int result = shift | n;// OR operation
        System.out.println(result);
    }
}
