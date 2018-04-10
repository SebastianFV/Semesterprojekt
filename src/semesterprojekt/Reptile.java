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
public class Reptile extends Animals
{
    int terrariumSize;
    int eatingHabbits;
    public Reptile(int yearsOld, int expectedLifeAge, String species, int adultSize, boolean isHerbivore, boolean isCarnivore, int terrariumSize, boolean isALoner, int eatingHabbits)
    {
        super(yearsOld, expectedLifeAge, species, adultSize, isALoner, isHerbivore, isCarnivore, isALoner);
        this.terrariumSize = terrariumSize;
        this.eatingHabbits = eatingHabbits;
    }
    
    public String toString()
    {
        return super.toString() + "Size of Terrarium: " + terrariumSize;
    }
    
}
