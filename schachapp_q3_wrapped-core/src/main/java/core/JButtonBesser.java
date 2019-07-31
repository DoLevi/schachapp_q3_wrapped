package core;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 11/25/2015
  * @author 
  */

public class JButtonBesser extends JButton {
  
  // Anfang Attribute
  int[] koordinaten = new int[2]; 
  // Ende Attribute
  
  // Anfang Methoden 
  public int zdftogui(String wort, int a) {                                     // [ZDF]Koordianten --> [GUI]Koordinaten
    int b = 0; 
    if (wort.equals("x")) {
      b = 216 + 40 * a; 
    } // end of if
    if (wort.equals("y")) {
      b = 112 + 40 * a; 
    } // end of if
    return b; 
  }
  
  public int[] xyKnopf() {                                         // GUI Koordinaten in ZDF-Sprache, | x | y |
    int[] wurst = new int[2]; 
    int x = 0; int y = 0; 
    int a = this.getX() - 216;
    for (int i = 0; a >= 40; a -= 40) {                    
      i++; 
      x = i;                               // x ist nun x-Koordinate des Knopfes
    } // end of for
    int b = this.getY() - 112;   
    for (int i = 0; b >= 40; b -= 40) {                    
      i++; 
      y = i;                               // y ist nun y-Koordinate des Knopfes
    } // end of for                                                     
    wurst[0] = x; 
    wurst[1] = y; 
    return wurst;
  }
  
  public void bewegungGUIZDF(String[][] feld, int x, int y) {                     // x,y ^= [ZDF]Koordinaten
    int xAlt = this.xyKnopf()[0];            // GUI Koordinaten
    int yAlt = this.xyKnopf()[1];            // GUI Koordinaten 
    feld[xAlt][yAlt] = null;         
    feld[x][y] = this.getName(); 
    this.setBounds(this.zdftogui("x", x), this.zdftogui("y", y), this.getWidth(), this.getHeight());  
    this.setToolTipText("" + xAlt + " " + yAlt); 
    
    
  }
  
  public int setCount(JFrame rahmen) {
    int bitte0 = 0; 
    for (int i = 0; i < rahmen.getContentPane().getComponentCount(); i++) {         // bitte ^= Komponentencount vom wTurm1
      if (rahmen.getContentPane().getComponent(i).equals(this)) {   
        bitte0 = i;         
        i = rahmen.getContentPane().getComponentCount();
      } // end of if
    } // end of for
    return bitte0; 
  }
  
  // Ende Methoden
} // end of JButton
