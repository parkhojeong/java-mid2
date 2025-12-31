package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> productMap = new HashMap<>();

    public void add(Product product, int count) {
        productMap.put(product, productMap.getOrDefault(product, 0) + count);

    }

    public void minus(Product product, int count) {
        int updateCount = productMap.getOrDefault(product, 0) - count;
        if(updateCount <= 0){
            productMap.remove(product);
            return;
        }

        productMap.put(product, updateCount);
    }

    public void printAll() {
        System.out.println("==all products print==");
        for (Map.Entry<Product, Integer> entry : productMap.entrySet()) {
            System.out.println("product: " + entry.getKey() + ", count: " + entry.getValue());
        }
    }
}
