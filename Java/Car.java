package Java;

public class Car {
    private Integer id;
    private String license;
    private Account driver;
    protected Integer passenger;

    public Car (String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    public Integer getPassanger(){
        return passenger;
    }

    public void setPassanger(Integer passanger){

        if( passanger == 4) {

            this.passenger = passanger;

        }
        else {
            System.out.println("Necesita asignar 4 pasajeros");
        }
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }
    
    
}
