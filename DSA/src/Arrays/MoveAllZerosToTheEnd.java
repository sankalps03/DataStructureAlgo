package Arrays;

public class MoveAllZerosToTheEnd {

    public static void main(String[] args)
    {
        int[] array = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};

        int length = array.length;

        moveAllZerosTotheEnd(array,length);

        for (int element : array)
        {
            System.out.print(element+" ");
        }



    }

    public static int[] moveAllZerosTotheEnd(int[] array, int length)
    {
        int j = -1;
        for (int iterator =0; iterator < length; iterator ++ )
        {
            if (array[iterator] == 0)
            {
                 j = iterator;

                 break;
            }
        }

        if (j == -1)
        {
            return array;
        }

        for(int iterator = j+1; iterator < length; iterator++)
        {
            if (array[iterator] != 0 )
            {
                int temp = array[iterator];

                array[iterator] = array[j];

                array[j] = temp;

                j++;
            }
        }

        return array;
    }
}
