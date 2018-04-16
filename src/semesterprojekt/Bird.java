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
public class Bird extends Animals
{
    int birdCage;
    public Bird(int yearsOld, int expectedLifeAge, int price, String species, int adultSize, boolean isHerbivore, boolean isCarnivore, int birdCage, boolean isALoner, int eatingHabbits)
    {
        super(yearsOld, expectedLifeAge, price, species, adultSize, isALoner, isHerbivore, isCarnivore, isALoner);
        this.birdCage = birdCage;
    }

    public int getBirdCage() {
        return birdCage;
    }

    public void setBirdCage(int birdCage) {
        this.birdCage = birdCage;
    }

    public String toString()
    {
        return super.toString() + "Size of bird cage: " + birdCage;
    }    
    
}
