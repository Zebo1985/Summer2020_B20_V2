package day41_Static;

import java.util.ArrayList;

/*
create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        reugularCarpets
            write a program to store all the persian Carpets into the list of persianCarpets, and store all regular carpets into the list of reugularCarpets
                    use for each loop to print out all the persian carpets

 */
public class CarpetObject {
    public static void main(String[] args) {
 //                             0           1              2          3               4
        Carpet []carpets = {new Carpet(),new Carpet(),new Carpet(),new Carpet(),new Carpet(),};
        carpets[0].customOrder(4.5,3.5,7.5,false);
        carpets[1].customOrder(4.5,5.5,8.5,true);
        carpets[0].customOrder(3.5,6.5,9.5,false);
        carpets[1].customOrder(6.5,4.5,10.5,true);
        carpets[1].customOrder(6.5,5.5,12.5,true);

 /*for(Carpet each:carpets){
    each.getCarpetInfo();
 }*/
        ArrayList<Carpet>persianCarpets = new ArrayList<>();
        ArrayList<Carpet>regularCarpets = new ArrayList<>();
     for(int i =0; i<= carpets.length-1;i++){
      if(carpets[i].isPersian){
        persianCarpets.add(carpets[i]);
    }else {
          regularCarpets.add(carpets[i]);
      }
}




        System.out.println("Number of persian carpets: "+persianCarpets.size());
     System.out.println("Number of regular carpets: "+persianCarpets.size());
    }
}
