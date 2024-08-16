
public class Job {

    private final int id;
    private final String name;
    private final double salary;

    public Job(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getJobName() {
        return name;
    }

    public double getGrossSalary() {
        // Assuming gross salary is the same as the salary for simplicity
        return salary;
    }

//    public String getFullInfo() {
//        return "ID: " + id + ", Name: " + name + ", Salary: " + salary;
//    }
    public String getFullInfo() {
        return String.format("ID: %d, Name: %s, Salary: %.2f", id, name, salary);
    }

    public String reverseName() {
        return new StringBuilder(name).reverse().toString();
    }

    public boolean checkName() {
        // For simplicity, let's say it checks if the name length is greater than 3
        return name.length() > 3;
    }
}
