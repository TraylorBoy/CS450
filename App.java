public class App {
  public static void main(String[] args) {
    Thread t1 = new Thread(new Runner("up"));
    Thread t2 = new Thread(new Runner("down"));

    try {
      t1.start();
      t1.join();

      t2.start();
      t2.join();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}
