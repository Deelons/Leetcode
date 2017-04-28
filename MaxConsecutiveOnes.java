public class MaxConsecutiveOnes {
    
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, here = 0;
        for (int n : nums)
            max = Math.max(max, here = n == 0 ? 0 : here + 1);
        return max;
    }


    /**
     * Too Complex!!!!
     * @param nums
     * @return
     */
    public static int findMaxConsecutiveOnesByString(int[] nums) {
        String str = "";

        for (int i = 0; i < nums.length; i++) {
            str = str + nums[i];
        }
        if (!str.contains("1")) {
            return 0;
        }
        String[] numsString = str.split("0");
        int[] result = new int[numsString.length];
        for (int i = 0; i < numsString.length; i++) {
            result[i] = numsString[i].length();
        }
        Arrays.sort(result);


        return result[numsString.length - 1];
    }


}