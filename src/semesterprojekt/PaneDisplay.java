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
public class PaneDisplay extends javax.swing.JPanel {
    Dyreshop dyreshop;
    GUI ejer;
    int value;
    int item;
    public static boolean button;
    String dyr;
    

    public PaneDisplay() {
        initComponents();
    }
    
    public void initialize(Dyreshop dyreshop, GUI ejer, ArrayList<Animal> nn)
    {
        this.dyreshop = dyreshop;
        this.ejer = ejer;
        setChoice(nn);
        updatePris();
    }
    
    public void updatePris()
    {
        animalPrice.setText("" + dyreshop.aquaticList.get(choice1.getSelectedIndex()).getPrice()*(int) Antal.getValue());
    }
            
    
    public void setChoice(ArrayList<Animal> nn) {
        
        for(int i = 0 ; i < nn.size(); i++) 
        {
            choice1.addItem(nn.get(i).getSpecies());
        }
    }
        
    public int getAntal(){
        value = (Integer) Antal.getValue();
        return value;
    }
    
    public String getSelectAnimal(){
        dyr = choice1.getSelectedItem();
        return dyr;
    }
    
    public int getSelectedIndex()
    {
        return choice1.getSelectedIndex();
    }
    
    public boolean getButton()
    {
        return button;
    }
    
    public void setButton()
    {
        button = false;
    }

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

        choice1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice1ItemStateChanged(evt);
            }
        });

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
        Antal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                AntalStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(Antal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(OKBotton)))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(animalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
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
        dyreshop.addtobasket(choice1.getSelectedItem(), Integer.parseInt(animalPrice.getText()), (int) Antal.getValue());
        ejer.updateBasket();
    }//GEN-LAST:event_OKBottonActionPerformed

    private void choice1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choice1ItemStateChanged
        updatePris();
    }//GEN-LAST:event_choice1ItemStateChanged

    private void AntalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_AntalStateChanged
        updatePris();
    }//GEN-LAST:event_AntalStateChanged


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
