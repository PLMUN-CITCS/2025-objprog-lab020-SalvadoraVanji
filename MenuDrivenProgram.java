import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nMenu:\n1. Greet User\n2. Check Even/Odd\n3. Exit");
            System.out.print("Enter your choice (1-3): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input.");
                scanner.next();
                continue;
            }

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello! Welcome!");
                    break;
                case 2:
                    System.out.print("Enter an integer: ");
                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid input.");
                        scanner.next();
                        continue;
                    }
                    int num = scanner.nextInt();
                    System.out.println(num + " is " + (num % 2 == 0 ? "Even" : "Odd") + ".");
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}


