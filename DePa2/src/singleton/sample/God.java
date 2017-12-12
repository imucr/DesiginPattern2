package singleton.sample;

public class God implements Being {

  private static final God instance = new God();

  private God() {}

  public static God getInstance() {
    return instance;
  }

  @Override
  public void sayHello() {

    System.out.println("I am the God");
  }
}
