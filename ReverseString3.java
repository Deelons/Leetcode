public class ReverseString3 {
    public static String reverseWords(String s) {
        String[] wordsArray = s.split(" ");
        StringBuilder result = new StringBuilder();
        System.out.println(wordsArray.length);

        for (int i = 0; i < wordsArray.length; i++) {
            char[] wordArray = wordsArray[i].toCharArray();
            char[] resultArray = new char[wordArray.length];
            for (int j = 0; j < wordArray.length; j++) {
                resultArray[j] = wordArray[wordArray.length - 1 - j];
            }

            result.append(new String(resultArray));
            if (i != wordsArray.length - 1) {
                result.append(" ");
            }
        }
        return new String(result);
    }

}