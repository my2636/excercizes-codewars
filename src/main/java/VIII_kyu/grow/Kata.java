package VIII_kyu.grow;

public class Kata{

    public static int grow(int[] x){
        int result = 1;
        for(int xx : x) {
            result *= xx;
        }

        return result;
    }
}
