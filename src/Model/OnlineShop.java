package Model;

import Exceptions.EmptyProductException;
import Exceptions.NameProtuctException;
import Exceptions.PriceProductException;
import Exceptions.ProductNotException;

import java.util.ArrayList;
import java.util.List;

public class OnlineShop implements OnlineShopUI{
    private String nameShop;
    private List <Product> products;

    public OnlineShop(String nameShop) {
        this.nameShop = nameShop;
        this.products = new ArrayList<>();
    }

    @Override
    public void addProduct(String name, int quantity, double price) throws NameProtuctException, PriceProductException, EmptyProductException {
        if(name.isEmpty()) throw new NameProtuctException("Название продукта ошибочное ");
        if(price <= 0) throw new PriceProductException("Цена продукта ошибочная ");
        if(quantity <= 0) throw new EmptyProductException("Количество продукта ошибочное ");
        products.add(new Product(name, quantity, price));
    }

    @Override
    public void removeProduct(String name) throws NameProtuctException, EmptyProductException, ProductNotException {
        if (name.isEmpty()) throw new NameProtuctException("Название продукта ошибочное");
        if (products.size() == 0) throw new ProductNotException("Магазин пуст");
        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
            } else new EmptyProductException("Продукт не найден в магазине");

        }
    }

    @Override
    public void allProduct() throws ProductNotException {
        if (products.size() == 0) throw new ProductNotException("Магазин пуст");
        for (Product product : products) {
            System.out.println(product.toString());
        }

    }

    @Override
    public Product getProduct(int productId) throws EmptyProductException, ProductNotException {
        if (productId <= 0) throw new EmptyProductException("Продукт не найден в магазине");
        if (products.size() == 0) throw new ProductNotException("Магазин пуст");
        return ProductBasa.getProduct(1);
    }
}
