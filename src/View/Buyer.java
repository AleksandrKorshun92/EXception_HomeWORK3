package View;

import Present.Presenter;

import java.util.Scanner;

public class Buyer {
    private Presenter presenter;
    private Scanner sc;

    public Buyer() {
        presenter = new Presenter();
        sc = new Scanner(System.in);
    }
    public void start() {
        while(true) {
            System.out.print(MenuShop.MenuShop);
            System.out.println(Messanger.MENU);
            String menu = sc.nextLine();
            switch (menu) {
                case "1":
                    System.out.println(Messanger.ADDPRODUCT);
                    System.out.println(Messanger.ADDPRODUCTNAME);
                    String name = sc.nextLine();
                    System.out.println(Messanger.ADDPRODUCTQUALITY);
                    int quantity = Integer.parseInt(sc.nextLine());
                    System.out.println(Messanger.ADDPRODUCTPRICE);
                    double price = Double.parseDouble(sc.nextLine());
                    presenter.addProduct(name, quantity, price);
                    break;


                case "2":
                    System.out.printf(Messanger.ALLPRODUCTS);
                    presenter.allProducts();
                    break;

                case "3":
                    System.out.printf(Messanger.GETPRODUCTS);
                    presenter.getProduct(Integer.parseInt(sc.nextLine()));
                    break;

                case "4":
                    System.out.printf(Messanger.DELETEPRODUCT);
                    presenter.removeProduct(sc.nextLine());
                    break;

                case "5":
                    System.out.printf(Messanger.EXIT);
                    sc.close();
                    return;
            }

        }
    }

}

