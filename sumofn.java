public class sumofn {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + n + " numbers is: " + sum);
    }
}


//error got at the parameters passing bec in jenkins parameters will not accepted by scanner it will be through the args 
