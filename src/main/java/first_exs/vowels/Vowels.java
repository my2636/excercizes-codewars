package first_exs.vowels;

public class Vowels {
    static char[] charArr = {'a', 'e', 'i', 'o', 'u'};

    public static int getCount(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            for(int j = 0; j < charArr.length; j++) {
                if(str.charAt(i) == charArr[j]) { count++; }
            }
        }
        return count;
    }
}