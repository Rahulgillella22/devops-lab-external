public class studentdetails{
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java StudentDetails <name> <rollNo> <dept>");
            return;
        }

        String name = args[0];
        int rollNo = Integer.parseInt(args[1]);
        String dept = args[2];

        System.out.println("===== Student Details =====");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Department: " + dept);
        System.out.println("===========================");
    }
}
