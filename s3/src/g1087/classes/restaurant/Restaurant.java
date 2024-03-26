package g1087.classes.restaurant;

import g1087.classes.masa.Masa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Restaurant {

   // private static Restaurant instance=null;
    //facem un hashmap
    private List<Masa> listaMese;
    private static HashMap<String,Restaurant> listaRestaurante=null;
    private String locatie;
    private Restaurant(String locatie){

        listaMese =new ArrayList<>();
        this.locatie=locatie;
       // listaRestaurante.put(locatie,this);


        //daca locatia nu exista, se creeza instanta a restaurantului cu locatia respectiva
//        //si se adauga in Hashmap
//        if (!listaRestaurante.containsKey(cheie)) {
//
//            listaRestaurante.put(cheie, new Restaurant(locatie));
//            //hashmap.put(key,value)
//            // Adaugă instanța restaurantului în map dacă locația nu există
//        }
//        return listaRestaurante.get(cheie);
// return listaRestaurante.get
    }

    //blocul static se executa o singura data
    static{
        listaRestaurante=new HashMap<>();
        listaRestaurante.put("Unirii",new Restaurant("Unirii"));
        listaRestaurante.put("Victoriei",new Restaurant("Victoriei"));
        listaRestaurante.put("Dorobanti",new Restaurant("Dorobanti"));
    }


    public static Restaurant getInstance(String locatie) {
       // try {
            return listaRestaurante.get(locatie);
//        } catch (Exception e) {
//            System.out.println(e.getMessage() + locatie);
//            return null;
//        }
    }

    public void adaugaMasa(Masa masa){
        if(masa !=null){
            this.listaMese.add(masa);
        }
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "listaMese=" + listaMese +
                ", locatie='" + locatie + '\'' +
                '}';
    }

    public Masa getMasaDupaPreferinte(int nrPers
            ,boolean[] preferinte){
        for(Masa m : listaMese){
            if(m.isEsteDisponibila()
                    && m.getNrScaune() >=nrPers
                    && preferinte[m.getPozitieMasa().ordinal()]){
                //ordinal returneaza indexul fiecarui el din enum
                return m;
            }
        }
        return null;
    }

}
