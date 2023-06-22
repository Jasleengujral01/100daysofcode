import java.util.Scanner;

public class linearsearch {
    public static int linearsearch(int[] number, int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            
            array[i] = s.nextInt();
        }

        System.out.print("Enter the key to search: ");
        int key = s.nextInt();

        int result = linearsearch(array, key);

        if (result == -1) {
            System.out.println("Key not found in the array.");
        } else {
            System.out.println("Key found at index: " + result);
        }

        s.close();
    }
}
