package singleton.sample;

public class Main {
  public static void main(String[] args) {
    System.out.println("start.");
    Singleton obj1 = Singleton.getInstance();
    Singleton obj2 = Singleton.getInstance();

    if (obj1 == obj2) {
      System.out.println("obj1とobj2は同じインスタンスです。");
    } else {
      System.out.println("obj1とobj2は同じインスタンスではありません。");
    }

    System.out.println("End");

    System.out.println("======================");

    Human human1 = new Human("田中");
    human1.sayHello();

    Human human2 = new Human("大堀");
    human2.sayHello();

    if (human1 != human2) {
      System.out.println("二人は違う人");
    }

    God god = God.getInstance(); //singleton使うとインスタンスはオンリひとつ
    god.sayHello();
  }
}
