import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string to see if its a palindrome : ");
        String s = scan.nextLine();

        if(solution.checkPalindrome(s)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome!");
        }
    }
}