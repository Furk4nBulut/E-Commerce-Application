import java.util.ArrayList;

public class User {
    private String fullName;
    private String email;
    private String password;
    private String phone;
    private String address;
    private String workAddress;
    private ArrayList<Product> orderedProducts;
    private ArrayList<CreditCard> creditCards;
    private ArrayList<Product> favProducts;

    public User(){
        this.fullName = "";
        this.email = "";
        this.password = "";
        this.phone = "";
        this.address = "";
        this.workAddress = "";
        this.orderedProducts = new ArrayList<Product>();
        this.creditCards = new ArrayList<CreditCard>();
        this.favProducts = new ArrayList<Product>();
    }
    public User(String fullName, String email, String password, String phone, String address, String workAddress){
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.address = address;
        this.workAddress = workAddress;
        this.orderedProducts = new ArrayList<Product>();
        this.creditCards = new ArrayList<CreditCard>();
        this.favProducts = new ArrayList<Product>();
    }

    //Gettters and Setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public ArrayList<Product> getOrderedProducts() {
        return orderedProducts;
    }

    public void setOrderedProducts(ArrayList<Product> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }

    public ArrayList<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(ArrayList<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

    public ArrayList<Product> getFavProducts() {
        return favProducts;
    }

    public void setFavProducts(ArrayList<Product> favProducts) {
        this.favProducts = favProducts;
    }

    //Method 1
    public void addProductToFav(Product product){
        this.favProducts.add(product);
        System.out.println(product.toString()+ " added to favorites");
    }

    public void removeProductFromFav(Product product){
        this.favProducts.remove(product);
        System.out.println(product.toString()+ " removed from favorites");
    }

    //Method 2
    public void addProductToOrder(Product product){
        this.orderedProducts.add(product);
        System.out.println(product.toString()+ " added to order");
    }
    public void removeProductFromOrder(Product product){
        this.orderedProducts.remove(product);
        System.out.println(product.toString()+ " removed from order");
    }
}
