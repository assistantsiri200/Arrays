import java.util.*;
public class sortArray {
    //public class sortArray {
        static void printArray(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n; i++) ;
            System.out.print(arr[n] + " ");

            
        

            System.out.println();
            
        }
    

        static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
            static void sortzeroesAndOnes ( int[] arr){

            
            int n = arr.length;
            int zeroes = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    zeroes++;
                }
            }

            for (int i = 0; i < n; i++) {
                if (i < zeroes) {
                    arr[i] = 0;
                }else {
                    arr[i] = 1;
                 }
                }
            }
        

             public static void main (String[]args){
                Scanner sc = new Scanner(System.in);
                System.out.print("enter array size");
                {
                int n = sc.nextInt();
                int[] arr = new int[n];
                System.out.println("enter" + n + "element");
                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }
                System.out.println("original array:");
                printArray(arr);
                sortzeroesAndOnes(arr);
                System.out.println("sorted array:");
                printArray(arr);

            }
        }
    }
       





    

