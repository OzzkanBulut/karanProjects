public class Solution {
    public int numberOfSteps(int num){
        int stepCount = 0 ;
        while(num!=1) {
            if (num % 2 == 0) {
                num = num/2;
                stepCount++;
            }else{
                num = (num *3) +1 ;
                stepCount++;
            }
        }


        return stepCount ;
    }
}
