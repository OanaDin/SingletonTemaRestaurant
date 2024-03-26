package g1087.classes.main;

import g1087.classes.masa.Masa;
import g1087.classes.masa.PozitieMasa;
import g1087.classes.ospatari.Ospatar;
import g1087.classes.restaurant.Restaurant;

public class Main {
    public static void main(String[] args){
        Restaurant restaurant1=Restaurant.getInstance("Unirii");
        Restaurant restaurant2=Restaurant.getInstance("Victoriei");
        Restaurant restaurant3=Restaurant.getInstance("Dorobanti");


        Masa masa1=new Masa(1,2,true,PozitieMasa.ETAJ);
        Masa masa2=new Masa(2,5,true,PozitieMasa.PARTER);
        Masa masa3=new Masa(3,4,true,PozitieMasa.TERASA);


        restaurant1.adaugaMasa(masa1);
        restaurant1.adaugaMasa(masa2);
        restaurant1.adaugaMasa(masa3);

        restaurant2.adaugaMasa(masa1);

        Ospatar ospatar1=new Ospatar("Gigel");
        Ospatar ospatar2=new Ospatar("Mirel");
        Ospatar ospatar3=new Ospatar("Ion");
        Ospatar ospatar4=new Ospatar("Vasile");

        //terasa,etaj,parter
        //ospatar2.preiaComanda(3,new boolean[]{true,true,false},"Unirii");

        ospatar3.getInfoMese("Victoriei");
        ospatar1.getInfoMese("Victoriei");
        ospatar2.getInfoMese("Unirii");
        ospatar4.getInfoMese("Dorobanti");


    }
}
