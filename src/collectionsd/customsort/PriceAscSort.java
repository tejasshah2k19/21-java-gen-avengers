package collectionsd.customsort;

import java.util.Comparator;

public class PriceAscSort implements Comparator<ProductBean> {

	public int compare(ProductBean o1, ProductBean o2) {
		if (o1.price > o2.price) {
			return 1;
		} else if (o1.price < o2.price) {
			return -1;
		} else {
			return 0;
		}
	}

}
