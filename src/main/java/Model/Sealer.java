
package Model;

/**
 *
 * @author hecto
 */
public class Sealer {
    
    private Integer id_sealer;
    private String dni_sealer;
    private String name_sealer;
    private String number_sealer;
    private Integer status_sealer;
    
    public Sealer(Integer id_sealer,String dni_sealer,String name_sealer,String number_sealer,Integer status_sealer){
        this.id_sealer = id_sealer;
        this.dni_sealer = dni_sealer;
        this.name_sealer = name_sealer;
        this.number_sealer = number_sealer;
        this.status_sealer = status_sealer;
    }
    
    public Sealer(){
        
    }

    /**
     * @return the id_sealer
     */
    public Integer getId_sealer() {
        return id_sealer;
    }

    /**
     * @param id_sealer the id_sealer to set
     */
    public void setId_sealer(Integer id_sealer) {
        this.id_sealer = id_sealer;
    }

    /**
     * @return the dni_sealer
     */
    public String getDni_sealer() {
        return dni_sealer;
    }

    /**
     * @param dni_sealer the dni_sealer to set
     */
    public void setDni_sealer(String dni_sealer) {
        this.dni_sealer = dni_sealer;
    }

    /**
     * @return the name_sealer
     */
    public String getName_sealer() {
        return name_sealer;
    }

    /**
     * @param name_sealer the name_sealer to set
     */
    public void setName_sealer(String name_sealer) {
        this.name_sealer = name_sealer;
    }

    /**
     * @return the number_sealer
     */
    public String getNumber_sealer() {
        return number_sealer;
    }

    /**
     * @param number_sealer the number_sealer to set
     */
    public void setNumber_sealer(String number_sealer) {
        this.number_sealer = number_sealer;
    }

    /**
     * @return the status_sealer
     */
    public Integer getStatus_sealer() {
        return status_sealer;
    }

    /**
     * @param status_sealer the status_sealer to set
     */
    public void setStatus_sealer(Integer status_sealer) {
        this.status_sealer = status_sealer;
    }
    
    
    
}
