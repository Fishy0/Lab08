import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        SafeInput.prettyHeader("12345 (odd)");
        System.out.println();
        System.out.println();
        System.out.println();
        SafeInput.prettyHeader("12345 (even)");

    }
}

