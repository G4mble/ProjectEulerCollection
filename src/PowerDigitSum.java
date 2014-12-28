import java.math.BigInteger;

public class PowerDigitSum
{
    public static void main(String[] args)
    {
        long time = System.currentTimeMillis();
        BigInteger tmp = new BigInteger("2");
        BigInteger mult = new BigInteger("2");

        for(int i = 1; i < 1000; i++)
            tmp = tmp.multiply(mult);

        String numberString = tmp.toString();
        long sum = 0;
        for(int i = 0; i < numberString.length(); i++)
            sum += numberString.charAt(i) - 48;

        System.out.println(sum);
        System.out.println(System.currentTimeMillis() - time);
    }
}
