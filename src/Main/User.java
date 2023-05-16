package Main;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String password;
    private String email;
    private String homeAddress;
    private String workAddress;
    private List<String> orderedProducts;
    private List<String> favoriteProducts;
    private List<CreditCard> creditCards;

    public User(String username, String name, String surname, String dateOfBirth, String password, String email) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.email = email;
        this.orderedProducts = new ArrayList<>();
        this.favoriteProducts = new ArrayList<>();
        this.creditCards = new ArrayList<>();
    }

    public void orderProduct(String product, int quantity) {
        orderedProducts.add(product);
        // Add logic for placing an order
    }

    public void addFavoriteProduct(String product) {
        favoriteProducts.add(product);
        // Add logic for adding a favorite product
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public List<String> getOrderedProducts() {
        return orderedProducts;
    }

    public void setOrderedProducts(List<String> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }

    public List<String> getFavoriteProducts() {
        return favoriteProducts;
    }

    public void setFavoriteProducts(List<String> favoriteProducts) {
        this.favoriteProducts = favoriteProducts;
    }

    public List<Main.CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(List<Main.CreditCard> creditCards) {
        this.creditCards = creditCards;
    }
    // Other getters, setters, and methods specific to the User class
}
