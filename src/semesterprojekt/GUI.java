/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterprojekt;
/**
 *
 * @author Squid
 */
public class GUI extends javax.swing.JPanel 
{
//    Display display;

    /**
     * Creates new form GUI
     */
    public GUI() 
    {
        initComponents();
        aquaticDisplay1.sætnavneAquatic(null);
        aquaticDisplay2.sætnavneReptile(null);
        aquaticDisplay3.sætnavneMammal(null);
        aquaticDisplay4.sætnavneBird(null);
    }
        public int getAntal1(){
            return (Integer) aquaticDisplay1.getAntal();
        }
        public int getAntal2(){
            return (Integer) aquaticDisplay2.getAntal();
        }
        public int getAntal3(){
            return (Integer) aquaticDisplay3.getAntal();
        }
        public int getAntal4(){
            return (Integer) aquaticDisplay4.getAntal();
        }
        
        public String getSelectAnimal1(){
            return aquaticDisplay1.getSelectAnimal();
        }
        public String getSelectAnimal2(){
            return aquaticDisplay2.getSelectAnimal();
        }
        public String getSelectAnimal3(){
            return aquaticDisplay3.getSelectAnimal();
        }
        public String getSelectAnimal4(){
            return aquaticDisplay4.getSelectAnimal();
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
        brugesIkke = new semesterprojekt.Kvittering();
        shopName = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        aquaticDisplay1 = new semesterprojekt.AquaticDisplay();
        aquaticDisplay2 = new semesterprojekt.AquaticDisplay();
        aquaticDisplay3 = new semesterprojekt.AquaticDisplay();
        aquaticDisplay4 = new semesterprojekt.AquaticDisplay();
        kvittering1 = new semesterprojekt.Kvittering();

        jButton1.setText("jButton1");

        jLabel1.setText("jLabel1");

        shopName.setText("Pet Shop");

        jTabbedPane2.addTab("Aquatic", aquaticDisplay1);
        jTabbedPane2.addTab("Reptile", aquaticDisplay2);
        jTabbedPane2.addTab("Mammal", aquaticDisplay3);
        jTabbedPane2.addTab("Bird", aquaticDisplay4);

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
    private semesterprojekt.AquaticDisplay aquaticDisplay1;
    private semesterprojekt.AquaticDisplay aquaticDisplay2;
    private semesterprojekt.AquaticDisplay aquaticDisplay3;
    private semesterprojekt.AquaticDisplay aquaticDisplay4;
    private semesterprojekt.Kvittering brugesIkke;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private semesterprojekt.Kvittering kvittering1;
    private javax.swing.JLabel shopName;
    // End of variables declaration//GEN-END:variables
}
