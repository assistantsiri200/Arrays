 public class string {
    //public static void main(String[] args) {
//         String fruits[]  = { "apple", "mango", "banana"};

//         String largest = fruits[0];
//         for(int i=1; i<fruits.length;i++){
//             if(largest.compareTo(fruits[i]) < 0){
//                 largest = fruits[i];
//             }


            
//         }
//         System.out.println(largest);

//     }

    //  StringBuilder sb = new StringBuilder("");
    //     for(char ch='a'; ch<='z'; ch++){
    //         sb.append(ch);

    //     }
    //     System.out.println(sb);


   // }
// } 

public static String toUppercase(String str){
  StringBuilder sb = new StringBuilder("");
  char ch = Character.toUpperCase(str.charAt(0));
  sb.append(ch);
  for(int i=1; i<str.length(); i++){

    if(str.charAt(i) == ' ' && i<str.length()-1){
        sb.append(str.charAt((i)));
        i++;
        sb.append(Character.toUpperCase(str.charAt(i)));
    }else{
        sb.append(str.charAt(i));
    }

    }
    return sb.toString();

  }
  public static void main(String[] args) {
     String str = "hi, i am nitish";
     System.out.println(toUppercase(str));
  }
}