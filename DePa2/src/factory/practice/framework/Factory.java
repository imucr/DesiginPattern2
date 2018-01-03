package factory.practice.framework;

public abstract class Factory {
	
	public final Product create(String country){
		Product p = createProduct(country);
		registerProduct(p);
		return p;
	}
	
	protected abstract Product createProduct(String country);
	
	protected abstract void registerProduct(Product product);
    
}
