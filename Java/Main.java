package Java;

import java.util.ArrayList;
import java.util.HashMap;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");



        Uberx X = new Uberx("ASM645", new Account("Sergio", "123"), "Tesla", "S3XY");
        X.setPassanger(4);

        UberVan van = new UberVan("ASM645", new Account("Sergio", "123"), new HashMap<>(), new ArrayList<>());
        van.setPassanger(6);

    }




}