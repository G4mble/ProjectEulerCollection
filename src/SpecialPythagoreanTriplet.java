public class SpecialPythagoreanTriplet
{
    public static void main(String[] args)
    {
        for(int v = 1; v < 250; v++){
            for(int u = 2; u < 500; u++)
            {
                if((u > v))
                    if(((Math.pow(u, 2)) + (v * u)) == 500){
                        long a = (long)((Math.pow(u, 2)) - (Math.pow(v, 2)));
                        long b = (2 * v * u);
                        long c = (long) ((Math.pow(v, 2)) + (Math.pow(u, 2)));
                        System.out.println((a * b * c));
                        System.exit(0);
                    }
            }
        }
    }
}
