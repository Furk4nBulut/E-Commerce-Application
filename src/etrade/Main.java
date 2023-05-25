package etrade;

import etrade.CreditCard;
import etrade.User;

public class Main {


    public static void main(String[] args) {
        User user = new User("Furkan Bulut", "210316011@ogr.cbu.eddu.tr", "password",
                "5346456198", "Istanbul", "Manisa");
        User user1 = new User("Ahmet Bulut", "ahmetbulut@mail.com", "sifre",
                "56454655665", "Istanbul", "Istanbul");

        CreditCard card = new CreditCard("4856-5646-4465-4556-2555",user,
                "12/2028", "111",999999999);
        CreditCard card1 = new CreditCard("8457-5646-6456-4556-2555",user,
                "02/2028", "000",999999999);

        Product product = new Product("Laptop","Gaming Laptop","Technology",
                "Asus","black",15,20000,10);
        Product product1 = new Product("Phone","Mobile Device","Technology",
                "Apple","black",7,15000,5);


        Order order = new Order(user,product1,card,1,100000);
        Order order1 = new Order(user1,product,card1,3,155000);

        System.out.println("***************************");

        user.addProductToFav(product);
        user1.addProductToFav(product1);

        System.out.println("***************************");

        user.addProductToOrder(product);
        user1.addProductToOrder(product1);

        System.out.println("***************************");
        /*
        product.checkStock();
        product.reduceStock(5);
        product.checkStock();
        product1.checkStock();
        product1.reduceStock(5);
        product1.checkStock();*/
       // System.out.println("***************************");

        order.addOrder();
        order.orderProcess();
        product.checkStock();
        System.out.println(" ");
        order1.addOrder();
        order1.orderProcess();
        product1.checkStock();

        System.out.println("***************************");

    }
}