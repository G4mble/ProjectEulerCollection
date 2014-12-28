public class EvenFibSum
{
    public static void main(String[] args)
    {
        int sum = 0;
        int fib1 = 0;
        int fib2 = 1;
        while(true){
            int tmp = fib1;
            fib1 += fib2;
            fib2 = tmp;
            if(fib1 <= 4000000){
                if((fib1 % 2) == 0)
                    sum += fib1;
            }
            else
                break;
        }
        System.out.println(sum);
    }
}
