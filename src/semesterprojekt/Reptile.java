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
public class Reptile extends Animal
{
    int terrariumSize;
    int eatingHabbits;
    public Reptile(int yearsOld, int expectedLifeAge, int price, String species, int adultSize, boolean isHerbivore, boolean isCarnivore, int terrariumSize, boolean isALoner, int eatingHabbits)
    {
        super(yearsOld, expectedLifeAge, price, species, adultSize, isALoner, isHerbivore, isCarnivore, isALoner);
        this.terrariumSize = terrariumSize;
        this.eatingHabbits = eatingHabbits;
    }
    //get and set method
    public int getTerrariumSize() {
        return terrariumSize;
    }

    public void setTerrariumSize(int terrariumSize) {
        this.terrariumSize = terrariumSize;
    }

    public int getEatingHabbits() {
        return eatingHabbits;
    }

    public void setEatingHabbits(int eatingHabbits) {
        this.eatingHabbits = eatingHabbits;
    }   
//    public String toString()
//    {
//        return super.toString() + "Size of Terrarium: " + terrariumSize;
//    }
    
}
