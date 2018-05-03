/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterprojekt;

import java.util.ArrayList;
/**
 *
 * @author Squid
 */
public class GUI extends javax.swing.JPanel 
{
    Receipt receipt;
    Basket basket = new Basket();
    Overview animals = new Overview();

    public GUI() 
    {
//        ArrayList<Aquatic> aquatic;
//        aquatic = new ArrayList<>();
//        aquatic.add(new Aquatic(1, 3, 50, "Goldfish", 10, true, false, 50, true, 5));
        
        initComponents();
        paneDisplay1.setnavneAquatic(null);
        paneDisplay2.setnavneReptile(null);
        paneDisplay3.setnavneMammal(null);
        paneDisplay4.setnavneBird(null);
    }
        public int getAntal1(){
            return (Integer) paneDisplay1.getAntal();
        }
        public int getAntal2(){
            return (Integer) paneDisplay2.getAntal();
        }
        public int getAntal3(){
            return (Integer) paneDisplay3.getAntal();
        }
        public int getAntal4(){
            return (Integer) paneDisplay4.getAntal();
        }
        
        public void setTotalPrice(int totPrice)
        {
            kvittering1.setTotalPrice(totPrice);
        }
        
        public String getSelectAnimal1(){
            return paneDisplay1.getSelectAnimal();
        }
        public String getSelectAnimal2(){
            return paneDisplay2.getSelectAnimal();
        }
        public String getSelectAnimal3(){
            return paneDisplay3.getSelectAnimal();
        }
        public String getSelectAnimal4(){
            return paneDisplay4.getSelectAnimal();
        }
        
        public void printSelect(){
            System.out.println(getAntal1());
            System.out.println(getSelectAnimal1());
            System.out.println(getSelectAnimal2());
        }
    void initialize()
    {
//        date.setText("Date: " + Dyreshop.getTime());
        System.out.println("Initialize "+kvittering1);
        kvittering1.initialize();
    }
    
    public void refresh()
    {
        kvittering1.receitRefresh();
        getAnimalx();
    }
public void getAnimalx()
{
//    Overview.makeAnimals();
//    Aquatic goldfish = new Aquatic (1, 3, 50, "Goldfish", 10, true, false, 50, true, 5);
    if (PaneDisplay.button == true)
    {
        if ("Goldfish".equals(getSelectAnimal1()))
        {
            setTotalPrice(Receipt.totPrice + animals.goldfish.getPrice()*getAntal1());
            System.out.println("You added a " + getSelectAnimal1() + ". New total price is:" + Receipt.totPrice);
//            receipt.updateBasket("Goldfish");
            
            basket.addCos(animals.goldfish);
        }
        PaneDisplay.button = false;
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        brugesIkke = new semesterprojekt.Receipt();
        shopName = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        paneDisplay1 = new semesterprojekt.PaneDisplay();
        paneDisplay2 = new semesterprojekt.PaneDisplay();
        paneDisplay3 = new semesterprojekt.PaneDisplay();
        paneDisplay4 = new semesterprojekt.PaneDisplay();
        kvittering1 = new semesterprojekt.Receipt();

        jButton1.setText("jButton1");

        jLabel1.setText("jLabel1");

        shopName.setText("Pet Shop");

        jTabbedPane2.addTab("Aquatic", paneDisplay1);
        jTabbedPane2.addTab("Reptile", paneDisplay2);
        jTabbedPane2.addTab("Mammal", paneDisplay3);
        jTabbedPane2.addTab("Bird", paneDisplay4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(shopName)
                            .addComponent(kvittering1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(shopName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kvittering1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private semesterprojekt.Receipt brugesIkke;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private semesterprojekt.Receipt kvittering1;
    private semesterprojekt.PaneDisplay paneDisplay1;
    private semesterprojekt.PaneDisplay paneDisplay2;
    private semesterprojekt.PaneDisplay paneDisplay3;
    private semesterprojekt.PaneDisplay paneDisplay4;
    private javax.swing.JLabel shopName;
    // End of variables declaration//GEN-END:variables
}

