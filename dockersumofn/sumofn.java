public class sumofn{
    public static void main(String[] args) {
        int sum = 0;
        int n = 10;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        double average = (double) sum / n;

        System.out.println("Sum of first " + n + " numbers: " + sum);
        System.out.println("Average: " + average);
    }
}
