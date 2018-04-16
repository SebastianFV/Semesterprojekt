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
public class Mammal extends Animals
{
    String activity;
    int sizeOfLitter;
    public Mammal(int yearsOld, int expectedLifeAge, int price, String species, int adultSize, boolean isHerbivore, boolean isCarnivore, int sizeOfLitter, boolean isALoner, int eatingHabbits, String activity)
    {
        super(yearsOld, expectedLifeAge, price, species, adultSize, isALoner, isHerbivore, isCarnivore, isALoner);
        this.activity = activity;
        this.sizeOfLitter = sizeOfLitter;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getSizeOfLitter() {
        return sizeOfLitter;
    }

    public void setSizeOfLitter(int sizeOfLitter) {
        this.sizeOfLitter = sizeOfLitter;
    }

    public String toString()
    {
        return super.toString() + "Amount of children: " + sizeOfLitter + "Activity for the pet: " + activity;
    }    
    
}
