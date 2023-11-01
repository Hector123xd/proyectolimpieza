package Model;

/**
 *
 * @author hecto
 */
public class Customer {

    private Integer id_customer;
    private String name_customer;
    private String dni_customer;
    private String address_customer;
    private Integer status_customer;
    
    public Customer(Integer id_customer,String dni_customer,String name_customer,String address_customer,Integer status_customer){
        this.id_customer = id_customer;
        this.dni_customer = dni_customer;
        this.name_customer = name_customer;
        this.address_customer = address_customer;
        this.status_customer = status_customer;
    }
    
    public Customer(){
        
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
     * @return the name_customer
     */
    public String getName_customer() {
        return name_customer;
    }

    /**
     * @param name_customer the name_customer to set
     */
    public void setName_customer(String name_customer) {
        this.name_customer = name_customer;
    }

    /**
     * @return the dni_customer
     */
    public String getDni_customer() {
        return dni_customer;
    }

    /**
     * @param dni_customer the dni_customer to set
     */
    public void setDni_customer(String dni_customer) {
        this.dni_customer = dni_customer;
    }

    /**
     * @return the address_customer
     */
    public String getAddress_customer() {
        return address_customer;
    }

    /**
     * @param address_customer the address_customer to set
     */
    public void setAddress_customer(String address_customer) {
        this.address_customer = address_customer;
    }

    /**
     * @return the status_customer
     */
    public Integer getStatus_customer() {
        return status_customer;
    }

    /**
     * @param status_customer the status_customer to set
     */
    public void setStatus_customer(Integer status_customer) {
        this.status_customer = status_customer;
    }
    
    

}
