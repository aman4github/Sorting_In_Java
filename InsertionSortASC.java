public class InsertionSortUsingWhileASC {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 8, 8, 9, 9, 5, 1};

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > curr) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = curr;
        }

        for (int i : arr)
            System.out.print(i + "\t");
    }
}
