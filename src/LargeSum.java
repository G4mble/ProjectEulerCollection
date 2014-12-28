import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;

public class LargeSum
{
    public static void main(String[] args)
    {
        BufferedReader bufferedReader;
        BigInteger sum = new BigInteger("0");

        try {
            FileReader fileReader = new FileReader("data//numberBlock.txt");
            bufferedReader = new BufferedReader(fileReader);


            for(int i = 0; i < 100; i++) {
                BigInteger current = new BigInteger(bufferedReader.readLine());
                sum = sum.add(current);
            }
            bufferedReader.close();
        }
        catch(Exception e){
            System.out.println("File not found!");
            System.exit(-1);
        }

        String firstTen = sum.toString().substring(0, 10);
        System.out.println(firstTen);
    }
}
