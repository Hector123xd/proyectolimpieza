package Model;

/**
 *
 * @author hecto
 */
public class SaleDetails {

    private Integer id_saledetails;
    private Integer id_sale;
    private Integer id_product;
    private Integer quantity;
    private Double total;

    public SaleDetails() {

    }
    
    public SaleDetails(Integer id_saledetails,Integer id_sale, Integer id_product,Integer quantity,Double total){
        this.id_saledetails = id_saledetails;
        this.id_sale = id_sale;
        this.id_product = id_product;
        this.quantity = quantity;
        this.total = total;
    }

    /**
     * @return the id_saledetails
     */
    public Integer getId_saledetails() {
        return id_saledetails;
    }

    /**
     * @param id_saledetails the id_saledetails to set
     */
    public void setId_saledetails(Integer id_saledetails) {
        this.id_saledetails = id_saledetails;
    }

    /**
     * @return the id_sale
     */
    public Integer getId_sale() {
        return id_sale;
    }

    /**
     * @param id_sale the id_sale to set
     */
    public void setId_sale(Integer id_sale) {
        this.id_sale = id_sale;
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
     * @return the quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the total
     */
    public Double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(Double total) {
        this.total = total;
    }
    
    

   
}
