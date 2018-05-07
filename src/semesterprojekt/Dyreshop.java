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
       
    //Class-object pointer reference
    int finalPrice = 0;
    int antal = 0;
    String selectedAnimal = "";
    
    //List
    public ArrayList<Basket> basket = new ArrayList<>();       // Contains the content of the basket
    public ArrayList<Animal> reptileList = new ArrayList<>();
    public ArrayList<Animal> aquaticList = new ArrayList<>();
    public ArrayList<Animal> birdList = new ArrayList<>();
    public ArrayList<Animal> mammalList = new ArrayList<>();
    
    //Variables
    private double balance = 0;                             // Amount paid
    private int soldAnimals = 0;                            // Counts animals sold
    private double totalPrice = 0;                          // Price to be paid
    private double earned = 0;                              // Amount earned since launch
    private int totalCustomer = 0;                          // Amount of costomers since launch
    static int ID = 10000;
    
    Dyreshop()
    {
        reptileList.add(new Reptile (2, 50, 500, "Snake", 100, false, true, 500, true, 500));
        reptileList.add(new Reptile (7, 75, 1000, "Turtle", 75, true, true, 500, true, 100));
        reptileList.add(new Reptile (2, 30, 500, "Salamander", 50, false, true, 500, true, 200));
        reptileList.add(new Reptile (5000000, -4900100, 999999, "Dinosaur", 5000, false, true, 999999, true, 99999));
        reptileList.add(new Reptile (3000, 10000, 999999, "Dragon", 999999, false, true, 9999999, true, 99999));

        aquaticList.add(new Aquatic (1, 3, 50, "Goldfish", 10, true, false, 50, true, 5));
        aquaticList.add(new Aquatic (5, 30, 500000, "Whale", 500, true, true, 50000000, true, 99999));
        aquaticList.add(new Aquatic (3, 30, 999999, "Shark", 5000, false, true, 500000, true, 9999));
        aquaticList.add(new Aquatic (1, 3, 50, "Sea Cucumber", 10, true, false, 50, true, 5));
        aquaticList.add(new Aquatic (3, 30, 999999, "Dolphin", 5000, false, true, 500000, false, 9999));

        birdList.add(new Bird (1, 5, 100, "Dove", 50, true, true, 500, false, 500));
        birdList.add(new Bird (1, 5, 100, "Pigeon", 50, true, true, 500, false, 500));
        birdList.add(new Bird (1, 5, 100, "small", 50, true, true, 500, false, 500));
        birdList.add(new Bird (1, 10, 200, "large", 100, false, true, 50000, true, 1000));

        mammalList.add(new Mammal (2, 13, 50, "Ape", 50, true, true, 5, false, 50, "Likes to climb"));
        mammalList.add(new Mammal (2, 23, 500, "Elephant", 500, true, false, 50, false, 999, "Eating"));
        mammalList.add(new Mammal (2, 13, 320, "horse", 400, false, false, 15, false, 100, "running on the fields"));
        mammalList.add(new Mammal (2, 13, 50, "Dog", 50, false, true, 5, false, 30, "Playing fetch"));
        mammalList.add(new Mammal (2, 20, 1000, "Tiger", 200, false, true, 20, false, 99, "sleeping"));
    }
    
    //Methods
    public static String getTime()
    {
        Date dato = new Date();
        String time = dato.toString();
        return time;
    }
    public ArrayList<Animal> getAnimals( int valg)
    {
        switch(valg) {
            case 1: 
                return aquaticList;
            case 2:
                return reptileList;
            case 3:
                return mammalList;
            case 4:
                return birdList;
            
        } 
        return null;
    }

    
    public void addtobasket(String dyr, int pris, int antal) 
    {
        try{
            basket.add(new Basket(dyr, pris, antal));
        }
        catch(ArithmeticException ex){
            System.out.println("Cant do that");
        }
    }
    
    public void resetBasket()
    {
            // Nulstille kurv
    }
    
 
}  