import java.util.HashMap;

public class HshMap {
    public  int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int left=target-nums[i];
            if(map.containsKey(left))
                return new int[]{i,map.get(left)};
        }
        return new int[0];
    }
    public static void main(String[] args){
        int[] nums={2,7,11,15};
        int target=9;
        HshMap hshMap=new HshMap();
        System.out.println(hshMap.twoSum(nums,target));
        return;
    }
}
