/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterprojekt;

import javax.swing.DefaultListModel;

/**
 *
 * @author Nicho
 */
public class Receipt extends javax.swing.JPanel 
{   
    TestData overview;
    Dyreshop dyreshop;
    GUI gui;
    int ID = 1000000;
    public int totPrice = 0;
    
    public Receipt() 
    {
        initComponents();
        Dyreshop.setID();
    }
    

    
    void initialize()
    {
        System.out.println("semesterprojekt.Receipt.initialize()");
        costumerID.setText("No:" + Dyreshop.ID);
        totPrice = 0;
    }
    
    public void receitRefresh()
    {
        date.setText("Date: " + Dyreshop.getTime());
    }

    
    public void updateBasket(String animal)
    {
        receiptBasket.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { animal };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
    }
    
    public void setTotalPrice(int price)
    {
        totPrice = totPrice + price;
        totalPrice.setText("Total price:" + totPrice);
    }
    
    public int getTotalPrice()
    {
        return totPrice;
    }
    
    public void updateKurv() 
    {
    DefaultListModel listModel = new DefaultListModel();
    for( int i = 0; i < dyreshop.kunder.size(); i++) {
        listModel.addElement(String.format("%d%s%s%s%d%s%.2f%s"
                , dyreshop.kunder.get(i).getAntal() 
                , " stk    " 
                , dyreshop.kunder.get(i).getSpecies() 
                , "      "
                , dyreshop.kunder.get(i).getPrice()
                , " kr."));
    }
//    kunder.setModel(listModel);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Petshop2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Petshop1 = new javax.swing.JLabel();
        CVR = new javax.swing.JLabel();
        Istedgade = new javax.swing.JLabel();
        adresse = new javax.swing.JLabel();
        tlf = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        costumerID = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        totalAntalDyr = new javax.swing.JLabel();
        inDkk = new javax.swing.JLabel();
        totalPrice = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        thanksForVisiting = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        receiptBasket = new javax.swing.JList<>();

        Petshop2.setText("Pet Shop");

        jLabel17.setText("CVR: 394xx17");

        jLabel18.setText("Istedgade 89");

        jLabel19.setText("1650 København V");

        jLabel20.setText("Tlf: +45 45 45 xx 45");

        jLabel21.setText("Date:");

        jLabel22.setText("jLabel6");

        jLabel23.setText("No:");

        jLabel24.setText("(insert number?)");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Petshop2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(107, 107, 107)
                                .addComponent(jLabel22)
                                .addGap(75, 75, 75)
                                .addComponent(jLabel23)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel24))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(jLabel18))
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(385, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Petshop2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(10, 10, 10)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        Petshop1.setText("Pet Shop");

        CVR.setText("CVR: 394xx17");

        Istedgade.setText("Istedgade 89");

        adresse.setText("1650 København V");

        tlf.setText("Tlf: +45 45 45 xx 45");

        costumerID.setText("No:");

        totalAntalDyr.setText("Total");

        inDkk.setText("In DKK");

        totalPrice.setText("Total price:");

        thanksForVisiting.setText("Thansk for visiting, see you soon");

        date.setText("Date: ");

        receiptBasket.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(receiptBasket);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(152, 152, 152)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Petshop1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CVR, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(131, 131, 131)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tlf)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(Istedgade))
                                    .addComponent(adresse, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(totalAntalDyr)
                                    .addGap(68, 68, 68)
                                    .addComponent(inDkk)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 168, Short.MAX_VALUE)
                                    .addComponent(totalPrice))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(date)
                                    .addGap(212, 212, 212)
                                    .addComponent(costumerID))
                                .addComponent(jSeparator4)
                                .addComponent(jSeparator2)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(thanksForVisiting)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Petshop1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CVR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Istedgade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adresse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tlf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costumerID)
                    .addComponent(date))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalAntalDyr)
                    .addComponent(inDkk)
                    .addComponent(totalPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thanksForVisiting)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CVR;
    private javax.swing.JLabel Istedgade;
    private javax.swing.JLabel Petshop1;
    private javax.swing.JLabel Petshop2;
    private javax.swing.JLabel adresse;
    private javax.swing.JLabel costumerID;
    private javax.swing.JLabel date;
    private javax.swing.JLabel inDkk;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JList<String> receiptBasket;
    private javax.swing.JLabel thanksForVisiting;
    private javax.swing.JLabel tlf;
    private javax.swing.JLabel totalAntalDyr;
    private javax.swing.JLabel totalPrice;
    // End of variables declaration//GEN-END:variables
}
