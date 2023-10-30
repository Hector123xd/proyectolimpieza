package Model;

/**
 *
 * @author hecto
 */
public class Product {

    private Integer id_product;
    private String name_product;
    private Integer price_product;
    private String category_product;
    private boolean stock_product;
    
    public Product(){
        
    }
    
    public Product(Integer id_product,String name_product,Integer price_product,String category_product,boolean stock_product){
        this.id_product = id_product;
        this.name_product = name_product;
        this.price_product = price_product;
        this.category_product = category_product;
        this.stock_product = stock_product;
    }

    /**
     * @return the id_product
     */
    public Integer getId_product() {
        return id_product;
    }

    /**
     * @param id_product the id_product to set
     */
    public void setId_product(Integer id_product) {
        this.id_product = id_product;
    }

    /**
     * @return the name_product
     */
    public String getName_product() {
        return name_product;
    }

    /**
     * @param name_product the name_product to set
     */
    public void setName_product(String name_product) {
        this.name_product = name_product;
    }

    /**
     * @return the price_product
     */
    public Integer getPrice_product() {
        return price_product;
    }

    /**
     * @param price_product the price_product to set
     */
    public void setPrice_product(Integer price_product) {
        this.price_product = price_product;
    }

    /**
     * @return the category_product
     */
    public String getCategory_product() {
        return category_product;
    }

    /**
     * @param category_product the category_product to set
     */
    public void setCategory_product(String category_product) {
        this.category_product = category_product;
    }

    /**
     * @return the stock_product
     */
    public boolean getStock_product() {
        return stock_product;
    }

    /**
     * @param stock_product the stock_product to set
     */
    public void setStock_product(boolean stock_product) {
        this.stock_product = stock_product;
    }

}
