import java.util.Scanner;

public class Consonants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String s = input.nextLine();

        String t = s.toLowerCase();
        System.out.println("Consonant count: " + countCons(t));

        s = s.replaceAll("(?![AEIOUaeiou])[B-Zb-z]", "*");
        System.out.println(s);

        input.close();
    }

    private static int countCons(String s) {
        int count = 0;
        char c;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);

            if (Character.isLetter(c)) {
                if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')
                    count++;
            }
        }
        return count;
    }
}
