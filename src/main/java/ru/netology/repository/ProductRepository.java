package ru.netology.repository;

import ru.netology.domain.Product;

public class ProductRepository {
    private Product[] products = new Product[0];

    public Product[] findAll() {
        return products;
    }

    public Product findById(int id) {
        for (Product product : products) {
            if(product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public void save(Product product) {
        if(findById(product.getId()) != null) {
            throw new AlreadyExistsException("Элемент с таким id: " + product + " уже существует в базе");
        }
        int length = products.length +1;
        Product[] tmp = new Product[length];
        System.arraycopy(products,0,tmp,0,products.length);
        int newProduct = tmp.length - 1;
        tmp[newProduct] = product;
        products = tmp;
    }

    public void removeById(int id) {
        if (findById(id) == null) {
            throw new NotFoundException("Не найден элемент с id: " + id);
        }
        int length = products.length - 1;
        Product[] tmp = new Product[length];
        int index = 0;
        for (Product product : products) {
            if (product.getId() != id) {
                tmp[index] = product;
                index++;
            }
        }
        products = tmp;
    }

}
