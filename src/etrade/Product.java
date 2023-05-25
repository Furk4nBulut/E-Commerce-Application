package etrade;

public class Product {
    private String productName;
    private String productDescription;
    private String productCategory;
    private String productBrand;
    private String productColor;
    private int productSize;
    private int productPrice;
    private int productStock;


    public Product(String productName, String productDescription, String productCategory, String productBrand,
                   String productColor, int productSize, int productPrice, int productStock){
        this.productName = productName;
        this.productDescription = productDescription;
        this.productCategory = productCategory;
        this.productBrand = productBrand;
        this.productColor = productColor;
        this.productSize = productSize;
        this.productPrice = productPrice;
        this.productStock = productStock;
    }

    //Getters and Setters


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public int getProductSize() {
        return productSize;
    }

    public void setProductSize(int productSize) {
        this.productSize = productSize;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    //Methods
    public boolean checkStock(){
        if (this.productStock > 0){
            System.out.println(this.productName + " " + this.productStock+ " left in stock");
            return true;
        }
        else{
            System.out.println("Not enough stock");
            return false;
        }
    }
    //Method 2
   /* public void reduceStock(int numberOfProducts){
        this.setProductStock(this.getProductStock() - numberOfProducts);
    } unneccessary method
    */
    //Method 3
     @Override
    public String toString(){
         return this.productBrand +" "+ this.productName;
     }
}
