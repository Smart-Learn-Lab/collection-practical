package collection;

import java.util.Comparator;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Store store = new Store();
        store.addProduct(new Product(1, "product 1", 2.5));
        store.addProduct(new Product(2, "product 2", 1.0));
        store.addProduct(new Product(3, "product 3", 3.0));
        store.addProduct(new Product(13, "product 4", 3.0));
        List<Product> products = store.getProducts();
        products.sort(Comparator.comparingDouble(Product::getPrice));
        for (Product product : products) {
            System.out.println("ID: " + product.getId() + ", name: " + product.getName() + ", price: " + product.getPrice());
        }
        store.removeProduct(13);
        store.editProduct(3, new Product(3, "Product 15", 3.5));
        for (Product product : store.getProducts()) {
            System.out.println("ID: " + product.getId() + ", name: " + product.getName() + ", price: " + product.getPrice());
        }
    }
}
