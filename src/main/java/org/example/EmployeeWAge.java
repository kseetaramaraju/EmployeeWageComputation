package org.example;

public class EmployeeWAge {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private final String company;
    private final int EMP_RATE_PER_HRS;
    private final int NUM_OF_WORKING_DAYS;
    private final int MAX_HRS_IN_MONTHS;
    private int totalEmpWage;

    public EmployeeWAge(String company, int EMP_RATE_PER_HRS, int NUM_OF_WORKING_DAYS, int MAX_HRS_IN_MONTHS) {
        this.company = company;
        this.EMP_RATE_PER_HRS = EMP_RATE_PER_HRS;
        this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
        this.MAX_HRS_IN_MONTHS = MAX_HRS_IN_MONTHS;
    }

    public int computeEmpWage() {
//        System.out.println("HEELo");

        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkinDays = 0;

        while (totalEmpHrs <= MAX_HRS_IN_MONTHS && totalWorkinDays < NUM_OF_WORKING_DAYS) {
            totalWorkinDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day: " + totalWorkinDays + " Emp Hrs: " + empHrs);
        }
        totalEmpWage = totalEmpHrs * EMP_RATE_PER_HRS;
        return totalEmpWage;
    }

    @Override
    public String toString() {
        return "Total EmpWage for a company: " + " is" + totalEmpWage;
    }

    public static void main(String[] args) {
        EmployeeWAge dmart = new EmployeeWAge("Dmart", 20, 2, 10);
        EmployeeWAge reliance = new EmployeeWAge("Relaince", 10, 4, 20);
        dmart.computeEmpWage();
        System.out.println(dmart);
        reliance.computeEmpWage();
        System.out.println(reliance);
    }
}
