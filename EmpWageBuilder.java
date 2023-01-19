public class EmpWageBuilder {
    public static void main(String[] args) {

        // TO CHECK IF EMPLOYEE IS PRESENT FULL TIME OR PART TIME AND COMPUTE THEIR WAGE FOR THE DAY

        // CONSTANT VALUES
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int EMP_RATE_PER_HR = 20;

        //variables
        int EmpWorkingHrs;
        int TotalEarnings;

        int random = (int) (Math.random() * 10) % 3;         // TO GET RANDOM OUTPUT AS 0, 1 OR 2
        System.out.println(random);

        // IF EMPLOYEE IS FULL TIME EMP WORKING HRS == 8 , FOR PART TIME EMP HRS == 4
        if (IS_FULL_TIME == random) {
            EmpWorkingHrs = 8;
            TotalEarnings = (EmpWorkingHrs * EMP_RATE_PER_HR);
            System.out.println("Employee is Full Time with salary: " + TotalEarnings);
        } else if (IS_PART_TIME == random) {
            EmpWorkingHrs = 4;
            TotalEarnings = (EmpWorkingHrs * EMP_RATE_PER_HR);
            System.out.println("Employee is Part Time with Salary: " + TotalEarnings);
        } else {
            TotalEarnings = 0;
            System.out.println("Employee is Absent, hence salary: " + TotalEarnings);
        }
        System.out.println("UC3 ends");
    }
}
