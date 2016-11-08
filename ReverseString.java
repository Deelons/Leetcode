public class ReverseString {
	public String reverseString(String s) {
		char c[] = new char[s.length()];
		c = s.toCharArray();
		char[] d = new char[s.length()];
		for (int i = c.length - 1; i >= 0; i--) {
			d[c.length - 1 - i] = c[i];
		}
		String result = new String(d);
		return result;
	}

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		System.out.println(reverseString.reverseString(""));
	}
}