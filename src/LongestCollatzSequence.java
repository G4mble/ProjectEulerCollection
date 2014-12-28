public class LongestCollatzSequence
{
    public static void main(String[] args)
    {
        long time = System.currentTimeMillis();
        int current = 0;
        int count;
        long a;
        int currentLength = 0;
        for(int i = 1; i < 1000000; i++){
            a = i;
            count = 1;
            while(a != 1){
                a = ((a & 1) == 1) ? (3 * a + 1) : (a >> 1);
                count++;
            }
            if(count> currentLength){
                current = i;
                currentLength = count;
            }
        }
        System.out.println(current);
        System.out.println("Time: " + (System.currentTimeMillis() - time));
    }
}
