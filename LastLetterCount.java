import java.util.Scanner;

public class LastLetterCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String s = input.nextLine();
        String[] sArray = s.split("\\s+");

        System.out.println("Words ending with 's' count: " + countWordsEndWith(sArray, "s"));
        System.out.println("Words ending with 'y' count: " + countWordsEndWith(sArray, "y"));

        s = swapFirstSY(sArray);
        System.out.println(s);

        input.close();
    }

    private static int countWordsEndWith(String[] sArray, String c) {
        int count = 0;

        for (String s : sArray) {
            if (s.endsWith(c))
                count++;
        }
        return count;
    }

    private static String swapFirstSY(String[] sArray) {
        int first = -1, second = -1, i = 0;

        while (i < sArray.length && (first == -1 || second == -1)) {
            if (first == -1 && sArray[i].endsWith("s")) {
                first = i;
            }
            if (second == -1 && sArray[i].endsWith("y")) {
                second = i;
            }
            i++;
        }

        if (first != -1 && second != -1) {
            String s1 = sArray[first];
            sArray[first] = sArray[second];
            sArray[second] = s1;
        }

        StringBuilder sb = new StringBuilder();
        for (String s : sArray) {
            sb.append(s);
            sb.append(" ");
        }
        return sb.toString();
    }
}
