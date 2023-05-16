package Main;

public class Order {
    private User user;
    private Product product;
    private CreditCard creditCard;

    public Order(User user, Product product, CreditCard creditCard) {
        this.user = user;
        this.product = product;
        this.creditCard = creditCard;
    }

    public void placeOrder(int quantity) {
        if (product != null && user != null && creditCard != null) {
            // Check product stock and place order
            product.orderProduct(quantity);

            // Perform user's product ordering
            user.orderProduct(product.getName(), quantity);

            // Process payment using credit card
            processPayment(quantity);
        }
    }

    private void processPayment(int quantity) {
        // Add logic for payment processing using the credit card
        System.out.println("Payment processed for " + quantity + " " + product.getName() + "(s).");
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public String getQuantity() {
        return product.getStock() + " " + product.getName() + "(s) available.";
    }

    public String getOrderTotal() {
        return "$" + product.getPrice() * product.getStock();
    }
}
