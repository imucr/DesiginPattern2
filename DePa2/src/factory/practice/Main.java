package factory.practice;


import factory.practice.clothes.ClothesFactory;
import factory.practice.framework.Product;

public class Main {
	public static void main(String[] args){
		ClothesFactory factory=new ClothesFactory(); //QUESTION getCountriesメソッドを使うため、ClothesFactoryタイプを使ったのはいいかな
		Product clothes1=factory.create("イギリス");
		Product clothes2=factory.create("フィリピン");
		
		clothes1.wear();
		clothes2.wear();
		
		System.out.println("衣服の製造国は、"+factory.getCountries()+"です。"); 
		
	}
}
