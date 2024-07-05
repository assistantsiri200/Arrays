public class oops4 {

    //ABSTRACT CLASS
    //public static void main(String[] args) {
        // Horse h = new Horse();
        // h.eat();
        // h.walk();
        // chicken c = new chicken();
        // c.eat();
        // c.walk();


    //}
    

//  abstract class Animal{ 
//     void eat(){
//         System.out.println("animal eats");

//     }
//     abstract void walk();
// }
//      class Horse extends Animal {
//         void walk(){
//             System.out.println("walks on 4 legs");

//         }

//      }  
//      class chicken extends Animal{
//         void walk(){
//             System.out.println("walks on 2 legs");

//         }
//      }  
             public static void main(String[] args) {
             Queen q = new Queen();
               q.moves();
             }
        }
    


   interface chessplayer{ 
    void moves();
   }

    class Queen implements chessplayer {
        public void moves(){
            System.out.println("up ,down , left, right, diagonal (in all 4 dirns)");

        }
    }
    class Rook  implements chessplayer {
        public void moves(){

        
        System.out.println("up ,down , left, right");
    }


    }
    
    class king  implements chessplayer {
        public void moves(){
        
        
        System.out.println("up ,down , left, right , diagonal( in all 2 dirns)");
    }

}
   

