import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.println("Enter a number : ");
        int num = scan.nextInt();
        System.out.println("Required steps to reach number one : "+ solution.numberOfSteps(num));
    }
}