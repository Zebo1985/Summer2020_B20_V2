package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject2 {

    public static void main(String[] args) {
        Carpet []carpets = {new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet(),};
        carpets[0].customOrder(4.5,3.5,7.5,false);
        carpets[1].customOrder(4.5,5.5,8.5,true);
        carpets[0].customOrder(3.5,6.5,9.5,false);
        carpets[1].customOrder(6.5,4.5,10.5,true);
        carpets[1].customOrder(6.5,5.5,12.5,true);

 /*for(Carpet each:carpets){
    each.getCarpetInfo();
 }*/
        ArrayList<Carpet> persianCarpets = new ArrayList<>();
        persianCarpets.addAll(Arrays.asList(carpets));
        persianCarpets.removeIf(p->!p.isPersian);

        ArrayList<Carpet>regularCarpets = new ArrayList<>();
        regularCarpets.addAll(Arrays.asList(carpets));
        //persianCarpets.removeIf(p->p.isPersian);
regularCarpets.removeAll(persianCarpets);

        System.out.println("Number of persian carpets: "+persianCarpets.size());
        System.out.println("Number of regular carpets: "+persianCarpets.size());
    }
}
