package collectionsd.customsort;

public class ProductBean implements Comparable<ProductBean> {

	int productId;
	int price;
	int rating;
	String name;

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

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + ":" + rating + ":" + price;
	}

	// return 0 => both are same , 1 => first object > second , -1 second > first
	@Override
	public int compareTo(ProductBean o) {
		if (this.price > o.price) {
			return 1;
		} else if (this.price < o.price) {
			return -1;
		} else {
			return 0;
		}
	}
	// sort --> p1.compareTo(p2) ==> 0 | 1 | -1
}
