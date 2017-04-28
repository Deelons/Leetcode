public class ConstructRectangle {
    public static int[] constructRectangle(int area) {
        int[] result = new int[2];
        int num = (int)Math.sqrt(area);
        while(area%num != 0) num--;
        result[0] = area/num;
        result[1] = num;
        return result;
    }
}
