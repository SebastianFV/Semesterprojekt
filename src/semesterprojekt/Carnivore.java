/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterprojekt;

/**
 *
 * @author Squid
 */
public class Carnivore extends Animals
{
    private int dailyMeatEaten; 
    public Carnivore(int yearsOld, int expectedLifeAge, String species, int weight, int dailyMeatEaten) 
    {
            super(yearsOld, expectedLifeAge, species, weight);

            this.dailyMeatEaten = dailyMeatEaten;
    }
    
    public String toString()
    {
            return super.toString() + " Amount of daily meat: " + dailyMeatEaten + "Kg";
    }	
}
