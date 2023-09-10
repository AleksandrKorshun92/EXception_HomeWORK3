package Model;

import Exceptions.EmptyProductException;
import Exceptions.NameProtuctException;
import Exceptions.PriceProductException;
import Exceptions.ProductNotException;

public class Model {
   private OnlineShop onlineShop;
   public Model() {
      this.onlineShop = new OnlineShop("Test");
   }

   public void addProduct (String name, int quantity, double price) throws NameProtuctException, PriceProductException, EmptyProductException{
      onlineShop.addProduct(name, quantity, price);
   }

   public void removeProduct (String name) throws NameProtuctException, EmptyProductException, ProductNotException {
      onlineShop.removeProduct(name);
   }

   public void allProducts () throws ProductNotException {
      onlineShop.allProduct();

   }
   public Product getProduct (int productId) throws EmptyProductException, ProductNotException {
      return onlineShop.getProduct(productId);
   }
}
