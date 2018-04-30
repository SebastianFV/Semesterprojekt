/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterprojekt;

import java.util.ArrayList;

/**
 *
 * @author Nicho
 */
public class Basket {

    void addCos(Aquatic goldfish) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public class basket 
{
    public ArrayList<Animals> kunder;
    
    public basket()
    {
        kunder = new ArrayList<Animals>();
    }
    
    public void addCos(Animals cos)
    {
        kunder.add(cos);
    }

//    public  void setID(int ID)
//    {
//        kunder.forEach((cos) -> {
//            cos.setID(ID);
//        });
//    }
//    public int getID()
//    {
//        for(Kunde cos : kunder)
//        {
//            return cos.getID();
//        }
//        return 0;
//    }
    public int getPrice()
    {
        for(Animals cos : kunder)
        {
            return cos.getPrice();
        }
       return 0;
    }
    public int getAntal()
    {
        for(Animals cos : kunder)
        {
            return cos.getAntal();
        }
       return 0;
    }
    public int samletPris()
    {
        for (Animals cos : kunder)
        {
            return cos.getAntal() * cos.getPrice();
        }
        return 0;
    }
//    
//    public int getRetur()
//    {
//        for(Kunde cos : kunder)
//        {
//            return cos.getRetur();
//        }
//        return 0;
//    }
    
    public void printLog()
    {
        for (int i = 0; i < kunder.size(); i++) 
        {
            System.out.println("Antal: " + kunder.get(i).getAntal());
            System.out.println("pris pr styk: " + kunder.get(i).getPrice());
            System.out.println("samlet pris: " + kunder.get(i).getPrice() * kunder.get(i).getAntal());
        }
    }
}
}
