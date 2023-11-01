package Model;

/**
 *
 * @author hecto
 */
public class Sells {

    private Integer id_venta;
    private String num_venta;
    private String date_time;
    private Double total;
    private Integer purchase_status;
    private Integer id_customer;
    private Integer id_seller;

    public Sells(Integer id_venta, String num_venta, String date_time, Double total, Integer purchase_status, Integer id_customer, Integer id_seller) {
        this.id_venta = id_venta;
        this.num_venta = num_venta;
        this.date_time = date_time;
        this.total = total;
        this.purchase_status = purchase_status;
        this.id_customer = id_customer;
        this.id_seller = id_seller;
    }

    public Sells() {

    }

    /**
     * @return the id_venta
     */
    public Integer getId_venta() {
        return id_venta;
    }

    /**
     * @param id_venta the id_venta to set
     */
    public void setId_venta(Integer id_venta) {
        this.id_venta = id_venta;
    }

    /**
     * @return the num_venta
     */
    public String getNum_venta() {
        return num_venta;
    }

    /**
     * @param num_venta the num_venta to set
     */
    public void setNum_venta(String num_venta) {
        this.num_venta = num_venta;
    }

    /**
     * @return the date_time
     */
    public String getDate_time() {
        return date_time;
    }

    /**
     * @param date_time the date_time to set
     */
    public void setDate_time(String date_time) {
        this.date_time = date_time;
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

    /**
     * @return the purchase_status
     */
    public Integer getPurchase_status() {
        return purchase_status;
    }

    /**
     * @param purchase_status the purchase_status to set
     */
    public void setPurchase_status(Integer purchase_status) {
        this.purchase_status = purchase_status;
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
    
    

}
