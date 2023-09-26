package Arrays;

public class FindNumberThatAppearsOnce {

    public static void main(String[] args)
    {
        int[] array = {1,1,2,2,3,4,5,5,4,6,6};

        System.out.println("Number with only one occurrence: "+ appearedOnlyOne(array));

    }

    private static int appearedOnlyOne (int[] array)
    {
        int xORResult = 0;

        for (int element :array)
        {
            xORResult = xORResult ^ element;
        }

        return xORResult;
    }
}
