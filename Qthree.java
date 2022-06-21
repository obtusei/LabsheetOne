
// 3.	Illustrate use of classes and objects

public class Qthree {

      public static void main(String[] args) {
            System.out.println("Name: Abhishek Bhatta and CRN:019-312");
            System.out.println("---------------------------------");
            Animal a1 = new Animal(); // creating an object of Animal class
            a1.eat();

      }
}

// Animal class
class Animal {

      public void eat() {
            System.out.println("Animal is eating");
      }

}
