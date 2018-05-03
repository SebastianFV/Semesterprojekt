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
        TestData overview = new TestData();
//        Overview.makeAnimals();
        Dyreshop dyreshop = new Dyreshop();
        GUI gui = new GUI();
        gui.initialize();
        JFrame vindue = new JFrame("Pet shop");
        vindue.add(gui);
        vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vindue.setSize(550, 600);
        vindue.setVisible(true);
        overview.makeTestData();
        while (gui.isShowing())
        {
//            System.out.println(gui.selectedPane());
            switch(gui.selectedPane())
            {
                case 0:
                {
                    if (gui.getButton() == true)
                    {
                        gui.setTotal(overview.aquaticList.get(gui.getSelectIndex1()).getPrice() * gui.getAntal1());
                        System.out.println(gui.getSelectAnimal1());
                    }
                }
                case 1: 
                {
                    if (gui.getButton2() == true)
                    {
                        gui.setTotal(overview.reptileList.get(gui.getSelectIndex2()).getPrice() * gui.getAntal2());
                        System.out.println(gui.getSelectAnimal2());
                    }   
                }
                case 2: 
                {
                    if (gui.getButton3() == true)
                    {
                        gui.setTotal(overview.mammalList.get(gui.getSelectIndex3()).getPrice() * gui.getAntal3());
                        System.out.println(gui.getSelectAnimal3());
                    }
                }
                case 3: 
                {
                    if (gui.getButton4() == true)
                    {
                        gui.setTotal(overview.birdList.get(gui.getSelectIndex4()).getPrice() * gui.getAntal4());
                        System.out.println(gui.getSelectAnimal4());
                    }
                }
                gui.setButton();
            }
        }
    }
//              Thread.sleep(1000);
//              gui.refresh();
//              gui.printSelect();
}