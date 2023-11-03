
package Model;

/**
 *
 * @author hecto
 */
public class Sale {
    
    private Integer id_sell;
    private Integer id_seller;
    private Integer id_customer;
    private String sell_number;
    private Double total;
    
    public Sale(){
        
    }
    
    public Sale(Integer id_sell,Integer id_seller,Integer id_customer,String sell_number,Double total){
        this.id_sell = id_sell;
        this.id_seller = id_seller;
        this.id_customer = id_customer;
        this.sell_number = sell_number;
        this.total = total;
    }

    /**
     * @return the id_sell
     */
    public Integer getId_sell() {
        return id_sell;
    }

    /**
     * @param id_sell the id_sell to set
     */
    public void setId_sell(Integer id_sell) {
        this.id_sell = id_sell;
    }

    /**
     * @return the id_seller
     */
    public Integer getId_seller() {
        return id_seller;
    }

    /**
     * @param id_seller the id_seller to set
     */
    public void setId_seller(Integer id_seller) {
        this.id_seller = id_seller;
    }

    /**
     * @return the id_customer
     */
    public Integer getId_customer() {
        return id_customer;
    }

    /**
     * @param id_customer the id_customer to set
     */
    public void setId_customer(Integer id_customer) {
        this.id_customer = id_customer;
    }

    /**
     * @return the sell_number
     */
    public String getSell_number() {
        return sell_number;
    }

    /**
     * @param sell_number the sell_number to set
     */
    public void setSell_number(String sell_number) {
        this.sell_number = sell_number;
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
