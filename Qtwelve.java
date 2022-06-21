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
            Qtwelve v = new Qtwelve();
            v.run();
      }

}
