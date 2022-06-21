interface ISomething {
      public void doSomething();
}

public class Qthirteen implements ISomething {

      public void doSomething() {
            System.out.println("Something is happening");
      }

      public static void main(String[] args) {
            System.out.println("Name: Abhishek Bhatta and CRN:019-312");
            System.out.println("---------------------------------");
            Qthirteen s = new Qthirteen();
            s.doSomething();
      }

}
