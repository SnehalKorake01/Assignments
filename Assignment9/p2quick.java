import java.util.*;

class Demo {
    public static void main(String[] args) {
        int[] arr = {42,56,12,67,34};

        f(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void f(int[] arr, int low, int high) {
        if (low >= high) return;

        int pivotIndex = pivotfinder(arr, low, high);

        f(arr, low, pivotIndex - 1);
        f(arr, pivotIndex + 1, high);
    }

    static int pivotfinder(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {

            while (i <= high - 1 && arr[i] <= pivot) {
                i++;
            }

            while (j >= low + 1 && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}