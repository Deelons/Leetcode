import java.util.*;
public class MoveZeros {
	public void moveZeros(int[] nums) {
		for (int lastNoneNegative = 0,cur = 0; cur < nums.length; cur++ ) {
			if (nums[cur] != 0) {
				int temp = nums[cur];
				nums[cur] = nums[lastNoneNegative];
				nums[lastNoneNegative++] = temp;
			}
		}
	}

	public static void main(String[] args) {
		MoveZeros moveZeros = new MoveZeros();
		int[] nums = {1,0,0,2,3};
		moveZeros.moveZeros(nums);
		System.out.println(Arrays.toString(nums));
	}
}