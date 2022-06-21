interface ISomething {
      public void doSomething();
}

public class Qthirteen implements ISomething {

      public void doSomething() {
            System.out.println("Something is happening");
      }

      public static void main(String[] args) {
            Qthirteen s = new Qthirteen();
            s.doSomething();
      }

}
