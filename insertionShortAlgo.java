public class insertionShortAlgo {
    
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example 1
        int[] arr1 = {1,4,6,8,12,13,14};
        System.out.println("Before sorting: ");
        printArray(arr1);
        insertionSort(arr1);
        System.out.println("After sorting: ");
        printArray(arr1);

        // // Example 2
        // int[] arr2 = {64, 34, 25, 12, 22, 11, 90};
        // System.out.println("\nBefore sorting: ");
        // printArray(arr2);
        // insertionSort(arr2);
        // System.out.println("After sorting: ");
        // printArray(arr2);

        // // Example 3
        // int[] arr3 = {1, 2, 3, 4, 5};
        // System.out.println("\nBefore sorting: ");
        // printArray(arr3);
        // insertionSort(arr3);
        // System.out.println("After sorting: ");
        // printArray(arr3);
    }
}