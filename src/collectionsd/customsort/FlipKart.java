package collectionsd.customsort;

import java.util.ArrayList;
import java.util.Collections;

public class FlipKart {

	public static void main(String[] args) {

		// Product
		// collections
		ArrayList<ProductBean> productList = new ArrayList<>();

		ProductBean p1 = new ProductBean();
		p1.setProductId(1);
		p1.setName("toy car");
		p1.setPrice(1200);
		p1.setRating(3);

		ProductBean p2 = new ProductBean();
		p2.setProductId(11);
		p2.setName("zoom car");
		p2.setPrice(1100);
		p2.setRating(5);

		ProductBean p3 = new ProductBean();
		p3.setProductId(10);
		p3.setName("desert car");
		p3.setPrice(1500);
		p3.setRating(4);

		productList.add(p1);
		productList.add(p2);
		productList.add(p3);

		System.out.println(productList);// toString() //hashcode-string

		Collections.sort(productList);
		System.out.println(productList);
		// sort --> price

		// print

		// merge sort
		Collections.sort(productList, new PriceAscSort());// price asc
		System.out.println(productList);// toString() //hashcode-string

		// 1
		Collections.sort(productList, new PriceDescSort());// price desc
		System.out.println(productList);

	}
}
