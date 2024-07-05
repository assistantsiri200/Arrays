
public class OOPS {
    public static void main(String[] args) {
    //     Pen p1 = new Pen();
    //     p1.setcolor("Blue");
    //     System.out.println(p1.color);

    //     BankAccount myAcc = new BankAccount();
    //     myAcc.username = " nitish kumar";
    //     myAcc.password = " abcdefghi";

    
    // }
    
// }
//   class Pen {
//     String color;
//     int tip;
  
//     void setcolor(String newColor) {
//         color = newColor;
//     }
 
//      void setTip( int newTip){
//         tip = newTip;
//      }
    
//     }
    // class BankAccount {
    //     public String username;
    //     private String password;
    //  public void setpassword(String pwd){
    //     password = pwd;
    //  }
    // }
     

      Student s1 = new  Student("nitish");
      System.out.println(s1.name);
    }
}
class Student {  

    String name;
    int roll;

    Student(String name) {
        this.name = name;
    }
     
}
