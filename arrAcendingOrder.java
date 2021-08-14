import java.util.Arrays;
import java.util.Scanner;

public class arrAcendingOrder {
    public static int[] array;

    public static void acceptValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number Of Element : ");
        int number = scanner.nextInt();
        array = new int[number];
        System.out.println("Enter the number of List To Sort ");
        for(int i=0 ; i<number ; i++){
            System.out.print("Enter "+i+" position :");
            array[i] = scanner.nextInt();
        }
    }
    public static void sort(int[] arr){
        int temp;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        acceptValue();
        System.out.print("You Enter : ");
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.print("Acending Order : ");
        System.out.print(Arrays.toString(array));
    }
}