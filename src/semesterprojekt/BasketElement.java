
package semesterprojekt;

public class BasketElement {
    String dyr;
    int pris;
    int antal;


    BasketElement(String dyr, int pris, int antal) 
    {
        this.dyr = dyr;
        this.pris = pris;
        this.antal = antal;
    }
    
    public String getDyr() 
    {
        return dyr;
    }
    
    public int getPris() 
    {
        return pris;
    }
        
    public int getAntal() 
    {
        return antal;
    }
}

  