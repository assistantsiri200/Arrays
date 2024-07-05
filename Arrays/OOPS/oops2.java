public class oops2 {
    public static void main(String[] args) {
         fish shark = new fish();
         shark.eat();
    }
}
     //INHERITANCE
  //bass class
     class Animals {
    String color; 
     void eat() {
        System.out.println("eats");

    }
    void breathe(){
        System.out.println("breathes");



    }
  }
    //derived class
    class fish extends Animals {
        int Fins;
        void swim(){
            System.out.println("swim in water");
        }
    }

