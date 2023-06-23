public class Q7_MoveZero {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int i=0;
        for(int num:nums){
            if(num != 0){
                nums[i] = num;
                i++;
            }
        }
        while(i<n){
            nums[i++] = 0;
        }
    }

    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        moveZeroes(nums);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
