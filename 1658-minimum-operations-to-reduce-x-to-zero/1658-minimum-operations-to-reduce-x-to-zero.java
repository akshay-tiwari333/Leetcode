class Solution {
    public int minOperations(int[] nums, int x) {

        int sum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int t = sum - x;
        if(t < 0)
    return -1;

        int max = Integer.MIN_VALUE;
        int summ = 0;
        int j = 0;

        for(int i = 0; i < nums.length; i++) {

            summ += nums[i];

            while(summ > t) {
                summ = summ - nums[j];
                j++;
            }

            if(summ == t) {
                max = Math.max(max, i - j + 1);
            }
        }

        if(max == Integer.MIN_VALUE)
            return -1;

        return nums.length - max;
    }
}