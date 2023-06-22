import java.util.Scanner;

public class sumofsubarrays {
    public static void sumofsubarrays(int arrays[]){
         for(int i=0;i<arrays.length;i++){
            int start=0;
            for(int j=i;j<arrays.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arrays[k]+" ");
                }
               
                System.out.println();
            }
            System.out.println();
         }
         System.out.println("Subarray sums:");
        for (int i = 0; i < arrays.length; i++) {
            int sum = 0;
            for (int j = i; j <arrays.length; j++) {
                sum += arrays[j];
                System.out.println("Sum of subarray [" + i + ".." + j + "]: " + sum);
            }
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
        sumofsubarrays(array);
    }
}
