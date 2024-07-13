import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter array length: ");

        int size = input.nextInt();
        int[] array = new int[size];

        System.out.println("\nInsert array element");

            for (int i = 0; i < size; i++) {
                System.out.printf("WWrite the value of the %s element: ", i + 1);
                array[i] = input.nextInt();
            }


        BubbleSort bubbleClass = new BubbleSort(array);

        System.out.println("\nArray before sort:");

        bubbleClass.printArray();
        bubbleClass.bubbleSort();

        System.out.println("\n\nArray after sort:");

        bubbleClass.printArray();
    }
}