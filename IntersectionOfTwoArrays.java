public class IntersectionOfTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {

	if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
	    return new int[0];
	}
	Arrays.sort(nums1);
	Arrays.sort(nums2);

	int i = 0;
	int j = 0;

	int index = 0;
	int[] temp = new int[nums1.length];

	while (i < nums1.length && j < nums2.length) {
	    if (nums1[i] == nums2[j]) {
	        if (index == 0 || temp[index - 1] != nums1[i]) {
	            temp[index++] = nums1[i];
	        }
	        i++;
	        j++;
	    } else if (nums1[i] < nums2[j]) {
	        i++;
	    } else {
	        j++;
	    }
	}

	int[] result = new int[index];
	for (int k = 0; k < index; k++) {
	    result[k] = temp[k];
	}

	return result;
	}
}