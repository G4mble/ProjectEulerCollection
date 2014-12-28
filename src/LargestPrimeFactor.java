import java.math.BigInteger;
import java.util.LinkedList;

public class LargestPrimeFactor
{
    public static void main(String[] args)
    {
        System.out.println("Processing...");
        long startTimer = System.currentTimeMillis();
        BigInteger value = new BigInteger("1234567890123456789012345678901234567890");
        int digits = value.toString().length();
        BigInteger zero = new BigInteger("0");
        BigInteger one = new BigInteger("1");
        LinkedList<BigInteger> factors = new LinkedList<BigInteger>();

        for(BigInteger count = new BigInteger("2"); !(count.equals(value)); count = count.add(one)){
            if(value.mod(count).equals(zero)){
                factors.add(count);
                value = value.divide(count);
                count = new BigInteger("1");
            }
        }
        factors.add(value);

        for(BigInteger x : factors)
            System.out.println(x);


        System.out.println("\nDigits: " + digits + "\nDuration: " + (System.currentTimeMillis() - startTimer) + "ms");
    }
}
