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
    static int finalPrice;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException 
    {
//        Display display = new Display(); 
        
        AquaticDisplay aquaticDisplay = new AquaticDisplay();
        Overview overview = new Overview();
        GUI gui = new GUI();
//        gui.display = display;
        gui.initialize();
        JFrame vindue = new JFrame("Pet shop");
        vindue.add(gui);
        vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vindue.setSize(700, 700);
        vindue.setVisible(true);
        System.out.println("Hello world");
        
<<<<<<< HEAD
//        while (true)
//        {
//            
//        }

=======
        while (gui.isShowing())
        {
              Thread.sleep(1000);
              gui.printSelect();
        }
//        Carnivore tiger = new Carnivore(3, 30, "Tiger", 50, 10);
//	while (tiger.getIsAlive())
//	{
//            System.out.println(tiger);
//            tiger.birthday();
//	}
>>>>>>> 895c637fca3777eb9a117833cd0d3c685b4ad4f5
    }
    
}
