import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter id: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left-over

        Job job = new Job(id, name, salary);

        System.out.println("\n1.Test getJobName()");
        System.out.println("2.Test getGrossSalary()");
        System.out.println("3.Test getFullInfo()");
        System.out.println("4.Test reverseName()");
        System.out.println("5.Test checkName()");

        System.out.print("\nEnter TC(1|2|3|4|5): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("OUTPUT:");
                System.out.println(job.getJobName());
                break;
            case 2:
                System.out.println("OUTPUT:");
                System.out.println(job.getGrossSalary());
                break;
            case 3:
                System.out.println("OUTPUT:");
                System.out.println(job.getFullInfo());
                break;
            case 4:
                System.out.println("OUTPUT:");
                System.out.println(job.reverseName());
                break;
            case 5:
                System.out.println("OUTPUT:");
                System.out.println(job.checkName());
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
