public class PrimeNumber10001
{
    public static void main(String[] args)
    {
        System.out.println("Processing...");
        boolean isPrime;
        long max = Long.MAX_VALUE;
        int count = 0;
        long current = 0;

        for(long i = 2; i <= max; i++){
            isPrime = true;
            for(int j = 2; j <= i/2; j++){
                if((i % j) == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                current = i;
                count++;
            }
            if(count == 100000){
                System.out.println("Gefunden: " + current);
                System.exit(0);
            }
        }
        System.out.println("Nichts gefunden!");
    }
}
