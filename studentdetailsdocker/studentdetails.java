public class studentdetails {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java StudentDetails <Name> <RollNo> <Department>");
            return;
        }

        String name = args[0];
        String rollNo = args[1];
        String department = args[2];

        System.out.println("Student Details:");
        System.out.println("Name      : " + name);
        System.out.println("Roll No   : " + rollNo);
        System.out.println("Department: " + department);
    }
}
