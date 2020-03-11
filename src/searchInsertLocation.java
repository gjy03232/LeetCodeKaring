public class searchInsertLocation {
    public static void main(String[] args){
        int[] num={1,3,5,6};
        int target=5;
        System.out.println(searchInsert(num,target));
    }
    private static int searchInsert(int[] num,int target){
        int result =0;
        for(int i=0;i<num.length;i++){
            if (num[i]>=target) {
                result = i;
                return result;
            }
        }
        return num.length;
    }

}
