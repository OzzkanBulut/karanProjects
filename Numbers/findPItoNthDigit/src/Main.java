import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Solution solution = new Solution();
        System.out.println("Enter a number limit for pi (Limit is 1000) : ");
        try{
            int lim = scan.nextInt();
            System.out.println("PI is : " + solution.generatePI(lim));
        } catch(Exception e){
            throw new Exception("Enter a number between 0-1000 !");
        }

    }
}