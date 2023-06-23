import java.util.*;
public class Q1_TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            int res = target - num;
            if(map.containsKey(res)){
                int index = map.get(res);
                if(index == i) continue;
                return new int[]{i, index};
            }
        }
        return new int[]{};
    }

    public static void main(String args[]){
        int nums[] = {2,7,11,15};
        int target = 9;
        int index[] = twoSum(nums, target);
        System.out.println("Index: "+"[" + index[0]+", "+index[1]+"]");
    }
}
