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
//    Display display;

    /**
     * Creates new form GUI
     */
    public GUI() 
    {
        ArrayList<Aquatic> aquatic;
        aquatic = new ArrayList<>();
        aquatic.add(new Aquatic(1, 3, 50, "Goldfish", 10, true, false, 50, true, 5));
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
        
        public void setTotalPrice(int totPrice)
        {
            kvittering1.setTotalPrice(totPrice);
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
        Overview.makeAnimals();
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
    Aquatic goldfish = new Aquatic (1, 3, 50, "Goldfish", 10, true, false, 50, true, 5);
    if (AquaticDisplay.button == true)
    {
        if ("Goldfish".equals(getSelectAnimal1()))
        {
            setTotalPrice(Kvittering.totPrice + goldfish.getPrice()*getAntal1());
            System.out.println("You added" + getSelectAnimal1() + ". New total price is:" + Kvittering.totPrice+goldfish.getPrice()*getAntal1());
        }
        
        AquaticDisplay.button = false;
    }
}

public static void makeAnimals()
{
//     public Aquatic(int yearsOld, int expectedLifeAge, int price, String species, int adultSize, boolean isHerbivore, boolean isCarnivore, int aquariumSize, boolean isALoner, int eatingHabbits)
    Aquatic goldfish = new Aquatic (1, 3, 50, "Goldfish", 10, true, false, 50, true, 5);
    Aquatic whale = new Aquatic (5, 30, 500000, "Whale", 500, true, true, 50000000, true, 99999);
    Aquatic shark = new Aquatic (3, 30, 999999, "Shark", 5000, false, true, 500000, true, 9999);
    Aquatic seacucumber = new Aquatic (1, 3, 50, "Sea Cucumber", 10, true, false, 50, true, 5);
    Aquatic dolphin = new Aquatic (3, 30, 999999, "Dolphin", 5000, false, true, 500000, false, 9999);

    Bird dove = new Bird (1, 5, 100, "Dove", 50, true, true, 500, false, 500);
    Bird pigeon = new Bird (1, 5, 100, "Pigeon", 50, true, true, 500, false, 500);
    Bird smallBird = new Bird (1, 5, 100, "small", 50, true, true, 500, false, 500);
    Bird bigBird = new Bird (1, 10, 200, "large", 100, false, true, 50000, true, 1000);

    Reptile snake = new Reptile (2, 50, 500, "Snake", 100, false, true, 500, true, 500);
    Reptile turtle = new Reptile (7, 75, 1000, "Turtle", 75, true, true, 500, true, 100);
    Reptile salamander = new Reptile (2, 30, 500, "Salamander", 50, false, true, 500, true, 200);
    Reptile dinosaur = new Reptile (5000000, -4900100, 999999, "Dinosaur", 5000, false, true, 999999, true, 99999);
    Reptile dragon = new Reptile (3000, 10000, 999999, "Dragon", 999999, false, true, 9999999, true, 99999);

    Mammal ape = new Mammal (2, 13, 50, "Ape", 50, true, true, 5, false, 50, "Likes to climb");
    Mammal elephant = new Mammal (2, 23, 500, "Elephant", 500, true, false, 50, false, 999, "Eating");
    Mammal horse = new Mammal (2, 13, 320, "horse", 400, false, false, 15, false, 100, "running on the fields");
    Mammal dog = new Mammal (2, 13, 50, "Dog", 50, false, true, 5, false, 30, "Playing fetch");
    Mammal tiger = new Mammal (2, 20, 1000, "Tiger", 200, false, true, 20, false, 99, "sleeping");
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

