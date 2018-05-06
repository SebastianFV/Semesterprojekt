/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterprojekt;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
public class Dyreshop 
{
    //Class-object pointer reference
    Receipt receipt;
    GUI gui;
    TestData overview;
    Animal animal;
    Reptile reptile;
    Aquatic aquatic;
    Bird bird;
    Mammal mammal;
    
    //List
    public ArrayList<Customer> customer = new ArrayList<>();       // Contains the content of the basket
    
    //Variables
    private double balance = 0;                             // Amount paid
    private int soldAnimals = 0;                            // Counts animals sold
    private double totalPrice = 0;                          // Price to be paid
    private double earned = 0;                              // Amount earned since launch
    private int totalCostomer = 0;                          // Amount of costomers since launch
    static int ID = 10000;
    
    //Methods
    public static String getTime()
    {
        Date dato = new Date();
        String time = dato.toString();
        return time;
    }
    
    //Get og set
    //G/S Animal information:
    public int getAdultSize() {
        return animal.getAdultSize();
    }

    public void setAdultSize(int adultSize) {
        animal.setAdultSize(adultSize);
    }

    public int getPrice() {
        return animal.getPrice();
    }

    public void setPrice(int price) {
        animal.setPrice(price);
    }
    
    public int getAntal() {
        return animal.getAntal();
    }

    public void setAntal(int Antal) {
        animal.setAntal(Antal);
    }
    
    public boolean isIsALoner() {
        return animal.isIsALoner();
    }

    public void setIsALoner(boolean isALoner) {
        animal.setIsALoner(isALoner);
    }

    public int getYearsOld() {
        return animal.getYearsOld();
    }

    public void setYearsOld(int yearsOld) {
        animal.setYearsOld(yearsOld);
    }

    public int getExpectedLifeAge() {
        return animal.getExpectedLifeAge();
    }

    public void setExpectedLifeAge(int expectedLifeAge) {
        animal.setExpectedLifeAge(expectedLifeAge);
    }

    public String getSpecies() {
        return animal.getSpecies();
    }

    public void setSpecies(String species) {
        animal.setSpecies(species);
    }

    public int getWeight() {
        return animal.getWeight();
    }

    public void setWeight(int weight) {
        animal.setWeight(weight);
    }

    public boolean isIsAlive() {
        return animal.isIsAlive();
    }

    public void setIsAlive(boolean isAlive) {
        animal.setIsAlive(isAlive);
    }

    public boolean isIsHerbivore() {
        return animal.isIsHerbivore();
    }

    public void setIsHerbivore(boolean isHerbivore) {
        animal.setIsHerbivore(isHerbivore);
    }

    public boolean isIsCarnivore() {
        return animal.isIsCarnivore();
    }

    public void setIsCarnivore(boolean isCarnivore) {
        animal.setIsCarnivore(isCarnivore);
    }
        
	public void birthday()
	{
            animal.birthday();
	}
		
	public String toString()
	{
            return animal.toString();
	}
        
    //G/S generel
    
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
    
    public double getMoneyBack() 
    {
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
            for (int i = 0; i < customer.size(); i++) 
            {
                earned += customer.get(i).getPrice();
                for (int j = 0; j < customer.get(i).getAntal(); j++) 
                {
                    soldAnimals += 1;
                }
            }
            balance -= totalPrice;
            totalCostomer += 1;
//            customer.clear();
            totalPrice = 0;
            return 1;
        } else {
            return -1;
        }
    }
    
    public static int getID() 
    {
        return ID;
    }

    public static void setID() 
    {
        ID = ID++;
    }
    
    //Basket
     public void addCos(Customer a)
    {
        customer.add(a);
        totalCostomer = totalCostomer +1;
        ID = ID+1;
    }

    public int getPriceBasket()
    {
        for(Customer cos : customer)
        {
            return cos.getPrice();
        }
       return 0;
    }
    public int getAntalBasket()
    {
        for(Customer cos : customer)
        {
            return cos.getAntal();
        }
       return 0;
    }
    public int samletPris()
    {
        for (Customer cos : customer)
        {
            return cos.getAntal() * cos.getPrice();
        }
        return 0;
    }
    

    
    public void printLog()
    {
        for (int i = 0; i < customer.size(); i++) 
        {
            System.out.println("Antal: " + customer.get(i).getAntal());
            System.out.println("pris pr styk: " + customer.get(i).getPrice());
            System.out.println("samlet pris: " + customer.get(i).getPrice() * customer.get(i).getAntal());
        }
    }
    
    public void updateBasketWindow(){
        gui.updateBasketWindow();
    }
}
   