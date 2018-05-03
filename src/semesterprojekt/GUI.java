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
    TestData overview;
    Receipt receipt = new Receipt();
    Animal animal;

    public GUI() 
    {
        initComponents();
        paneDisplay1.setnavneAquatic(null);
        paneDisplay2.setnavneReptile(null);
        paneDisplay3.setnavneMammal(null);
        paneDisplay4.setnavneBird(null);
    }
    //Get and set method
    // PaneDisplay G/S method
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
        
        public int getSelectIndex1(){
        return paneDisplay1.getSelectedIndex();
        }
        public int getSelectIndex2(){
            return paneDisplay2.getSelectedIndex();
        }
        public int getSelectIndex3(){
            return paneDisplay3.getSelectedIndex();
        }
        public int getSelectIndex4(){
            return paneDisplay4.getSelectedIndex();
        }
        
        public boolean getButton1()
        {
            return paneDisplay1.getButton();
        }
        
        public boolean getButton2()
        {
            return paneDisplay2.getButton();
        }
        
        public boolean getButton3()
        {
            return paneDisplay3.getButton();
        }
        
        public boolean getButton4()
        {
            return paneDisplay4.getButton();
        }
        
        public boolean getButton()
        {
            return PaneDisplay.button;
        }
        
        // Muligvis muligt at gøre det samme for getButton funktionerne.
        public void setButton()
        {
            PaneDisplay.button = false;
        }
        
    // Receipt G/S method
        public void setTotalPrice(int totPrice)
        {
            receipt1.setTotalPrice(totPrice);
        }        
        public void refresh()
        {
            receipt1.receitRefresh();
        }

        public void setTotal(int a)
        {
            receipt1.setTotal(a);
        }
        
//        public void updateBasketWindow()
//        {
//            receipt1.updateKurv();
//        }

        // GUI method
        
        void initialize()
        {
            System.out.println("Initialize "+receipt1);
            receipt1.initialize();
        }

        public int selectedPane()
        {
            return Pane.getSelectedIndex();
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
        shopName = new javax.swing.JLabel();
        Pane = new javax.swing.JTabbedPane();
        paneDisplay1 = new semesterprojekt.PaneDisplay();
        paneDisplay2 = new semesterprojekt.PaneDisplay();
        paneDisplay3 = new semesterprojekt.PaneDisplay();
        paneDisplay4 = new semesterprojekt.PaneDisplay();
        receipt1 = new semesterprojekt.Receipt();

        jButton1.setText("jButton1");

        jLabel1.setText("jLabel1");

        shopName.setText("Pet Shop");

        Pane.addTab("Aquatic", paneDisplay1);
        Pane.addTab("Reptile", paneDisplay2);
        Pane.addTab("Mammal", paneDisplay3);
        Pane.addTab("Bird", paneDisplay4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(shopName)
                    .addComponent(receipt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pane, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(shopName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pane, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(receipt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Pane;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private semesterprojekt.PaneDisplay paneDisplay1;
    private semesterprojekt.PaneDisplay paneDisplay2;
    private semesterprojekt.PaneDisplay paneDisplay3;
    private semesterprojekt.PaneDisplay paneDisplay4;
    private semesterprojekt.Receipt receipt1;
    private javax.swing.JLabel shopName;
    // End of variables declaration//GEN-END:variables
}


