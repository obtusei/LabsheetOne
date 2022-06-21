// 4.	Illustrate use of constructors
public class Qfour {

      public static void main(String[] args) {
            System.out.println("Name: Abhishek Bhatta and CRN:019-312");
            System.out.println("---------------------------------");
            Animal a1 = new Animal(); // creating an object of Animal class
            Animal a2 = new Animal("Lion", "Golden");
            a1.eat();
            a2.info();
      }
}

class Animal {

      private String name;
      private String color;

      Animal() {
            System.out.println("Animal is created");
      }

      Animal(String name, String color) {
            this.name = name;
            this.color = color;
      }

      public void info() {
            System.out.println("Animal's name is " + name + " and color is " + color);
      }

      public void eat() {
            System.out.println("Animal is eating");
      }
}
