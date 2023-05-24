public class Main {


    public static void main(String[] args) {
        User user = new User("Furkan Bulut", "210316011", "123", "123", "Istanbul", "Manisa");
        User user1 = new User("Furkan Bulut", "210316011", "123", "123", "Istanbul", "Manisa");
        CreditCard card = new CreditCard("123456789",user, "12/12/2020", "123",999999999);
        Product product = new Product("Laptop","Gaming Laptop","Technology","Asus","black",15,100000,10);
        Product product1 = new Product("Laptop","Gaming Laptop","Technology","Asus","black",15,100000,10);
        Order order = new Order(user,product1,card,1,100000);
        Order order1 = new Order(user,product,card,2,155000);

        user.addProductToFav(product1);
        System.out.println("***************************");
user.addProductToOrder(product1);

        System.out.println("***************************");
        product1.checkStock();
        product1.reduceStock(5);
        product1.checkStock();

        System.out.println("***************************");
        order.addOrder();
        order1.addOrder();
        product.checkStock();
        order.addOrder();
        order.orderProcess();
        product1.checkStock();


    }
}