public class InsertionSortUsingForASC {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 8, 8, 9, 9, 5, 1};

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i], rightPos = i;
            for (int j = i - 1; j >= 0; j--) {
                if (curr < arr[j]) {
                    arr[j + 1] = arr[j];
                    rightPos = j;
                } else {
                    break;
                }
            }
            if (rightPos != i)
                arr[rightPos] = curr;
        }

        for (int i : arr)
            System.out.print(i + "\t");
    }
}
