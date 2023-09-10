package Model;

import Exceptions.EmptyProductException;
import Exceptions.NameProtuctException;
import Exceptions.PriceProductException;
import Exceptions.ProductNotException;

public interface OnlineShopUI {

    public void addProduct(String name, int quantity, double price) throws NameProtuctException, PriceProductException, EmptyProductException;
    public void removeProduct(String name) throws NameProtuctException, EmptyProductException, ProductNotException;
    public void allProduct() throws ProductNotException;
    public Product getProduct(int productId) throws EmptyProductException, ProductNotException;
}
