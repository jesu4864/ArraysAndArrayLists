public class ArrayExample {
    public static void main(String[] args) {
        // Array
        //Notice when declaring an array, size is a requirement
        int[] array = new int[5]; // Declare an array of size 5
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;

        //Since the array's size is 5, if we try to add another element at array[5] (really position 6), it would cause an error.

        // Print elements and size
        System.out.println("Array Elements:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("\nArray Size: " + array.length);
    }
}
