public class studentdetails{
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java StudentDetails <name> <rollno> <dept>");
            return;
        }

        String name = args[0];
        String rollNo = args[1];
        String dept = args[2];

        System.out.println("===== Student Details =====");
        System.out.println("Name   : " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Dept   : " + dept);
        System.out.println("===========================");
