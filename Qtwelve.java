// Illustrate a Simple inheritance Using super to Call Super class Constructors

class Vehicle {

      Vehicle() {
            System.out.println("Vehicle is created");
      }

      void run() {
            System.out.println("Vehicle is running");
      }

}

public class Qtwelve extends Vehicle {

      public Qtwelve() {
            super();
            System.out.println("Vehicle is starting");
      }

      public static void main(String[] args) {
            System.out.println("Name: Abhishek Bhatta and CRN:019-312");
            System.out.println("---------------------------------");
            Qtwelve v = new Qtwelve();
            v.run();
      }

}
