 import java.util.*;

    public class ArraysCC {
// //    // public static void update(int marks[]){
// //         //for(int i=0; i<marks.length; i++){
// //             //marks[i] = marks[i] + 1;

// //         //}
// //    // }
// //     //public static void main(String[] args) {
// //        // int marks[] = {97, 98, 99};
// //          //update(marks);
// //          //for(int i=0; i<marks.length; i++){

// //            // System.out.print(marks[i]+" ");
// //          //}
   
// //            // System.out.println();


// //     //}

// //            // Q 2 linear search
// //            public static int linearSearch(int numbers[], int key){
// //             for(int i=0; i<numbers.length; i++){
// //                 if(numbers[i] == key){
// //                     return i;

// //                 }
// //             }
// //             return-1;

// //            }
// //            public static void main(String[]args){
// //             int numbers[] = {2,4,6,8,10,12,14,16};
// //             int key = 10;
// //             int index = linearSearch(numbers, key);
// //            if(index == -1){
// //             System.out.println("NOT found");
// //            }else{
// //             System.out.println("key is at index : "+ index);
// //            }

           
 
// //         }          
// // }
//             // Q3 Largest Number in array
//             public static int getLargest(int numbers[]){
//                 int largest  = Integer.MIN_VALUE;
                
//                 for(int i=0; i<numbers.length; i++){
//                     if(largest < numbers[i]){
                    
//                         largest = numbers[i];

//                     }

//                 }
//                 return  largest;

//             }
        
//             public static void main(String[] args) {
//                 int number[] = {1,2,6,3,5};
//                 System.out.println("largest value is : " + getLargest(number));
//             }
//         }  
             // Q4     BINARY SEARCH
             public static int binarySearch(int numbers[],int key){
                int start = 0, end = numbers.length-1;
                while(start <= end){
                    int mid = (start + end) / 2;
                    if(numbers[mid] == key){
                        return mid;
                    }
                    if(numbers[mid]< key){
                        start = mid+1;
                    }else{
                        end = mid-1;

                    }
                    
                    }
                    return -1;

                }
                public static void main(String[] args) {
                    int number[] = {2,4,6,8,10,12,14,16};
                    int key = 4;
                    System.out.println(" index for key is :"+ binarySearch(number, key));
                }
             }

         
           
           
