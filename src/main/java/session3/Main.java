package session3;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
        private static HandleOrder  handleOrder;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the delivery system!");
        System.out.println("Please choose your delivery method:");
        System.out.println("1. Road");
        System.out.println("2. Sea");
        System.out.println("3. Exit");
        int choice = scanner.nextInt();


        switch (choice) {
            case 1:
                System.out.println("You chose option 1.");
                handleOrder = new RoadMethode();
                handleOrder.dispatch();
                break;
            case 2:
                System.out.println("You chose option 2.");
                handleOrder = new SeeMethode();
                handleOrder.dispatch();
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}