import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many people are in the room?");
        int peopleInTheRoom = myScanner.nextInt();
        System.out.println("How many people are in the queue?");
        int peopleInTheQueue = myScanner.nextInt();

        if (peopleInTheQueue + peopleInTheRoom < 100) {
            System.out.println("Can fit");
        } else {
            System.out.println("Can't fit");
        }
    }
}
