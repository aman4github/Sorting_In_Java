public class SelectionSortDSC {
    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 8, 8, 9, 9, 5, 1};
        
        for (int i = 0; i < arr.length - 1; i++) {
            int largestIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[largestIndex] < arr[j]) {
                    largestIndex = j;
                }
            }

            if (largestIndex != i) {
                int temp = arr[i];
                arr[i] = arr[largestIndex];
                arr[largestIndex] = temp;
            }

        }

        for (int i : arr)
            System.out.print(i + "\t");
    }
}
