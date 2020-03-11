import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//复杂度O（1）
//1。把数组的数据放入map，使用hashmap的key查找
//2。map的key查找有重复的问题，所以在数组放入map的时候进行判断，若满足符合target一半且重复，直接返回结果。
//3。为了防止受有且仅有一个且是target一半的数据干扰，在判断该数据有匹配项之后，删除该数据，并再次检查。
class findTwoNum {
    public static void main(String[] args){
        int[] num1={3,7,8,5,10};
        int[] num2={4,9,4};
        int[] num3={1,-1,9};
        int[] num4={3,3,5};
        int target=8;
        System.out.println(Arrays.toString(findTwoNum(num1, target)));
        System.out.println(Arrays.toString(findTwoNum(num2, target)));
        System.out.println(Arrays.toString(findTwoNum(num3, target)));
        System.out.println(Arrays.toString(findTwoNum(num4, target)));
    }
    private static int[] findTwoNum(int[] num, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int find[];
        for (int i = 0; i < num.length; i++) {
            if (map.containsKey(num[i]) && num[i] == (target / 2)) {
                find = new int[]{map.get(target - num[i]), i};
                return find;
            }
                map.put(num[i], i);
        }
        for (int i = 0; i < num.length; i++) {
            if (map.containsKey(target-num[i])) {
                map.remove(num[i]);
                if(map.containsKey(target-num[i])) {
                    find = new int[]{i, map.get(target - num[i])};
                    return find;
                }

            }
        }
        return null;
    }
}