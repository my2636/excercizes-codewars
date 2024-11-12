package first_exs.SquareAndSum;

public class Kata
{
    public static int squareSum(int[] n)
    {
        int sum = 0;
        for(int numbers : n) {
            sum += numbers * numbers;
        }
        return sum;
    }
}
