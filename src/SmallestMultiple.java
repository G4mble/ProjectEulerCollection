public class SmallestMultiple
{
    public static void main(String[] args)
    {
        System.out.println("Processing...");
        int max = Integer.MAX_VALUE;
        for(int i = 20; i < max; i += 2){
            int count = 0;
            for(int j = 2; j <= 20; j++){
                if(!((i % j) == 0))
                    break;
                else
                    count++;
            }
            if(count == 19){
                System.out.println("Gefunden: " + i);
                System.exit(0);
            }
        }
        System.out.println("Nichts gefunden!");
    }
}
