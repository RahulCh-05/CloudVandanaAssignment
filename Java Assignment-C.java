import java.util.*;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        input = input.toLowerCase();
        boolean[] isPresent = new boolean[26];

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                isPresent[c - 'a'] = true;
            }
        }

        for (boolean letterPresent : isPresent) {
            if (!letterPresent) {
                return false;
            }
        }

        return true;
    }
}
