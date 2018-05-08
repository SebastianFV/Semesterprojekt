/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterprojekt;

import org.junit.Test;
import static org.junit.Assert.*;

/*
 * @author Nicho
 */
public class DyreshopTest {
    
    @Test
    public void test_oprettelse(){
        Dyreshop dyr = new Dyreshop();
        assertEquals(5, dyr.aquaticList.size());
        assertEquals(5, dyr.reptileList.size());
        assertEquals(4, dyr.birdList.size());
        assertEquals(5, dyr.mammalList.size());
    }
    
    public void test_addToBasket(){
        Dyreshop dyr = new Dyreshop();
        assertEquals(0, dyr.basket.size());
        dyr.addtobasket("testmus", 2, 2);
        assertEquals(1, dyr.basket.size());       
    }
    
    
}
