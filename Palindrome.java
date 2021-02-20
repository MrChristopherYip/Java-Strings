import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter word: ");
        String s = input.next();

        boolean isPal = isPalindrome(s);
        System.out.println("\"" + s + "\"" + " is " + (isPal ? "" : "not ") + "a palindrome.");

        input.close();
    }

    static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return s.equalsIgnoreCase(sb.toString());
    }
}
