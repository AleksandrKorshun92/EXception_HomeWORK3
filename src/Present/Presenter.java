package Present;

import Exceptions.EmptyProductException;
import Exceptions.NameProtuctException;
import Exceptions.PriceProductException;
import Exceptions.ProductNotException;
import Model.Model;
import Model.Product;

public class Presenter {
    private Model model;

    public Presenter() {
        this.model = new Model();
    }

    public void addProduct (String name, int quantity, double price) {
        try {
            model.addProduct(name, quantity, price);
        } catch (NameProtuctException | PriceProductException | EmptyProductException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void removeProduct (String name) {
        try {
            model.removeProduct(name);
        } catch (NameProtuctException | EmptyProductException | ProductNotException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void allProducts () {
        try {
            model.allProducts();
        } catch (ProductNotException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public Product getProduct (int productId) {
        try {
            return model.getProduct(productId);
        } catch (EmptyProductException | ProductNotException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
