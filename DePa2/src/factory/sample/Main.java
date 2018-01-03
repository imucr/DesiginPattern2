package factory.sample;

import factory.sample.framework.Factory;
import factory.sample.framework.Product;
import factory.sample.idCard.IDCardFactory;

public class Main {
  public static void main(String[] args) {
    Factory factory = new IDCardFactory(); //MEMO IDCardFactoryを使うと最初に決めたのに注目
    Product card1 = factory.create("花子");
    Product card2 = factory.create("夢子");
    Product card3 = factory.create("緑子");

    card1.use();
    card2.use();
    card3.use();
  }
}
