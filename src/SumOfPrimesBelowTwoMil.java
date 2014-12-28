public class SumOfPrimesBelowTwoMil
{
    public static void main(String[] args)
    {
        long erg = 2;
        long addant = 3;

        while(addant < 2000000)
        {
            if(isPrime(addant))
                erg += addant;
            addant++;
        }
        System.out.println(erg);
    }

    public static boolean isPrime(long paramAddant)
    {
        for(int i = 2; i < Math.sqrt(paramAddant) + 1; i++)
            if((paramAddant % i) == 0)
                return false;
        return true;
    }
}
