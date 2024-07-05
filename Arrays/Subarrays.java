 public class Subarrays {
//     public static void  printSubarrays(int numbers[]){
//         int  ts = 0;
//         for(int i=0; i<numbers.length; i++){
//             int start = numbers[i];
//             for(int j=0; j<numbers.length; j++){
//                 int end = numbers[j];
//                 for(int k= start; k<=end; k++){//print
//                     System.out.print(numbers[k]+" ");//subarray

//                 }
//                 ts++;
//                 System.out.println();

//             }
//             System.out.println();
//         }
//         }
//          public static void main(String[]args){
//              int numbers[] = {2, 4, 6, 8, 10};
//              printSubarrays(numbers);

//          }
//     }

      //Q2    MAX SUBARRAY SUM 
    //  public static void maxSubarraySum(int numbers[]){
    //     int currSum = 0;         
    //     int maxSum = Integer.MIN_VALUE;
    //    for(int i=0; i<numbers.length; i++){
    //         int start = i;           
            
    //         for( int j=i; j<numbers.length; j++){                
    //             int end = j;
    //             currSum = 0;
            
    //              for(int k=start; k<=end; k++){
    //                  //subarray sum
    //                 currSum += numbers[k];
        //          }
        //          System.out.println(currSum);
        //        if(maxSum < currSum){
        //             maxSum = currSum;

        //        }
        //         }
        //      }
        
        //        System.out.println("max sum = "+ maxSum);

        // }
         
    
        public static void maxSubarraySum(int numbers[]){
            int currSum = 0;         
            int maxSum = Integer.MIN_VALUE;
            int prefix[] = new int [numbers.length];

            prefix[0] = numbers[0];
            //calculate prefix array
            for(int i=1; i<prefix.length; i++)
            prefix[i] = prefix[i-1] + numbers[i];
        
           for(int i=0; i<numbers.length; i++){
                int start = i;           
                
                for( int j=i; j<numbers.length; j++){                
                    int end = j;
                    currSum = start == 0  ? prefix[end]  :  prefix[end] - prefix[start-1];

                
                    // for(int k=start; k<=end; k++){
                         //subarray sum
            
                     }
                     //System.out.println(currSum);
                      if(maxSum < currSum){
                       maxSum = currSum;
                   }
                }
    
                   
                    
                 
            
                   System.out.println("max sum = "+ maxSum);
    
            }
             public static void main(String[] args){
        
        
             int numbers[] = {2, 4, 6, 8, 10};
              maxSubarraySum(numbers);
             }
            }  

                    