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
public class Semesterprojekt 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Display display = new Display();
        Overview overview = new Overview();
        GUI gui = new GUI();
        gui.display = display;
        gui.initialize();
        JFrame vindue = new JFrame("Pet shop");
        vindue.add(gui);
        vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vindue.setSize(1000, 700);
        vindue.setVisible(true);
        
        
//        Carnivore tiger = new Carnivore(3, 30, "Tiger", 50, 10);
//	while (tiger.getIsAlive())
//	{
//            System.out.println(tiger);
//            tiger.birthday();
//	}
    }
    
}
