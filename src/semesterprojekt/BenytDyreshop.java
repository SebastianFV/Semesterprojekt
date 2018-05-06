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
        
        int finalPrice = 0;
        int antal = 0;
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
            Customer cus = new Customer(finalPrice, antal, Dyreshop.getID());   // Creating the initial customer object.
            dyreshop.addCos(cus);                                               // Creating a new customer object for the ArrayList.
            while(Payment.payButton != true && gui.isShowing())
            {
                switch(gui.selectedPane())
                {
                    case 0:
                    {
                        if (gui.getButton1() == true)
                        {
                            // Print of each variable in the gui.set below, to make sure it works.
    //                        System.out.println(overview.aquaticList.get(gui.getSelectIndex1()).getPrice());
    //                        System.out.println(gui.getAntal1());
                            finalPrice = finalPrice + overview.aquaticList.get(gui.getSelectIndex1()).getPrice() * gui.getAntal1();
                            gui.setTotal(finalPrice); 
                            antal = antal + gui.getAntal1();
                            System.out.println(gui.getSelectAnimal1());
                            System.out.println("Current pane " + gui.selectedPane());

                        }
                        break;
                    }
                    case 1: 
                    {
                        if (gui.getButton2() == true)
                        {
                            finalPrice = finalPrice + overview.reptileList.get(gui.getSelectIndex2()).getPrice() * gui.getAntal2();
                            gui.setTotal(finalPrice);
                            antal = antal + gui.getAntal1();
                            System.out.println(gui.getSelectAnimal2());
                            System.out.println("Current pane " + gui.selectedPane());
                        }
                        break;
                    }
                    case 2: 
                    {
                        if (gui.getButton3() == true)
                        {
                            finalPrice = finalPrice + overview.mammalList.get(gui.getSelectIndex3()).getPrice() * gui.getAntal3();
                            gui.setTotal(finalPrice);
                            antal = antal + gui.getAntal1();
                            System.out.println(gui.getSelectAnimal3());
                            System.out.println("Current pane " + gui.selectedPane());
                        }
                        break;
                    }
                    case 3: 
                    {
                        if (gui.getButton4() == true)
                        {
                            finalPrice = finalPrice + overview.birdList.get(gui.getSelectIndex4()).getPrice() * gui.getAntal4();
                            gui.setTotal(finalPrice);
                            antal = antal + gui.getAntal1();
                            System.out.println(gui.getSelectAnimal4());
                            System.out.println("Current pane " + gui.selectedPane());
                        }
                        break;
                    }
                    case 4:
                    {
                        // Sætter antal, ID og finalPrice ind i cus-objektet, og nulstiller så disse variable.
                        if(Payment.payButton != true)
                        {
                            cus.antal = antal;
                            cus.ID = Dyreshop.getID();
                            cus.price = finalPrice;
                            antal = 0;
                            finalPrice = 0;
                        }
                        break;
                    } 
                    default:
                        System.out.println("This option should not be possible");
                        break;
                }
                gui.setButton();                                                    // Reset the button to be false, so it doesn't spam true.
                System.out.println(finalPrice);
                System.out.println(antal);
                System.out.println(Dyreshop.getID());
                Thread.sleep(1000);
    //            dyreshop.printList();
//                gui.updateBasketWindow();
//                dyreshop.printLog();     
            }
            Payment.payButton = false;
        }
    }
//              Thread.sleep(1000);
//              gui.refresh();
//              gui.printSelect();
}