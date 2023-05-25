package etrade;

import etrade.CreditCard;
import etrade.Product;
import etrade.User;

public class Order {
    private User orderUser;
    private CreditCard userCreditCard;
    private Product orderedProduct;
    private int numberOfProducts;
    private int totalPrice;


    public Order(User orderUser, Product orderedProduct, CreditCard userCreditCard, int numberOfProducts, int totalPrice){
        this.orderUser = orderUser;
        this.orderedProduct = orderedProduct;
        this.userCreditCard = userCreditCard;
        this.numberOfProducts = numberOfProducts;
        this.totalPrice = totalPrice;

    }

    //Getters and Setters

    public User getOrderUser() {
        return orderUser;
    }

    public void setOrderUser(User orderUser) {
        this.orderUser = orderUser;
    }


    public CreditCard getUserCreditCard() {
        return userCreditCard;
    }

    public void setUserCreditCard(CreditCard userCreditCard) {
        this.userCreditCard = userCreditCard;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Product getOrderedProduct() {
        return orderedProduct;
    }

    public void setOrderedProduct(Product orderedProduct) {
        this.orderedProduct = orderedProduct;
    }
    //Methods
   public void addOrder(){
        if(this.orderedProduct.getProductStock() > 0){
            this.orderUser.addProductToOrder(this.orderedProduct);
            System.out.println("Product can be added to order");
        }
        else{
            System.out.println("Product is out of stock");
        }
   }
   public void orderProcess(){
        if(this.userCreditCard.getCardBalance() >= this.totalPrice && this.orderedProduct.checkStock() == true){
            this.userCreditCard.setCardBalance(this.userCreditCard.getCardBalance() - this.totalPrice);
            this.orderedProduct.setProductStock(this.orderedProduct.getProductStock() - this.numberOfProducts);
            System.out.println( this.numberOfProducts+ " " +orderedProduct.getProductName() + " ordered");
        }
        else{
            System.out.println("Insufficient balance or not enough stock");
        }
   }


}

