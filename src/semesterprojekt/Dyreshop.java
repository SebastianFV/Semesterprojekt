/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterprojekt;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Squid
 */
public class Dyreshop 
{
    ArrayList<Reptile> reptileList = new ArrayList<>();
    ArrayList<Mammal> MammalList = new ArrayList<>();
    ArrayList<Aquatic> aquaticList = new ArrayList<>();
    ArrayList<Bird> birdeList = new ArrayList<>();
    ArrayList<Animals> basketList = new ArrayList<>();
    private double balance = 0;
    private int totalSoldAnimal = 0;
    private int soldAnimal = 0;
    private double totalPrice = 0;
    private int totalCostomer = 0;
    private double earned = 0;
    Reptile reptile;
    Aquatic aquatic;
    Bird bird;
    Mammal mammal;
    static int ID = 10000;
    
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
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(int a)
    {
        balance = a;
    }
    
    public int getSoldAnimals()
    {
        return soldAnimal;
    }
    public void setSoldAnimals(int a)
    {
        soldAnimal = a;
    }
    
    public double getTotalPrice()
    {
        return totalPrice;
    }
    public void setTotalPrice(int a, int b)
    {
       totalPrice = a*b;
    }
    
    public double getEarned()
    {
        return earned;
    }
    public void setEarned(int a)
    {
        earned = a;
    }
    
    public int getTotalCostomer()
    {
        return totalCostomer;
    }
    public void setTotalCostomer(int a)
    {
        totalCostomer = a;
    }
    
    public double moneyBack() {
        double returnMoney = balance;
        balance = 0;
        System.out.println("Du får " + returnMoney + " kr retur");
//        eventLog.add(new Event("Indhold"));
        return returnMoney;
    }
    
    public int printReceipt()
    {
        if (balance >= totalPrice)
        {
            for (int i = 0; i < basketList.size(); i++)
            {
                earned += basketList.get(i).getPrice();
                for (int j = 0; j < basketList.get(i).getAntal(); j++)
                {
                    totalSoldAnimal += 1;
                    
                }
            }
            
        }
    }
//    public void calcPrice()
//    {
//        if (getSelectAnimal1() == "Goldfish")
//        {
//
//        }
//    }
    
    
    
    
    
    
    
    
}
