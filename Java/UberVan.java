package Java;
import java.util.Map;
import java.util.ArrayList;

public class UberVan extends Car{

    Map<String, Map<String,Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;


    public UberVan(String license, Account driver, Map<String,Map<String,Integer>> typeCarAccepted, ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
    
    @Override
    public void setPassanger(Integer passanger) {

        if(passanger == 6) {
            this.passenger = passanger;
        }
        else {
            System.out.println("EL UberVan debe tener 6 pasajeros");
        }
        
    }
}
