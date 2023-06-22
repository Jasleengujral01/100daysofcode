import java.util.Scanner;
public class totalsubarrays {
    public static void totalsubarrays(int nums[]){
        int ts=0;
        for(int i=0;i<nums.length;i++){
            int start=0;
            for(int j=i;j<nums.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(nums[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
         }
         System.out.println(" Total subarrays: "+ts);
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
    }
}

