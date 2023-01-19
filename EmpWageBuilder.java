public class EmpWageBuilder {
    public static void main(String[] args) {

        // CALCULATE WAGE FOR A MONTH ASSUMING 20 WORKING DAYS

        //constants
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int IS_ABSENT = 0;
        int EMP_RATE_PER_HR = 20;
        int TOTAL_WORKING_DAYS = 20;

        //variables;
        int empHrs;
        int totalEarnings = 0;
        int dailyWage;
        int empDays = 0;

        for (int i = 0; i < TOTAL_WORKING_DAYS; i++) {
            int random = (int) (Math.random() * 10) % 3;
            empDays++;
            switch (random) {
                case 1:         // EMPLOYEE IS PRESENT FULL TIME
                    empHrs = 8;
                    dailyWage = empHrs * EMP_RATE_PER_HR;
                    totalEarnings = totalEarnings + dailyWage;
                    System.out.println("Earning on Day " + empDays + " is: " + dailyWage + " and Total Earnings: " + totalEarnings);
                    break;
                case 2:         // EMPLOYEE IS PRESENT HALF TIME
                    empHrs = 4;
                    dailyWage = empHrs * EMP_RATE_PER_HR;
                    totalEarnings = totalEarnings + dailyWage;
                    System.out.println("Earning on Day " + empDays + " is: " + dailyWage + " and Total Earnings: " + totalEarnings);
                    break;
                default:            // EMPLOYEE IS ABSENT
                    empHrs = 0;
                    dailyWage = empHrs * EMP_RATE_PER_HR;
                    totalEarnings = totalEarnings + dailyWage;
                    System.out.println("Earning on Day " + empDays + " is: " + dailyWage + " and Total Earnings: " + totalEarnings);
                    break;
            }
        }
        System.out.println("Employee has earned " + totalEarnings + " in a month");
    }
}
