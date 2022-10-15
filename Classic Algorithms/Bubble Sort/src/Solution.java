public class Solution {
    public int[] bubbleSort(int[] numbers) {

        int size = numbers.length;
        int temp ;
        for (int i = 0; i < size; i++) {
            for (int j = i ; j < size ; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        return numbers;
    }
}
