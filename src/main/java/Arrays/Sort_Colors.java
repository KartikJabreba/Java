package Arrays;

public class Sort_Colors {
    public static int sortColors(int[] nums,int n) {
        int count=0;
        int length=nums.length;
        for (int num : nums) {
            if (num > n) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0,4,5,6,8,6,4,7,9,4,9};
        int n=3;
        System.out.println(sortColors(nums,n));
    }
}
