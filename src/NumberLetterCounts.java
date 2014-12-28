public class NumberLetterCounts
{
    private final static int one = 3;
    private final static int two = 3;
    private final static int three = 5;
    private final static int four = 4;
    private final static int five = 4;
    private final static int six = 3;
    private final static int seven = 5;
    private final static int eight = 5;
    private final static int nine = 4;
    private final static int ten = 3;
    private final static int twenty = 6;
    private final static int thirty = 6;
    private final static int fourty = 6;
    private final static int fifty = 5;
    private final static int sixty = 5;
    private final static int seventy = 7;
    private final static int eighty = 6;
    private final static int ninety = 6;
    private final static int and = 3;
    private final static int hundred = 7;
    private final static int thousand = 8;

    public static void main(String[] args)
    {
        long sum = 0;

        for(int i = 1; i <= 1000; i++){
            int a = i;
            while(a > 0){
                if(a > 1000){
                    sum += thousand;
                    a -= 1000;
                    return;
                }

            }

        }
        }
    }
