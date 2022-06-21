// 9. Create the Abstract class and implements the method
abstract class Animal {
      abstract void run();

      void eat() {
            System.out.println("Animal is eating");
      }
}

class Mammal extends Animal {
      void run() {
            System.out.println("running safely..");
      }
}

public class Qnine {
      public static void main(String[] args) {
            System.out.println("Name: Abhishek Bhatta and CRN:019-312");
            System.out.println("---------------------------------");
            Mammal m = new Mammal(); // abstract class can be instantiated but can be inherited by concrete class
            m.run();
            m.eat();
      }
}
