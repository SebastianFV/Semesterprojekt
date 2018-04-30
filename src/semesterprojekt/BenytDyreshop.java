/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterprojekt;

import javax.swing.JFrame;
/**
 *
 * @author Squid
 */
public class BenytDyreshop 
{
    Reptile reptile;
    Aquatic aquatic;
    Bird bird;
    Mammal mammal;
    Animals animals;
    static int finalPrice;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException 
    {
        
        AquaticDisplay aquaticDisplay = new AquaticDisplay();
        Overview overview = new Overview();
        Overview.makeAnimals();
        GUI gui = new GUI();
        gui.initialize();
        JFrame vindue = new JFrame("Pet shop");
        vindue.add(gui);
        vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vindue.setSize(700, 700);
        vindue.setVisible(true);
        System.out.println("Hello world");
        
        while (gui.isShowing())
        {
            System.out.println();
            System.out.println();
              Thread.sleep(1000);
              gui.refresh();
              gui.printSelect();
//              gui.getAnimalx();
        }
    }
    
}
