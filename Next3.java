public class Next3 {

    public static int nextGreaterElement(int n) {
        char[] number = (n + "").toCharArray();
        int i,j;
        for (i = number.length - 1; i > 0; i--) {
            if (number[i - 1] < number[i])
                break;
        }
        System.out.println(i);

        if (i == 0) {
            return -1;
        }

        int x = number[i - 1],flag = i;
        for (j = i + 1; j < number.length; j++) {
            if (number[j] > x && number[j] < number[flag]) {
                flag = j;
            }
        }

        char temp = number[i - 1];
        number[i - 1] = number[flag];
        number[flag] = temp;

        Arrays.sort(number,i, number.length);

        long result = Long.parseLong(new String(number));

        return (result <= Integer.MAX_VALUE) ? (int)result : -1;

    }
}