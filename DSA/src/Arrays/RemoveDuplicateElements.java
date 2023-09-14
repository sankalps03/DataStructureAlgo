package Arrays;

import java.util.HashSet;

public class RemoveDuplicateElements {

    public static void main(String[] args)
    {
        int[] array = {1,1,2,2,3,3,1,4,5,5,6,6,};

        int length = array.length;

        System.out.println("no of unique elements: " + removeDuplicateUsingHashset(array,length));

        for (int element:array)
        {
            System.out.println(element);
        }
    }

    public static int removeDuplicateUsingHashset (int[] array , int length)
    {
        HashSet<Integer> uniqueArray = new HashSet<>();

        for (int i =0 ; i < length; i++){

            uniqueArray.add(array[i]);

            int j = 0;

            for (int x: uniqueArray)
            {
                array[j++] = x;
            }
        }

        return uniqueArray.size();
    }

}
