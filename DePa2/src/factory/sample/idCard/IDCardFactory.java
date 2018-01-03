package factory.sample.idCard;

import java.util.ArrayList;
import java.util.List;

import factory.sample.framework.Factory;
import factory.sample.framework.Product;

public class IDCardFactory extends Factory {

  private List owners = new ArrayList<>();

  @Override
  protected Product createProduct(String owner) {
    return new IDCard(owner);
  }

  @Override
  protected void registerProduct(Product product) {
    owners.add(((IDCard) product).getOwner()); //MEMO productオブジェクトのタイプをProductからIDCardにキャストして、owner名をゲットして、ownersリスト追加
  }

  public List getOwners() {
    return owners;
  }
}
