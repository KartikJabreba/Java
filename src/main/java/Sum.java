public class Sum {
    public  int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(i+j==target)
                    return new int[]{i, j};
            }
        }
        return new int[]{0};
    }
    public static void main(String[] args)
    {
        int[] num={2,7,11,5};
        int target=9;
        Sum sum=new Sum();
        sum.twoSum(num,target);
    }
}
