import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class findContinuousSequence {
    public static void main(String[] arr){
        int target=94527;


        BigDecimal sum = new BigDecimal( 47263 * (47263 - 1));
        System.out.println(sum);
        System.out.println(Arrays.deepToString(ArrayListfind(target)));
    }
    private static int[][] ArrayListfind(int tartget) {
        List<int[]> list = new ArrayList<>();
        int num=0;
        for (int i = 1; i <= (tartget + 1) / 2; i++) {

            double sum = Math.sqrt(tartget * 2 + i * (i - 1) + 1 / 4D) - 1 / 2D;

            if (Math.round(sum) - sum == 0) {
                num=0;
                int[] lists=new int[(int)sum-i+1];
                for (int j=i;j<=sum;j++)
                    lists[num++]=j;
                list.add(lists);

            }

        }
        return list.toArray(new int[0][]) ;
    }

}
