public class EmpWageBuilder {
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int IS_ABSENT = 0;
    public static final int EMP_RATE_PER_HR = 20;
    public static final int TOTAL_WORKING_DAYS = 20;

    static int empHrs;
    static int totalEarnings = 0;
    static int dailyWage;
    static int empDays = 0;


    public static void main(String[] args) {
        getDailyWage();
        getSalary();
    }

    public static void getWage(){
        dailyWage = empHrs * EMP_RATE_PER_HR;
        totalEarnings = totalEarnings + dailyWage;
        System.out.println("Earning on Day " + empDays + " is: " + dailyWage );
    }
    public static void getDailyWage(){
        for (int i = 0; i < TOTAL_WORKING_DAYS; i++) {
            int random = (int) (Math.random() * 10) % 3;
            empDays++;
            switch (random) {
                case 1:         // EMPLOYEE IS PRESENT FULL TIME
                    empHrs = 8;
                    getWage();
                    break;
                case 2:         // EMPLOYEE IS PRESENT HALF TIME
                    empHrs = 4;
                    getWage();
                    break;
                default:            // EMPLOYEE IS ABSENT
                    empHrs = 0;
                    getWage();
                    break;
            }
        }
    }
    public static void getSalary(){
        System.out.println("Employee has earned " + totalEarnings + " in a month");
    }
}
