
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
            System.out.println("Name: Abhishek Bhatta and CRN:019-312");
            System.out.println("---------------------------------");
            Qeleven v = new Qeleven();
            v.run();
      }
}
