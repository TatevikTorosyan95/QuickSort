public class QuickSort {
    public static void main(String[] args) {

        int[] arr = {5, 8, -5, -9, -54, 56, 1, 258, 3};

        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: ");
        print(arr);
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {

            int index = partition(arr, start, end);

            quickSort(arr, start, index - 1);
            quickSort(arr, index + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];

        int i = (start - 1);

        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, end);
        return (i + 1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        print(arr);
    }


    private static void print(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");

        System.out.println();
    }
}

