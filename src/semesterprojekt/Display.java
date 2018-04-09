/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semesterprojekt;

import java.util.Date;

/**
 *
 * @author Squid
 */
public class Display 
{
    
    public String getTime()
    {
        Date dato = new Date();
        String time = dato.toString();
        return time;
    }
    
}
