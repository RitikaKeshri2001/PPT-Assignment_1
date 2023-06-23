public class Q3_SearchElement {

    public static int valIndex(int[] nums, int target){
        int i = nums.length/2;
        while(i>=0 && i<nums.length){
            if(nums[i] == target) return i;
            else if(nums[i] < target){
                i++;
            } else {
                i--;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        int target = 5;
        System.out.println(valIndex(nums, target));
    }
}
