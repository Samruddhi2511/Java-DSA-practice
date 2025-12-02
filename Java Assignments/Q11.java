import java.util.*;

public class Q11 {

    public static int findMissingSet(int arr[], int size) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);
        for (int i = 1; i <= size + 1; i++)
            if (!set.contains(i)) return i;
        return -1;
    }

    public static int findMissingSum(int arr[], int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) sum += arr[i];
        int n = size + 1;
        int totalSum = n * (n + 1) / 2;
        return totalSum - sum;
    }

    public static void main(String[] args) {
        int arr[] = {8, 2, 4, 5, 3, 7, 1};
        int size = arr.length;

        System.out.println(findMissingSet(arr, size));
        System.out.println(findMissingSum(arr, size));
    }
}
