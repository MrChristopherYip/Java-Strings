import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String s = input.nextLine();

        System.out.println("Sentence word count: " + countWords(s));

        input.close();
    }

    private static int countWords(String s) {
        if (s.isEmpty())
            return 0;
        return s.split("\\s+").length;
    }
}
