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
public class Aquatic extends Animal
{
    int aquariumSize;
    public Aquatic(int yearsOld, int expectedLifeAge, int price, String species, int adultSize, boolean isHerbivore, boolean isCarnivore, int aquariumSize, boolean isALoner, int eatingHabbits)
    {
        super(yearsOld, expectedLifeAge, price, species, adultSize, isALoner, isHerbivore, isCarnivore, isALoner);
        this.aquariumSize = aquariumSize;
    }
    //get and set method
    public int getAquariumSize() {
        return aquariumSize;
    }

    public void setAquariumSize(int aquariumSize) {
        this.aquariumSize = aquariumSize;
    }

//    public String toString()
//    {
//        return super.toString() + "Size of aquarium: " + aquariumSize;
//    }    
}
