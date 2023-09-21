package Arrays;

import java.util.ArrayList;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        union(arr1, arr2);
    }

    public static void union(int[] array1, int[] array2) {
        ArrayList<Integer> union = new ArrayList<>();

        int n = array1.length;

        int m = array2.length;

        int i = 0, j = 0;

        while (i < n && j < m) {
            if (array1[i] <= array2[j]) {
                if (union.isEmpty() || union.get(union.size() - 1) != array1[i]) {
                    union.add(array1[i]);

                } i++;
            } else {
                if (union.isEmpty() || union.get(union.size() - 1) != array2[j]) {
                    union.add(array2[j]);

                } j++;

            }
        }

        while (i < n) {
            if (union.get(union.size() - 1) != array1[i]) {

                union.add(array1[i]);

            } i++;
        }
        while (j < m) {
            if (union.get(union.size() - 1) != array2[j]) {

                union.add(array2[j]);

            } j++;
        }
        for (int element : union
        ) {
            System.out.println(element);
        }
    }
}
