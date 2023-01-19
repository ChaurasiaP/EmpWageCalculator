public class EmpWageBuilder {
    public static void main(String[] args) {

        // UC3 WITH SWITCH CASE

        //constants
        int EMP_RATE_PER_HR = 20;

        //variables
        int empWorkingHrs;
        int dailyWage;

        int random = (int) (Math.random() * 10) % 3;         // TO GET RANDOM OUTPUT AS 0, 1 OR 2
        System.out.println(random);

        switch (random) {
            case 1:
                System.out.println("Employee is Present FULL TIME.");
                empWorkingHrs = 8;
                break;
            case 2:
                System.out.println("Employee is Present Part Time.");
                empWorkingHrs = 4;
                break;
            default:
                System.out.println("Employee is ABSENT.");
                empWorkingHrs = 0;
        }
        dailyWage = (EMP_RATE_PER_HR * empWorkingHrs);
        System.out.println("Employee has worked " + empWorkingHrs + ", hence earned a salary of Rs. " + dailyWage);
    }
}
