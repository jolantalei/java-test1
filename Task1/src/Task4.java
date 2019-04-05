import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String word = myScanner.next();
        char palindrome;
        for (int i = word.length() - 1; i >= 0; i--) {
            palindrome = word.charAt(i);
            System.out.print(word.charAt(i));//izdrukā pretējā virzienā

            if (palindrome == word) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }
}