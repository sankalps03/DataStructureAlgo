package Arrays;

public class FindSecondLargestAndSmallestElemnt {

    public static void main(String[] args) {

        int[] array = {20,54,70,10,4,5,63,93,1,45,22,};

        int length = array.length;

        System.out.println("Second largest element: "+ secondLargest(array,length));

        System.out.println("Second smallest element: "+ secondSmallest(array,length));
    }
    public static int secondSmallest(int[] array , int length)
    {
        if (length < 2)
        {
            return -1;
        }

        int smallest = Integer.MAX_VALUE;

        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0 ; i < length; i++)
        {
            if (array[i] < smallest){

                secondSmallest = smallest;

                smallest = array[i];
            }
            else if (array[i] < secondSmallest & array[i] != smallest)
            {
                secondSmallest = array[i];
            }
        }

        return secondSmallest;
    }

    public static int secondLargest(int[] array , int length)
    {
        if (length < 2)
        {
            return -1;
        }

        int largest = Integer.MIN_VALUE;

        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0 ; i < length; i++)
        {
            if (array[i] > largest){

                secondLargest = largest;

                largest = array[i];
            }
            else if (array[i] > secondLargest & array[i] != largest)
            {
                secondLargest = array[i];
            }
        }

        return secondLargest;
    }
}
