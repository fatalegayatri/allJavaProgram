public class ResursionHanai {
    public static void Hanai(int n, String S, String H, String D) {
        if (n == 1) {
            System.out.println(" Transfer Disk  " + n + " Form  " + S + " to " + D);
            return;
        }
        // to transfer n-1 disk from sor to help
        Hanai(n - 1, S, D, H);
        System.out.println("Transfer Disk  " + n + " Form  " + S + " to " + D);
        // to transfer n-1 disk from help as sor to destination
        Hanai(n - 1, H, S, D);

    }

    public static void main(String[] args) {
        int ring = 3;
        String S = "Sor", H = "Hel", D = "Desti";
        Hanai(ring, "Sor", "H", "D");
    }
}
