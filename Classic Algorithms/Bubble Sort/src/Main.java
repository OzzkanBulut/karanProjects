import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] numbers = new int[]{1,2,3,4,1,123,34,123,22,45,676};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.bubbleSort(numbers)));
    }
}