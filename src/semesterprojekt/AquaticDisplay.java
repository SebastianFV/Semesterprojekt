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
public class AquaticDisplay extends javax.swing.JPanel {
    
    Reptile reptile;
    Aquatic aquatic;
    Bird bird;
    Mammal mammal;
    Animals animals;
    int value;
    int item;
    public static boolean button;
    String dyr;
    

    public AquaticDisplay() {
        initComponents();
    }
    
    public void sætnavneAquatic(ArrayList<String> nn) {
        choice1.removeAll();
        choice1.addItem("Goldfish");
        choice1.addItem("Whale");
        choice1.addItem("Shark");
        choice1.addItem("Dolphin");
        choice1.addItem("Sea cucumber");
    }
    public void sætnavneBird(ArrayList<String> nn) {
        choice1.removeAll();
        choice1.addItem("Dove");
        choice1.addItem("Pidgeon");
        choice1.addItem("Small bird");
        choice1.addItem("Big bird");
    }
    public void sætnavneMammal(ArrayList<String> nn) {
        choice1.removeAll();
        choice1.addItem("Ape");
        choice1.addItem("Elephant");
        choice1.addItem("Horse");
        choice1.addItem("Dog");
        choice1.addItem("Tiger");
    }
    public void sætnavneReptile(ArrayList<String> nn) {
        choice1.removeAll();
        choice1.addItem("Snake");
        choice1.addItem("Turtle");
        choice1.addItem("Salamander");
        choice1.addItem("Dinosaur");
        choice1.addItem("Dragon");
    }
    
    public void getPrice (){
        animalPrice.setText("" + animals.getPrice());
    }
    
    public void setAntal(){
        Antal.setValue("" + animals.getAntal());
    }
    
    public int getAntal(){
        value = (Integer) Antal.getValue();
        return value;
    }
//    public boolean buttonPress()
//    {
//
//    }
    public void tilføjTilKurv(){
        
    }
    
    public String getSelectAnimal(){
        dyr = choice1.getSelectedItem();
        return dyr;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choice1 = new java.awt.Choice();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        animalPrice = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        OKBotton = new javax.swing.JButton();
        Antal = new javax.swing.JSpinner();

        jLabel1.setText("Antal");

        jLabel2.setText("pris");

        animalPrice.setText("0");

        jLabel4.setText("Tilføj til kurv");

        OKBotton.setText("OK");
        OKBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKBottonActionPerformed(evt);
            }
        });

        Antal.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OKBotton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(animalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Antal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(Antal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(animalPrice)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(OKBotton))
                .addContainerGap(185, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void OKBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKBottonActionPerformed

            button = true;
    }//GEN-LAST:event_OKBottonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Antal;
    private javax.swing.JButton OKBotton;
    private javax.swing.JLabel animalPrice;
    private java.awt.Choice choice1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
