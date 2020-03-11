import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class lengthOfLongestSubstring {
    public static void main(String[] s) {
        int len=0;
        String Str="bpfbhmipx";

        len=Longest(Str);
        System.out.println(len);

    }
    private  static int Longest(String str){
        char[] ch=str.toCharArray();
        int len=0;
        int t=0;//标记当前map从哪里开始
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<ch.length;i++){

            if(map.containsKey(ch[i])){
                if(len<map.size())
                    len=map.size();
                t=map.get(ch[i]);
                map.clear();

                for(int j=t+1;j<=i;j++)
                    map.put(ch[j],j);


            }
            else {
                map.put(ch[i],i);
            }

        }
        if(len<map.size())
            len=map.size();
        return  len;
    }
}
