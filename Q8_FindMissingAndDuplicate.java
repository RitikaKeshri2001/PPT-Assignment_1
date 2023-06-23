public class Q8_FindMissingAndDuplicate {

    public static int[] missingDup(int[] nums) {
        long n = nums.length;
        // sum of n natural number
        long sumN = (n*(n+1))/2;
        //sum of square of n natural number
        long sumN2 = (n*(n+1)*(2*n+1))/6;

        // sumA : sum of elements of array
        // sumA2 : sum of square of elements of array.
        long sumA = 0, sumA2=0;
        for(int i=0; i<nums.length; i++){
            sumA += nums[i];
            sumA2 += (long)nums[i] * (long)nums[i];
        }

        // val1 = x-y = sumN - sumA;
        // val2 = x^2 - y^2 = sumN2 - sumA2;
        long val1 = sumN - sumA;
        long val2 = sumN2 - sumA2;

        // x+y = (x^2 - y^2)/(x - y)
        val2 = val2/val1;

        //x:-Missing value and y:-Duplicate value
        long x = (val1 + val2)/2;
        long y = x - val1;
        int ans[] = {(int)x, (int)y};
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,2,4};
        int ans[] = missingDup(nums);
        System.out.println("Missing Value: "+ans[0]);
        System.out.println("Duplicate Value: "+ans[1]);
    }
}
