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
    private int adultSize;
    private int price;
    private String species;
    private boolean isAlive;
    private boolean isHerbivore;
    private boolean isCarnivore;
    private boolean isALoner;

    public Animals( int yearsOld, int expectedLifeAge, int price, String species, int adultSize, boolean isAlive, boolean isHerbivore, boolean isCarnivore, boolean isALoner)
    {
        this.yearsOld = yearsOld;
        this.expectedLifeAge = expectedLifeAge;
        this.price = price;
        this.species = species;
        this.adultSize = adultSize;
        this.isAlive = isAlive;
        this.isHerbivore = isHerbivore;
        this.isCarnivore = isCarnivore;
        this.isALoner = isALoner;
    }

    public int getAdultSize() {
        return adultSize;
    }

    public void setAdultSize(int adultSize) {
        this.adultSize = adultSize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isIsALoner() {
        return isALoner;
    }

    public void setIsALoner(boolean isALoner) {
        this.isALoner = isALoner;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public int getExpectedLifeAge() {
        return expectedLifeAge;
    }

    public void setExpectedLifeAge(int expectedLifeAge) {
        this.expectedLifeAge = expectedLifeAge;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getWeight() {
        return adultSize;
    }

    public void setWeight(int weight) {
        this.adultSize = weight;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public boolean isIsHerbivore() {
        return isHerbivore;
    }

    public void setIsHerbivore(boolean isHerbivore) {
        this.isHerbivore = isHerbivore;
    }

    public boolean isIsCarnivore() {
        return isCarnivore;
    }

    public void setIsCarnivore(boolean isCarnivore) {
        this.isCarnivore = isCarnivore;
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
            return "Animal: " + species + " - Years of age: "+ yearsOld + " Years old" + " - Expected Age of Death: " + expectedLifeAge + " - Weight: " + adultSize + "Kg.";
	}
}
