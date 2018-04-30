/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterprojekt;

import java.util.Date;

/**
 *
 * @author Squid
 */
public class Dyreshop 
{
    Reptile reptile;
    Aquatic aquatic;
    Bird bird;
    Mammal mammal;
    static int ID = 10000;
    
//    aquaticDisplay1.sætnavneAquatic(null);
//    aquaticDisplay2.sætnavneReptile(null);
//    aquaticDisplay3.sætnavneMammal(null);
//    aquaticDisplay4.sætnavneBird(null);
    
    public static String getTime()
    {
        Date dato = new Date();
        String time = dato.toString();
        return time;
    }

    public static int getID() 
    {
        return ID;
    }

    public static void setID() 
    {
        ID = ID++;
    }
    
//    public void calcPrice()
//    {
//        if (getSelectAnimal1() == "Goldfish")
//        {
//
//        }
//    }
    
    
    
    
    
    
    
    
}
