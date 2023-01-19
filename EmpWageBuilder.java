public class EmpWageBuilder {
    public static void main(String[] args) {

        // TO CALCULATE DAILY WAGE OF EMPLOYEE

        // CONSTANT VALUES
        int IS_PRESENT = 1;
        int EMP_RATE_PER_HR = 20;
        int EMP_HRS = 8;

        // variable values
        int random = (int) (Math.random() * 10) % 2;       // TO GET RANDOM OUTPUT AS 0 OR 1
        System.out.println(random);

        int EmpWage;

        // IF random == 1, then employee is PRESENT else ABSENT
        if (random == IS_PRESENT) {
            EmpWage = (EMP_RATE_PER_HR * EMP_HRS);
        } else {
            EmpWage = 0;
        }
        System.out.println("Daily Wage of the Employee is: " + EmpWage);
        System.out.println("UC2 Ends here");
    }
}
