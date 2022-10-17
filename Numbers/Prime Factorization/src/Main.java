import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = scan.nextInt();

        solution.primeFactors(num);
    }
}