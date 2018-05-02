/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterprojekt;

import java.util.ArrayList;
import java.util.Date;
public class Dyreshop 
{
    ArrayList<Basket> basketList = new ArrayList<>();       // Contains the content of the basket
    private double balance = 0;                             // Amount paid
    private int soldAnimals = 0;                            // Counts animals sold
    private double totalPrice = 0;                          // Price to be paid
    private double earned = 0;                              // Amount earned since launch
    private int totalCostomer = 0;                          // Amount of costomers since launch
    
    Receipt receipt;
    GUI gui;
    Overview overview;
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
    
    //Get og set
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
        return soldAnimals;
    }
    public void setSoldAnimals(int a)
    {
        soldAnimals = a;
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
    
        public int printList() 
        {
        if (balance >= totalPrice) 
        {
            for (int i = 0; i < basketList.size(); i++) 
            {
                earned += basketList.get(i).getPrice();
                for (int j = 0; j < basketList.get(i).getAntal(); j++) 
                {
                    soldAnimals += 1;
                }
            }
            balance -= totalPrice;
            totalCostomer += 1;
            basketList.clear();
            totalPrice = 0;
            return 1;
        } else {
            return -1;
        }
    }
    
        public double returnMoney() {
        double retMoney = balance;
        balance = 0;
        System.out.println("Du får " + retMoney + " kr retur");
//        eventLog.add(new Event("penge retur", returbeloeb, "", 0));
        return retMoney;
    }


}
   