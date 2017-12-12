package singleton.sample;

public class Human implements Being {

  private String name;

  public Human(String name) {
    this.name = name;
  }

  @Override
  public void sayHello() {
    System.out.println("Hello, my name is " + this.name);
  }
}
