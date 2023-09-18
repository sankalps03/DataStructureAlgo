package Arrays;

public class LeftRotateArrayByOnePlace {

    public static void main(String[] args) {

        int[] array = {2,3,4,5,6,7,8};

        int length = array.length;

        array = LeftRotate(array,length);

        for (int element: array)
        {
            System.out.print(element);
        }
    }

    public static int[] LeftRotate(int[] array , int length)
    {
        int tempVar = array[0];

        for (int iterator = 0 ; iterator < length-1 ; iterator++ )
        {
            array[iterator] = array[iterator+1];
        }

        array[length-1] = tempVar;

        return array;
    }
}
