public class EmpWageBuilder {
    public static void main(String[] args) {

        // TO CHECK IF EMPLOYEE IS PRESENT OR ABSENT

        // CONSTANT VARIABLE
        int IS_PRESENT = 1;

        // variable values
        int random = (int) (Math.random() * 10) % 2;            // TO GET RANDOM OUTPUT AS 0 OR 1
        System.out.println(random);

        // IF random == 1, then employee is PRESENT else ABSENT

        if (random == IS_PRESENT) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
