public class Solution {
    public boolean checkPalindrome(String s){

        char[] ch = s.toCharArray();
        int size = ch.length;
        int temp = size;

        for(int i = 0 ; i<size;i++){
            if(ch[i]!=ch[temp-1]){
                return false;
            }else {
                temp--;
            }
        }
        return true;
    }
}
