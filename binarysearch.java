import java.util.Scanner;

public class binarysearch {
    public static int binarySearch(int[] nums, int key) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] == key) {
                return mid;
            }
            
            if (nums[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return -1; // Key not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        
        System.out.println("Enter the key you want to search:");
        int key = sc.nextInt();
        
        int searchedIndex = binarySearch(array, key);
        
        if (searchedIndex != -1) {
            System.out.println("Key found at index: " + searchedIndex);
        } else {
            System.out.println("Key not found in the array.");
        }
        
        sc.close();
    }
}
