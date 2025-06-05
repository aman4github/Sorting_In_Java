public class SelectionSortASC {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 8, 8, 9, 9, 5, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            int smallestValueIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallestValueIndex] > arr[j]) {
                    smallestValueIndex = j;
                }
            }
            if (smallestValueIndex != i) {
                arr[i] += arr[smallestValueIndex];
                arr[smallestValueIndex] = arr[i] - arr[smallestValueIndex];
                arr[i] -= arr[smallestValueIndex];
            }
        }

        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}
