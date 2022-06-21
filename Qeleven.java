
class TukTuk {
      void run() {
            System.out.println("Vehicle is running");
      }
}

public class Qeleven extends TukTuk {

      @Override
      void run() {
            super.run();
            System.out.println("Vehicle is running slowly");
      }

      public static void main(String[] args) {
            Qeleven v = new Qeleven();
            v.run();
      }
}
