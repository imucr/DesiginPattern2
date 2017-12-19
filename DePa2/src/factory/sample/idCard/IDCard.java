package factory.sample.idCard;

import factory.sample.framework.Product;

public class IDCard extends Product {

  private String owner;

  public IDCard(String owner) {
    System.out.println(owner + "のカードを作ります。");
    this.owner = owner;
  }

  @Override
  public void use() {
    System.out.println(owner + "のカードを使います。");
  }

  public String getOwner() {
    return owner;
  }
}
