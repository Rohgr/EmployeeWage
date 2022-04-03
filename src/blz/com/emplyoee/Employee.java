package blz.com.emplyoee;

public class Employee {
    public static final int IS_PRESENT = 1;
    public static final int IS_PART_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;

    public static void main(String[] args) {
        int salary ;
        int totalwage = 0;
        for (int day = 1; day <= 20; day++) {
            int random = (int) Math.floor(Math.random() * 10) % 3;
            int empHrs = switch (random) {
                case IS_PART_TIME -> 4;
                case IS_PRESENT -> 8;
                default -> 0;
            };
            salary = (empHrs * WAGE_PER_HOUR);
            totalwage = totalwage + salary;
        }
        System.out.println("Salary is:" + totalwage);
    }
}


