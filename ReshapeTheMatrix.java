public class ReshapeTheMatrix {
    /**
     * complex!
     * @param nums
     * @param r
     * @param c
     * @return
     */
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        if (r * c != nums.length * nums[0].length) {
            return nums;
        }
        if (nums.length == 0 || nums[0].length == 0) {
            return new int[0][0];
        }

        int i = 0;
        int[][] result = new int[r][c];
        int[] temp = new int[nums.length * nums[0].length];
        for (int[] num : nums) {
            int j = 0;
            for (; i < nums.length * nums[0].length; i++) {
                temp[i] = num[j++];
                if (j == nums[0].length) {
                    i++;
                    break;
                }
            }
        }

        int b = 0;
        for (int[] num : result) {
            for (int a = 0; a < c; a++) {
                num[a] = temp[b++];
            }
        }
        return result;
    }

    public int[][] solution(int[][] nums, int r, int c) {
        int n = nums.length, m = nums[0].length, k = 0;
        if (r * c != n * m) return nums;
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = nums[k/m][k%m];
            }
        }
        return result;
    }
}
