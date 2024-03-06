package collection;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private final List<Product> products;

    public Store() {
        this.products = new ArrayList<>();
    }

    /* Version 1
       public void addProduct(Product product) {
        for (Product productObject : products) {
            if (productObject.getId() == product.getId()) {
                break;
            }
        }
        products.add(product);
    }
     */

    /*
    Version 2

    public void addProduct(Product product) {
        boolean exists = false;
        for (Product productObject : products) {
            if (productObject.getId() == product.getId()) {
                exists = true;
                break;
            }
        }
        if(!exists){
            products.add(product);
        }
    }
     */

    /*
    Version 3
        public void addProduct(Product product) {
        for (Product productObject : products) {
            if (productObject.getId() == product.getId()) {
                throw new RuntimeException("Duplicate");
            }
        }
        products.add(product);
    }
     */

    public void addProduct(Product product) {
        for (Product productObject : products) {
            if (productObject.getId() == product.getId()) {
                throw new RuntimeException("Duplicate");
            }
        }
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void removeProduct(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    public void editProduct(int id, Product newProduct) {
        for (int i = 0; i < products.size(); i++) {
            Product currentProduct = products.get(i);
            if (currentProduct.getId() == id) {
                products.set(i, newProduct);
                break;
            }
        }
    }
}
