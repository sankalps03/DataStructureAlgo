package Arrays;

public class FindTheMissingNumberInArray {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,7,8,9,10,11};

        int maxNumber = 11;

        System.out.println("Missing Number: "+findMissingNumber(array,maxNumber));
    }

    public static int findMissingNumber(int[] array , int n )
    {
        int sumOfNnumbers = (n*(n+1))/2;

        int sumArray = 0;

        for (int element: array)
        {
            sumArray = sumArray + element;
        }

        return sumOfNnumbers - sumArray;
    }
}
