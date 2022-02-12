package amazon;

public class ProductBean {

	private int productId;
	private int price;
	private String productName;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public ProductBean(int price,String productName) {
		this.price = price;
		this.productName = productName;
		this.productId = (int)(Math.random()*10000);
	}
	
}
