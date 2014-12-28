public class LargestPalindromeProduct
{
    public static void main(String[] args)
    {
        int largestPalindrome = 0;
        int currentI = 0, currentJ = 0;

        outerloop:
        for(int i = 999; i > 99; i--)
            for(int j = 999; j > 99; j--){
                int tmp = i*j;
                if(isPalindrome(tmp)){
                    if(tmp > largestPalindrome){
                        largestPalindrome = tmp;
                        currentI = i;
                        currentJ = j;
                    }
                }
            }
        System.out.println(largestPalindrome + " " + currentI + " " + currentJ);
    }

    public static boolean isPalindrome(int paramNumber)
    {
        String testString = Integer.toString(paramNumber);
        int length = testString.length();
        for(int i = 0; i < length; i++)
        {
            if(!(testString.charAt(i) == testString.charAt((length-(i+1)))))
                return false;
        }
        return true;
    }
}
