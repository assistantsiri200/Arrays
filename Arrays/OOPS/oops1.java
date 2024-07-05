public class oops1 {
     public static void main(String[] args) {
        Student s1 = new Student("nitish");
        System.out.println(s1.name);
     }
}
  class Student {
    String name;
    int roll;
    Student (String name){
        //this.name = name;
        System.out.println( " constructor is called...");
    }
  }

