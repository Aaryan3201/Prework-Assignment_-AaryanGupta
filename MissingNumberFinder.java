package PreWorkPractice;

import java.util.Scanner;
class MissingNumberFinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in .nextInt();
        int[] arr = new int[size-1];
        for(int i=0;i<size-1;i++)
            arr[i] = in.nextInt();
        System.out.println(missingNumberFinder(arr, size));
    }
    static int missingNumberFinder(int array[], int n) {
        int i = 1;
        if (n != array[n - 2]) {
            return n;
        }
        for (i = 1; i < n - 1; i++) {
            if (i != array[i - 1]) {
                return i;
            }
        }
        return 0;
    }
}
