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
        Antal.setText("" + animals.getAntal());
    }
    public int getAntal(){
        value = Integer.parseInt(Antal.getText());
        return value;
    }
    public void tilføjTilKurv(){
        
    }

    public int getSelectAnimal(){
        item = choice1.getSelectedIndex();
        return item;
    }

    public void printSelect(){
        System.out.println(getSelectAnimal());
        System.out.println(getSelectAnimal2());
        System.out.println(getAntal());
    }
    
    public String getSelectAnimal2(){
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
        Antal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        animalPrice = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        Antal.setText("0");
        Antal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AntalActionPerformed(evt);
            }
        });

        jLabel1.setText("Antal");

        jLabel2.setText("pris");

        animalPrice.setText("0");

        jLabel4.setText("Tilføj til kurv");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Antal, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(animalPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Antal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(animalPrice)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton1))
                .addContainerGap(184, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AntalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AntalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AntalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Antal;
    private javax.swing.JLabel animalPrice;
    private java.awt.Choice choice1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
