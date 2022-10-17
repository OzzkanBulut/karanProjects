public class Solution {
    public void reverse(String s){
        char[] ch =  s.toCharArray();
        int size = ch.length;
        for(int i=size-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }
}
