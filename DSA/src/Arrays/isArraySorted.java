package Arrays;

public class isArraySorted {

    public static void main(String[] args)
    {
        int[] array = {1,2,3,5,5};

        int length = array.length;

        System.out.println("is array sorted: " + checkIsArraySorted(array,length));
    }

    public static boolean checkIsArraySorted(int[] array , int length)
    {
        for (int i = 1 ; i < length; i ++)
        {
            if(array[i] < array[i-1]){

                return false;
            }
        }

        return true;
    }
}
