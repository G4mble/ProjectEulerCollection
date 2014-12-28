public class HighlyDivisibleTriangularNumber
{
    private static long currentTriangularNumber = 1;
    private static long nextAddant = 2;

    public static void main(String[] args)
    {
        long time = System.currentTimeMillis();
        System.out.println("Running!");
        while(true){
            currentTriangularNumber += nextAddant;
            nextAddant++;
            int divisorCount = 2;
            for(int i = 2; i <= currentTriangularNumber/2; i++)
                if((currentTriangularNumber % i) == 0)
                    divisorCount ++;
            if(divisorCount > 500){
                System.out.println("Gefunden: " + currentTriangularNumber);
                System.out.println("Time: " + (System.currentTimeMillis() - time));
                System.exit(0);
            }
        }
    }
}
