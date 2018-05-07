/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterprojekt;
import java.util.ArrayList;
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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException 
    {
        Dyreshop dyreshop = new Dyreshop();
        GUI gui = new GUI();
        gui.initialize(dyreshop);
        JFrame vindue = new JFrame("Pet shop");
        vindue.add(gui);
        vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vindue.setSize(550, 600);
        vindue.setVisible(true);
//        overview.makeTestData();
        while (gui.isShowing())
        {
            gui.refresh();
        }
    }
//              Thread.sleep(1000);
//              gui.refresh();
//              gui.printSelect();
}