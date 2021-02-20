import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter sentence for vowel count: ");
        String s = input.nextLine();
        s = s.toLowerCase();

        int count = countVowels(s);
        System.out.println("Vowel count: " + count);
    }

    static int countVowels(String s) {
        int count = 0;
        char c;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
        }
        return count;
    }
}
