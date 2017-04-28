public class ReverseString2 {

    public static String ss(String s) {
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
    public static String reverseWords(String s) {
        String[] wordsArray = s.split(" ");
        if (wordsArray.length == 0 || s.equals("")) {
            return "";
        }


        String[] resultArray = new String[wordsArray.length];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < wordsArray.length; i++) {
            if (!wordsArray[wordsArray.length - 1 - i].equals("")) {
                resultArray[i] = wordsArray[wordsArray.length - 1 - i];
                result.append(resultArray[i]);
                if (i != wordsArray.length - 1) {
                    result.append(" ");
                }
            }
        }

        String temp = new String(result);
        if (temp.length() != 1 && temp.charAt(temp.length() - 1) == ' ') {
            String resultString = temp.substring(0,temp.length() - 1);
            return resultString;
        } else {
            return temp;
        }
    }

}