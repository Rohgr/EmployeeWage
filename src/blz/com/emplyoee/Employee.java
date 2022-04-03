package blz.com.emplyoee;

public class Employee {
    public static final int IS_PRESENT = 1;
    public static final int IS_PART_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;

    public static void main(String[] args) {
        computewage("Ril", 10, 10, 50);
        computewage("Dmart", 25, 10, 20);
    }

    public static int computewage(String name, int empRatePerHr, int numOfDays, int maxHrs) {
        int salary;
        int totalHrs = 0;
        int totalWage = 0;
        int totalDays = 0;
        for (int day = 1; day <= numOfDays; day++) {
            int random = (int) Math.floor(Math.random() * 10) % 3;
            int empHrs = switch (random) {
                case IS_PART_TIME -> 4;
                case IS_PRESENT -> 8;
                default -> 0;
            };
            totalHrs = totalHrs + empHrs;
            totalDays = totalDays + day;
            totalWage = totalHrs * empRatePerHr;

            System.out.println("Day#: " + day + " Emp Hr: " + empHrs);
            if (totalHrs >= maxHrs) {
                System.out.println("Total Emp Wage for Company: " + name + " is " + totalWage);
                System.exit(0);
            }
        }
        System.out.println("Total Emp Wage for Company: " + name + " is " + totalWage);
        return totalWage;
    }
}


