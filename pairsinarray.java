import java.util.Scanner;

public class pairsinarray {
    public static void pairs(int nums[]){
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            for(int j=i+1;j<nums.length;j++){
                System.out.print("("+curr+","+nums[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        pairs(array);
    }
}
