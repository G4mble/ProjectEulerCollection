public class NumberLetterCounts
{
    private final static String one = "one";
    private final static String two = "two";
    private final static String three = "three";
    private final static String four = "four";
    private final static String five = "five";
    private final static String six = "six";
    private final static String seven = "seven";
    private final static String eight = "eight";
    private final static String nine = "nine";
    private final static String ten = "ten";
    private final static String eleven = "eleven";
    private final static String twelve = "twelve";
    private final static String thirteen = "thirteen";
    private final static String fourteen = "fourteen";
    private final static String fifteen = "fifteen";
    private final static String sixteen = "sixteen";
    private final static String seventeen = "seventeen";
    private final static String eighteen = "eighteen";
    private final static String nineteen = "nineteen";
    private final static String twenty = "twenty";
    private final static String thirty = "thirty";
    private final static String forty = "forty";
    private final static String fifty = "fifty";
    private final static String sixty = "sixty";
    private final static String seventy = "seventy";
    private final static String eighty = "eighty";
    private final static String ninety = "ninety";
    private final static String and = "and";
    private final static String hundred = "hundred";
    private final static String thousand = "thousand";

    public static void main(String[] args)
    {
        int total = 0;

        for(int i = 1; i <= 1000; i++)
        {
            String concat = "";

            int current = i;
            int hundredCount = 0;

            if(current >= 1000)
            {
                concat += one;
                concat += thousand;
                current -= 1000;
            }

            while(current >= 100)
            {
                hundredCount++;
                current -= 100;
            }
            if(hundredCount > 0)
            {
                concat += switchHundreds(hundredCount);
                concat += hundred;
                if(current > 0)
                    concat += and;
            }

            if(current >= 90)
            {
                concat += ninety;
                current -= 90;
            }
            else if(current >= 80)
            {
                concat += eighty;
                current -= 80;
            }
            else if(current >= 70)
            {
                concat += seventy;
                current -= 70;
            }
            else if(current >= 60)
            {
                concat += sixty;
                current -= 60;
            }
            else if(current >= 50)
            {
                concat += fifty;
                current -= 50;
            }
            else if(current >= 40)
            {
                concat += forty;
                current -= 40;
            }
            else if(current >= 30)
            {
                concat += thirty;
                current -= 30;
            }
            else if(current >= 20)
            {
                concat += twenty;
                current -= 20;
            }

            if(current >= 19)
            {
                concat += nineteen;
                current -= 19;
            }
            else if(current >= 18)
            {
                concat += eighteen;
                current -= 18;
            }
            else if(current >= 17)
            {
                concat += seventeen;
                current -= 17;
            }
            else if(current >= 16)
            {
                concat += sixteen;
                current -= 16;
            }
            else if(current >= 15)
            {
                concat += fifteen;
                current -= 15;
            }
            else if(current >= 14)
            {
                concat += fourteen;
                current -= 14;
            }
            else if(current >= 13)
            {
                concat += thirteen;
                current -= 13;
            }
            else if(current >= 12)
            {
                concat += twelve;
                current -= 12;
            }
            else if(current >= 11)
            {
                concat += eleven;
                current -= 11;
            }

            if(current >= 10)
            {
                concat += ten;
                current -= 10;
            }
            else if(current >= 9)
            {
                concat += nine;
                current -= 9;
            }
            else if(current >= 8)
            {
                concat += eight;
                current -= 8;
            }
            else if(current >= 7)
            {
                concat += seven;
                current -= 7;
            }
            else if(current >= 6)
            {
                concat += six;
                current -= 6;
            }
            else if(current >= 5)
            {
                concat += five;
                current -= 5;
            }
            else if(current >= 4)
            {
                concat += four;
                current -= 4;
            }
            else if(current >= 3)
            {
                concat += three;
                current -= 3;
            }
            else if(current >= 2)
            {
                concat += two;
                current -= 2;
            }
            else if(current >= 1)
            {
                concat += one;
                current -= 1;
            }

            if(current > 0)
            {
                System.out.println("Fehler");
                System.exit(- 1);
            }

            System.out.println(concat);
            total += concat.length();
        }
        System.out.println(total);
    }

    private static String switchHundreds(int paramCount)
    {
        switch(paramCount)
        {
            case 1:
                return one;
            case 2:
                return two;
            case 3:
                return three;
            case 4:
                return four;
            case 5:
                return five;
            case 6:
                return six;
            case 7:
                return seven;
            case 8:
                return eight;
            case 9:
                return nine;
            default:
                return "";
        }
    }
}
