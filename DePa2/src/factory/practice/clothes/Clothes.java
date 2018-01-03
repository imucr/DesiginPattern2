package factory.practice.clothes;

import factory.practice.framework.Product;

public class Clothes extends Product {

	private String country;
	
  public Clothes(String country) {
	  System.out.println(country +"で衣服を作ります。");
	  this.country=country;
  }

@Override
  public void wear() {
	System.out.println(country+"製の衣服を着ます。");
  }

	public Object getCountry(){
		return country;
	}
}
