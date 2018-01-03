package factory.practice.clothes;

import java.util.ArrayList;
import java.util.List;

import factory.practice.framework.Factory;
import factory.practice.framework.Product;

public class ClothesFactory extends Factory {

	private List countries=new ArrayList<>();
	
  @Override
  protected Product createProduct(String country) {
    return new Clothes(country);
  }

  @Override
  protected void registerProduct(Product product) {
	  countries.add(((Clothes) product).getCountry());
  }
  
  public List getCountries(){
	  return countries;
  }
}
