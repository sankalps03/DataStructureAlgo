package Arrays;

//Problem Statement: Given an array, we have to find the largest element in the array.

import java.util.Arrays;

public class FindLargestElementInArray {

    public static void main(String[] args)
    {
        int[] inputArray = {10,20,4, 34, 43, 7, 37, 65, 87, 36,54, 12 , 43 ,45 ,67, 86, 86 , 95 ,59 , 68 ,69 ,98};

        System.out.println(System.currentTimeMillis() + ": " +usingSorting(inputArray));

        System.out.println(System.currentTimeMillis());

        System.out.println(System.currentTimeMillis() + " : " +usingMaxVariable(inputArray));

        System.out.println(System.currentTimeMillis());

    }

    public static int usingSorting(int[] inputArray) // Time complexity O(n*log(n))
    {
        Arrays.sort(inputArray);

        return inputArray[inputArray.length -1];
    }

    public static int usingMaxVariable(int[] inputArray) // Time complexity O(n)
    {

        int maxElement = inputArray[0];

        for (int element : inputArray)
        {
            if (element > maxElement)
            {
                maxElement = element;
            }
        }
        return maxElement;
    }


}
