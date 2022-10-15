import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        Solution solution = new Solution();
        System.out.println("Enter a limit for number e between 0-1000:");
        try {
            int lim = scan.nextInt();
            System.out.println("e : "+ solution.findE(lim));
        } catch (Exception e) {
            throw new Exception("Number is out of limits!");
        }
    }
}