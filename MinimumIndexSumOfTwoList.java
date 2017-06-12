public class MinimumIndexSumOfTwoList {
	public String[] findRestaurant(String[] list1, String[] list2) {
		String[] result = new String[1];

        int a = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    a = Math.min(i,j) <= a ? Math.min(i,j) : a;
                    if (a == i) {
                        result[0] = list1[i];
                    } else {
                        result[0] = list2[j];
                    }

                }
            }
        }

        return result;


	}
}