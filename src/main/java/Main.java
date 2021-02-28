import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> team = new Stack<>();

        PointGuard pointGuard1 = new PointGuard("Kyrie Irving", "6'2", 27.4);
        PointGuard pointGuard2 = new PointGuard("Stephen Curry", "6'3", 29.9);
        PointGuard pointGuard3 = new PointGuard("Chris Paul", "6'0", 16.6);
        PointGuard pointGuard4 = new PointGuard("Damian Lillard", "6'2", 29.8);
        PointGuard pointGuard5 = new PointGuard("Russell Westbrook", "6'3", 19.7);


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the 2021 NBA Draft!");

        boolean run = true;

        while (run) {
            System.out.println("Choose which position you would like to see!");
            System.out.println("1. Point Guard \n" +
                    "2. Shooting Guard \n" +
                    "3. Small Forward \n" +
                    "4. Power Forward \n" +
                    "5. Center \n");

            String choice = scanner.nextLine().toLowerCase().toUpperCase();
            System.out.println("You've chosen to see the list of " + choice + "'s");
            System.out.println(pointGuard1);
            System.out.println();
            System.out.println(pointGuard2);
            System.out.println();
            System.out.println(pointGuard3);
            System.out.println();
            System.out.println(pointGuard4);
            System.out.println();
            System.out.println(pointGuard5);
            System.out.println();

            String choice2 = scanner.nextLine();


            if (choice2.equals("Kyrie Irving") || choice2.equals("Kyrie")) {
                System.out.println(pointGuard1);
            } else if (choice2.equals("Stephen Curry") || choice2.equals("Steph")) {
                System.out.println(pointGuard2);
            } else if (choice2.equals("Chris Paul") || choice2.equals("CP3")) {
                System.out.println(pointGuard3);
            } else if (choice2.equals("Damian Lillard") || choice2.equals("Dame")) {
                System.out.println(pointGuard4);
            } else if (choice2.equals("Russell Westbrook") || choice2.equals("Russ")) {
                System.out.println(pointGuard5);
            }

            System.out.println();

            System.out.println("Your point guard is " + choice2);

            team.add(choice2);

            System.out.println("Your team: " + "\n" + team);
            System.out.println();

            System.out.println("Which position would you like to view next?");

        }





    }

}
