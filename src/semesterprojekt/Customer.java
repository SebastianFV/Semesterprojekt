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
public class Customer {
    Animal animal;
    Reptile reptile;
    Aquatic aquatic;
    Bird bird;
    Mammal mammal;
    public int price;
    public int antal;
    public int ID = 10000;
    
    public Customer(int price, int antal, int ID)
    {
        this.price = price;
        this.antal = antal;
        this.ID = ID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
