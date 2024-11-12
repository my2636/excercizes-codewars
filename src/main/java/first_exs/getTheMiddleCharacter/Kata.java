package first_exs.getTheMiddleCharacter;

public class Kata {
    public static String getMiddle(String word) {
        char[] charArray = word.toCharArray();
        int middle = charArray.length / 2;
        return charArray.length % 2 == 0 ? Character.toString(charArray[middle - 1]) +
                charArray[middle] : Character.toString(charArray[middle]);
    }
} //shoto