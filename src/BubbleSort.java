public class BubbleSort {

    int[] arr;

    public BubbleSort(int[] arr) {
        this.arr = arr;
    }

    public void printArray () {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public void bubbleSort() {
        int var = arr.length;
        for (int i = 0; i < var - 1; i++) {
            for (int j = 0; j < var - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
}
