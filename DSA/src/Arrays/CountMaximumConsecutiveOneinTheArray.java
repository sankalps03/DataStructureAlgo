package Arrays;


public class CountMaximumConsecutiveOneinTheArray {


    public static void main(String[] args)
    {
        int[] array ={1,2,1,1,1,3,0,4,1,1};

        System.out.println("Max Consecutive One's: "+ maxConsecutiveOnes(array));
    }

    public static int maxConsecutiveOnes(int[] array)
    {
        int maxConsecutivesOne = 0;

        int count = 0;

        for (int element: array)
        {
            if (element == 1)
            {
                count++;
            }
            else
            {
                count = 0;
            }

            maxConsecutivesOne = Math.max(maxConsecutivesOne,count);
        }

        return maxConsecutivesOne;
    }

}
