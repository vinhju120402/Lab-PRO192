import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter price per unit: ");
        double price = scanner.nextDouble();

        System.out.print("Enter days to harvest: ");
        int daysToHarvest = scanner.nextInt();
        scanner.nextLine(); // Consume the remaining newline

        // Create an instance of LeafyVegetable
        LeafyVegetable vegetable = new LeafyVegetable(daysToHarvest, name, price);

        // Test options
        System.out.println("\n1. Test getName()");
        System.out.println("2. Test reducePrice(reduction:double)");
        System.out.println("3. Test toString() for Vegetable");
        System.out.println("4. Test toString() for LeafyVegetable");
        System.out.println("5. Test isSeasonal()");

        // User chooses which method to test
        System.out.print("\nEnter TC[1|2|3|4|5]: ");
        int testChoice = scanner.nextInt();

        // Perform the selected test
        switch (testChoice) {
            case 1:
                System.out.println("OUTPUT:");
                System.out.println(vegetable.getName());
                break;
            case 2:
                System.out.print("Enter amount to reduce price: ");
                double reduction = scanner.nextDouble();
                vegetable.reducePrice(reduction);
                System.out.println("OUTPUT:");
                System.out.printf("%.2f%n", vegetable.getPricePerUnit());
                break;
            case 3:
                // Assuming you want to print the Vegetable toString()
                System.out.println("OUTPUT:");
                System.out.println(new Vegetable(name, price));
                break;
            case 4:
                System.out.println("OUTPUT:");
                System.out.println(vegetable);
                break;
            case 5:
                System.out.println("OUTPUT:");
                System.out.println(vegetable.isSeasonal());
                break;
            default:
                System.out.println("Invalid test case number.");
                break;
        }

        scanner.close();
    }
}
