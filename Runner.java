// Thread class
public class Runner implements Runnable {
  final private String direction;

  public Runner(String direction) {
    this.direction = direction;
  }

  @Override
  public void run() {
    if (this.direction.equals("up")) {
      System.out.println("Counting up\n");
      for (int i = 1; i < 21; i++) {
        System.out.println(i);
      }
    }
    else if (this.direction.equals("down")) {
      System.out.println("\nCounting down\n");
      for (int i = 20; i > 0; i--) {
        System.out.println(i);
      }
    }
    else {
       System.out.println("Direction must be either 'up' or 'down'");
    }
  }
}
