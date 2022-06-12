package ru.netology.repository;

import ru.netology.domain.Product;

public class ProductRepository {
    private Product[] products = new Product[0];

    public Product[] findAll() {
        return products;
    }

    public void save(Product product) {
        int length = products.length +1;
        Product[] tmp = new Product[length];
        System.arraycopy(products,0,tmp,0,products.length);
        int newProduct = tmp.length - 1;
        tmp[newProduct] = product;
        products = tmp;
    }

    public void removeById(int id) {
        int length = products.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product product : products) {
            if (product.getId() != id) {
                if (index +1 == products.length) {
                    return;
                }
                tmp[index] = product;
                index++;
            }
        }
        products = tmp;
    }

}
