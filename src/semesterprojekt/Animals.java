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
public class Animals 
{
        private int yearsOld;
	private int expectedLifeAge;
	private String species;
	private int weight;
	private boolean isAlive;
	
	public Animals( int yearsOld, int expectedLifeAge, String species, int weight)
	{
            this.yearsOld = yearsOld;
            this.expectedLifeAge = expectedLifeAge;
            this.species = species;
            this.weight = weight;
            isAlive = true;
	}
	
	public boolean getIsAlive()
	{
            return isAlive;
	}
	
	public void birthday()
	{
            yearsOld++;

            System.out.println("Congratiulations on your " + yearsOld + " birthday");
            if (yearsOld >= expectedLifeAge)
                die();
	}
	
	private void die()
	{
            isAlive = false;
            System.out.println("Animal died: " + toString());
	}
	
	public String toString()
	{
            return "Animal: " + species + " - Years of age: "+ yearsOld + " Years old" + " - Expected Age of Death: " + expectedLifeAge + " - Weight: " + weight + "Kg.";
	}
}
