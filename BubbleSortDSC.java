public class BubbleSortDSC {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 8, 8, 9, 9, 5, 1};

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }

        for (int i : arr)
            System.out.print(i + "\t");
    }
}
