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
    Animal animals;
    static int finalPrice;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException 
    {
        Receipt receipt;
        PaneDisplay paneDisplay = new PaneDisplay();
        Overview overview = new Overview();
//        Overview.makeAnimals();
        Dyreshop dyreshop = new Dyreshop();
        GUI gui = new GUI();
        gui.initialize();
        JFrame vindue = new JFrame("Pet shop");
        vindue.add(gui);
        vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vindue.setSize(550, 600);
        vindue.setVisible(true);
        System.out.println("Hello world");
        overview.makeTestData();
        while (gui.isShowing())
        {
            if (PaneDisplay.button == true)
            {
                switch(gui.selectedPane())
                {
                    case 0:
                    {
                        gui.updateTotal(overview.aquaticList.get(gui.getSelectIndex1()).getPrice() * gui.getAntal1());
                        System.out.println(gui.getSelectAnimal1());
                    }
                }
            }
            else
            {
                System.out.println("nothing");
                
            }
        }
    }
//              Thread.sleep(1000);
//              gui.refresh();
//              gui.printSelect();
}