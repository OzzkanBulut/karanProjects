public class Solution {
    public void countWords(String s) {

        char[] ch = s.toCharArray();
        int size = ch.length;
        int i=size-1,count=1;
        while(ch[i]==' '){
            i--;
        }
        for(;i>=0;i--){
            if(ch[i]==' '){
                count++;
            }

        }
        System.out.println(count);


    }
}
