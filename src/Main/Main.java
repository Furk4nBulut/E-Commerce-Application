package Main;


public class Main {


        public static void main(String[] args) {
            // create a new user
            User user = new User("username", "John", "Doe", "01/01/2000", "password", "johndoe@example.com");

            // add a home address for the user
            user.addHomeAddress("123 Main St", "Apt 1", "Anytown", "CA", "12345");

            // create a new credit card for the user
            CreditCard creditCard = new CreditCard("John Doe", "1234567890123456", "123", "01/23");
            user.addCreditCard(creditCard);

            // create a new product
            Product product = new Product("Product Name", "Blue", "Electronics", 10, 2.5, "A product description");

            // order the product
            Order order = new Order(user, product, creditCard);
            order.placeOrder(2);

            // display user information
            System.out.println("User: " + user.getName() + " " + user.getSurname());
            System.out.println("Home Address: " + user.getHomeAddress());
            System.out.println("Credit Card: " + user.getCreditCards().get(0).getCardNumber());

            // display product information
            System.out.println("Product: " + product.getName());
            System.out.println("Stock: " + product.getStock());

            // display order information
            System.out.println("Order Quantity: " + order.getQuantity());
            System.out.println("Order Total: $" + order.getOrderTotal());
        }
    }

