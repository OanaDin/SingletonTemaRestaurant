package g1087.classes.ospatari;

import g1087.classes.masa.Masa;
import g1087.classes.restaurant.Restaurant;

public class Ospatar {
    private String nume;

    public Ospatar(String nume) {
        this.nume = nume;
    }

    public void preiaComanda(int nrPers
            ,boolean[] preferinte,String locatie){

        Masa masa= Restaurant.getInstance(locatie)
                .getMasaDupaPreferinte(nrPers,preferinte);
        if(masa !=null){
            masa.setEsteDisponibila(false);
        }
        else{
            System.out.println("Nu sunt mese disponibile!");
        }
    }

    public void incheieComanda(Masa masa){
        masa.setEsteDisponibila(true);
    }
    public void getInfoMese(String locatie){
        Restaurant restaurant=Restaurant.getInstance(locatie);
        System.out.println("Ospatar " + this.nume +" din locatia "+locatie+ " vede mesele: "+restaurant);

    }
}
