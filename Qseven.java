// 7.	Illustrate use of Overriding

class Vehicle {
      void run() {
            System.out.println("Vehicle is running");
      }
}

public class Qseven extends Vehicle {

      @Override
      void run() {
            super.run();
            System.out.println("Vehicle is running slowly");
      }

      public static void main(String[] args) {
            Qseven v = new Qseven();
            v.run();
      }
}
