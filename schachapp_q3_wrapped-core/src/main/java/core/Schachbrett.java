package core;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import core.JButtonBesser;
import javax.swing.event.*;
                                                                                                                                                                                                                    
/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 04.11.2015
  * @author 
  */
   // Allen Kn�pfen ein neues .setname() zuweisen; JButtonBesser.bewegungGUIZDF erkennt sonst den namen nicht - lol
   // JButtonBesser_ActionPerformed in [Class]JButtonBesser umsiedeln
public class Schachbrett extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JLabel jLabel2 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JLabel jLabel4 = new JLabel();
  private JLabel jLabel5 = new JLabel();
  private JLabel jLabel6 = new JLabel();
  private JLabel jLabel7 = new JLabel();
  private JLabel jLabel8 = new JLabel();
  private JLabel jLabel9 = new JLabel();
  private JLabel jLabel10 = new JLabel();
  private JLabel jLabel11 = new JLabel();
  private JLabel jLabel12 = new JLabel();
  private JLabel jLabel13 = new JLabel();
  private JLabel jLabel14 = new JLabel();
  private JLabel jLabel15 = new JLabel();
  private JLabel jLabel16 = new JLabel();
  private JLabel jLabel17 = new JLabel();
  private JLabel jLabel18 = new JLabel();
  private JLabel jLabel19 = new JLabel();
  private JLabel jLabel20 = new JLabel();
  private JLabel jLabel21 = new JLabel();
  private JLabel jLabel22 = new JLabel();
  private JLabel jLabel23 = new JLabel();
  private JLabel jLabel24 = new JLabel();
  private JLabel jLabel25 = new JLabel();
  private JLabel jLabel26 = new JLabel();
  private JLabel jLabel27 = new JLabel();
  private JLabel jLabel28 = new JLabel();
  private JLabel jLabel29 = new JLabel();
  private JLabel jLabel30 = new JLabel();
  private JLabel labelC_2 = new JLabel();
  private JLabel labelB_2 = new JLabel();
  private JLabel labelA_2 = new JLabel();
  private JLabel labelD_2 = new JLabel();
  private JLabel labelE_2 = new JLabel();
  private JLabel labelF_2 = new JLabel();
  private JLabel labelG_2 = new JLabel();
  private JLabel labelH_2 = new JLabel();
  private JLabel label8_1 = new JLabel();
  private JLabel label7_1 = new JLabel();
  private JLabel label1_1 = new JLabel();
  private JLabel label5_1 = new JLabel();
  private JLabel label4_1 = new JLabel();
  private JLabel label3_1 = new JLabel();
  private JLabel label2_1 = new JLabel();
  private JLabel label6_1 = new JLabel();
  private JLabel labelC_1 = new JLabel();
  private JLabel labelB_1 = new JLabel();
  private JLabel labelA_1 = new JLabel();
  private JLabel labelD_1 = new JLabel();
  private JLabel labelE_1 = new JLabel();
  private JLabel labelF_1 = new JLabel();
  private JLabel labelG_1 = new JLabel();
  private JLabel labelH_1 = new JLabel();
  private JLabel label8_2 = new JLabel();
  private JLabel label7_2 = new JLabel();
  private JLabel label1_2 = new JLabel();
  private JLabel label5_2 = new JLabel();
  private JLabel label4_2 = new JLabel();
  private JLabel label3_2 = new JLabel();
  private JLabel label2_2 = new JLabel();
  private JLabel label6_2 = new JLabel();
  private JLabel label8_3 = new JLabel();
  private JLabel label8_4 = new JLabel();
  private JLabel label8_5 = new JLabel();
  private JLabel label8_6 = new JLabel();       
  private JButtonBesser wPferd1 = new JButtonBesser();
    private ImageIcon wPferd1Icon = new ImageIcon(getClass().getResource("/images/wPferd.png"));
  private JButtonBesser wTurm1 = new JButtonBesser();
    private ImageIcon wTurm1Icon = new ImageIcon(getClass().getResource("/images/wTurm.png"));
  private JButtonBesser wLaeufer = new JButtonBesser();
    private ImageIcon wLaeuferIcon = new ImageIcon(getClass().getResource("/images/wLaeufer.png"));
  private JButtonBesser wDame = new JButtonBesser();
    private ImageIcon wDameIcon = new ImageIcon(getClass().getResource("/images/wDame.png"));
  private JButtonBesser wPferd2 = new JButtonBesser();
    private ImageIcon wPferd2Icon = new ImageIcon(getClass().getResource("/images/wPferd.png"));
  private JButtonBesser wLaeufer2 = new JButtonBesser();
    private ImageIcon wLaeufer2Icon = new ImageIcon(getClass().getResource("/images/wLaeufer.png"));
  private JButtonBesser wKoenig = new JButtonBesser();
    private ImageIcon wKoenigIcon = new ImageIcon(getClass().getResource("/images/wKoenig.png"));
  private JButtonBesser wTurm2 = new JButtonBesser();
    private ImageIcon wTurm2Icon = new ImageIcon(getClass().getResource("/images/wTurm.png"));
  private JButtonBesser wBauer2 = new JButtonBesser();
    private ImageIcon wBauer2Icon = new ImageIcon(getClass().getResource("/images/wBauer.png"));
  private JButtonBesser wBauer1 = new JButtonBesser();
    private ImageIcon wBauer1Icon = new ImageIcon(getClass().getResource("/images/wBauer.png"));
  private JButtonBesser wBauer3 = new JButtonBesser();
    private ImageIcon wBauer3Icon = new ImageIcon(getClass().getResource("/images/wBauer.png"));
  private JButtonBesser wBauer4 = new JButtonBesser();
    private ImageIcon wBauer4Icon = new ImageIcon(getClass().getResource("/images/wBauer.png"));
  private JButtonBesser wBauer7 = new JButtonBesser();
    private ImageIcon wBauer7Icon = new ImageIcon(getClass().getResource("/images/wBauer.png"));
  private JButtonBesser wBauer6 = new JButtonBesser();
    private ImageIcon wBauer6Icon = new ImageIcon(getClass().getResource("/images/wBauer.png"));
  private JButtonBesser wBauer5 = new JButtonBesser();
    private ImageIcon wBauer5Icon = new ImageIcon(getClass().getResource("/images/wBauer.png"));
  private JButtonBesser wBauer8 = new JButtonBesser();
    private ImageIcon wBauer8Icon = new ImageIcon(getClass().getResource("/images/wBauer.png"));
  private JButtonBesser sBauer2 = new JButtonBesser();
    private ImageIcon sBauer2Icon = new ImageIcon(getClass().getResource("/images/sBauer.png"));
  private JButtonBesser sBauer1 = new JButtonBesser();
    private ImageIcon sBauer1Icon = new ImageIcon(getClass().getResource("/images/sBauer.png"));
  private JButtonBesser sBauer3 = new JButtonBesser();
    private ImageIcon sBauer3Icon = new ImageIcon(getClass().getResource("/images/sBauer.png"));
  private JButtonBesser sBauer4 = new JButtonBesser();
    private ImageIcon sBauer4Icon = new ImageIcon(getClass().getResource("/images/sBauer.png"));
  private JButtonBesser sBauer7 = new JButtonBesser();
    private ImageIcon sBauer7Icon = new ImageIcon(getClass().getResource("/images/sBauer.png"));
  private JButtonBesser sBauer6 = new JButtonBesser();
    private ImageIcon sBauer6Icon = new ImageIcon(getClass().getResource("/images/sBauer.png"));
  private JButtonBesser sBauer5 = new JButtonBesser();
    private ImageIcon sBauer5Icon = new ImageIcon(getClass().getResource("/images/sBauer.png"));
  private JButtonBesser sBauer8 = new JButtonBesser();
    private ImageIcon sBauer8Icon = new ImageIcon(getClass().getResource("/images/sBauer.png"));
  private JButtonBesser sPferd1 = new JButtonBesser();
    private ImageIcon sPferd1Icon = new ImageIcon(getClass().getResource("/images/sPferd.png"));
  private JButtonBesser sTurm1 = new JButtonBesser();
    private ImageIcon sTurm1Icon = new ImageIcon(getClass().getResource("/images/sTurm.png"));
  private JButtonBesser sLaeufer1 = new JButtonBesser();
    private ImageIcon sLaeufer1Icon = new ImageIcon(getClass().getResource("/images/sLaeufer.png"));
  private JButtonBesser sDame = new JButtonBesser();
    private ImageIcon sDameIcon = new ImageIcon(getClass().getResource("/images/sKoenig.png"));
  private JButtonBesser sLaeufer2 = new JButtonBesser();
    private ImageIcon sLaeufer2Icon = new ImageIcon(getClass().getResource("/images/sLaeufer.png"));
  private JButtonBesser sPferd2 = new JButtonBesser();
    private ImageIcon sPferd2Icon = new ImageIcon(getClass().getResource("/images/sPferd.png"));
  private JButtonBesser sKoenig = new JButtonBesser();
    private ImageIcon sKoenigIcon = new ImageIcon(getClass().getResource("/images/sDame.png"));
  private JButtonBesser sTurm2;
  private ImageIcon sTurm2Icon; 
  private JLabel B1 = new JLabel();
  private JLabel C1 = new JLabel();
  private JLabel D1 = new JLabel();
  private JLabel E1 = new JLabel();
  private JLabel F1 = new JLabel();
  private JLabel G1 = new JLabel();
  private JLabel H1 = new JLabel();
  private JLabel A1 = new JLabel();
  private JLabel A2 = new JLabel();
  private JLabel B2 = new JLabel();
  private JLabel C2 = new JLabel();
  private JLabel D2 = new JLabel();
  private JLabel E2 = new JLabel();
  private JLabel F2 = new JLabel();
  private JLabel G2 = new JLabel();
  private JLabel H2 = new JLabel();
  private JLabel A3 = new JLabel();
  private JLabel B3 = new JLabel();
  private JLabel C3 = new JLabel();
  private JLabel D3 = new JLabel();
  private JLabel F3 = new JLabel();
  private JLabel E3 = new JLabel();
  private JLabel G3 = new JLabel();
  private JLabel H3 = new JLabel();
  private JLabel H4 = new JLabel();
  private JLabel G4 = new JLabel();
  private JLabel E4 = new JLabel();
  private JLabel F4 = new JLabel();
  private JLabel D4 = new JLabel();
  private JLabel C4 = new JLabel();
  private JLabel B4 = new JLabel();
  private JLabel A4 = new JLabel();
  private JLabel A5 = new JLabel();
  private JLabel B5 = new JLabel();
  private JLabel C5 = new JLabel();
  private JLabel D5 = new JLabel();
  private JLabel F5 = new JLabel();
  private JLabel E5 = new JLabel();
  private JLabel G5 = new JLabel();
  private JLabel H5 = new JLabel();
  private JLabel H6 = new JLabel();
  private JLabel G6 = new JLabel();
  private JLabel E6 = new JLabel();
  private JLabel F6 = new JLabel();
  private JLabel D6 = new JLabel();
  private JLabel C6 = new JLabel();
  private JLabel B6 = new JLabel();
  private JLabel A6 = new JLabel();
  private JLabel jLabel79 = new JLabel();
  private JLabel jLabel80 = new JLabel();
  private JLabel jLabel81 = new JLabel();
  private JLabel jLabel82 = new JLabel();
  private JLabel jLabel83 = new JLabel();
  private JLabel jLabel84 = new JLabel();
  private JLabel jLabel85 = new JLabel();
  private JLabel jLabel86 = new JLabel();
  private JLabel jLabel87 = new JLabel();
  private JLabel jLabel88 = new JLabel();
  private JLabel jLabel89 = new JLabel();
  private JLabel jLabel90 = new JLabel();
  private JLabel jLabel91 = new JLabel();
  private JLabel jLabel92 = new JLabel();
  private JLabel B7 = new JLabel();
  private JLabel C7 = new JLabel();
  private JLabel D7 = new JLabel();
  private JLabel E7 = new JLabel();
  private JLabel F7 = new JLabel();
  private JLabel G7 = new JLabel();
  private JLabel H7 = new JLabel();
  private JLabel A7 = new JLabel();
  private JLabel A8 = new JLabel();
  private JLabel B8 = new JLabel();
  private JLabel C8 = new JLabel();
  private JLabel D8 = new JLabel();
  private JLabel E8 = new JLabel();
  private JLabel F8 = new JLabel();
  private JLabel G8 = new JLabel();
  private JLabel H8 = new JLabel();
  
    private int[][] bewegen;         // 2-D-Feld, das Zugm�glichkeiten markiert
    private String[][] ZDFeld;       // 2-D-Feld zum einfacheren Arbeiten mit Figureninstanzen
    private int[] friedhof;          // 2-D-Feld f�r Zug-Zuweisung geschlagener Figuren beider Seiten;
    private boolean onGoing = false;
    private boolean wTurn = true;       
    
    int bitte0 = 0; int bitte1 = 0; int bitte2 = 0; int bitte123 = 0; 
  // Ende Attribute
  
  public Schachbrett(String title) { 
    // Frame-Initialisierung
    super(title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 800; 
    int frameHeight = 573;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    
    sTurm2 = new JButtonBesser();
    sTurm2Icon = new ImageIcon(getClass().getResource("/images/sTurm.png"));    
    /* Initialisierung ZDFeld */ 
    ZDFeld = new String[8][8];                                               // Erste Dimension: x-Koordinate
    ZDFeld[0][0] = "wTurm1";                                                   // Zweite Dimension: y-Koordinate
    ZDFeld[1][0] = "wPferd1";                                                   // Dritte Dimension: Falls mehrere Figuren ein Feld besetzen --> F�r's Figurenschlagen
    ZDFeld[2][0] = "wLaeufer1"; 
    ZDFeld[3][0] = "wDame"; 
    ZDFeld[4][0] = "wKoenig";    
    ZDFeld[5][0] = "wLaeufer2";  
    ZDFeld[6][0] = "wPferd2";     
    ZDFeld[7][0] = "wTurm2"; 
    for (int i = 0; i < 8; i++) {
      ZDFeld[i][1] = "wBauer" + (i + 1); 
    } // end of for
    
    ZDFeld[0][7] = "sTurm1"; 
    ZDFeld[1][7] = "sPferd1"; 
    ZDFeld[2][7] = "sLaeufer1"; 
    ZDFeld[3][7] = "sKoenig"; 
    ZDFeld[4][7] = "sDame";    
    ZDFeld[5][7] = "sLaeufer2";  
    ZDFeld[6][7] = "sPferd2";     
    ZDFeld[7][7] = "sTurm2"; 
    for (int i = 0; i < 8; i++) {
      ZDFeld[i][6] = "sBauer" + (i + 1); 
    } // end of for
    /* Ende ZDFeld */ 
    /* Friedhofs - Feld:
    w s --> w ^= Zahl d. geschlagenen Wei�en
    --> s ^= ---------"---------- Schwarzen
    */
    friedhof = new int[2]; 
    friedhof[0] = 0; 
    friedhof[1] = 0; 
    // Anfang Komponenten
    
    
    jLabel1.setBounds(72, 80, 43, 41);
    jLabel1.setText("");
    jLabel1.setBackground(new Color(0xA3B8CC));
    jLabel1.setOpaque(true);
    jLabel1.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel1);
    jLabel2.setBounds(72, 128, 43, 41);
    jLabel2.setText("");
    jLabel2.setBackground(new Color(0xA3B8CC));
    jLabel2.setOpaque(true);
    jLabel2.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel2);
    jLabel3.setBounds(72, 176, 43, 41);
    jLabel3.setText("");
    jLabel3.setBackground(new Color(0xA3B8CC));
    jLabel3.setOpaque(true);
    jLabel3.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel3);
    jLabel4.setBounds(72, 224, 43, 41);
    jLabel4.setText("");
    jLabel4.setBackground(new Color(0xA3B8CC));
    jLabel4.setOpaque(true);
    jLabel4.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel4);
    jLabel5.setBounds(72, 272, 43, 41);
    jLabel5.setText("");
    jLabel5.setBackground(new Color(0xA3B8CC));
    jLabel5.setOpaque(true);
    jLabel5.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel5);
    jLabel6.setBounds(72, 320, 43, 41);
    jLabel6.setText("");
    jLabel6.setBackground(new Color(0xA3B8CC));
    jLabel6.setOpaque(true);
    jLabel6.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel6);
    jLabel7.setBounds(120, 128, 43, 41);
    jLabel7.setText("");
    jLabel7.setBackground(new Color(0xA3B8CC));
    jLabel7.setOpaque(true);
    jLabel7.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel7);
    jLabel8.setBounds(120, 368, 43, 41);
    jLabel8.setText("");
    jLabel8.setBackground(new Color(0xA3B8CC));
    jLabel8.setOpaque(true);
    jLabel8.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel8);
    jLabel9.setBounds(72, 368, 43, 41);
    jLabel9.setText("");
    jLabel9.setBackground(new Color(0xA3B8CC));
    jLabel9.setOpaque(true);
    jLabel9.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel9);
    jLabel10.setBounds(120, 224, 43, 41);
    jLabel10.setText("");
    jLabel10.setBackground(new Color(0xA3B8CC));
    jLabel10.setOpaque(true);
    jLabel10.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel10);
    jLabel11.setBounds(120, 272, 43, 41);
    jLabel11.setText("");
    jLabel11.setBackground(new Color(0xA3B8CC));
    jLabel11.setOpaque(true);
    jLabel11.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel11);
    jLabel12.setBounds(120, 320, 43, 41);
    jLabel12.setText("");
    jLabel12.setBackground(new Color(0xA3B8CC));
    jLabel12.setOpaque(true);
    jLabel12.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel12);
    jLabel13.setBounds(120, 176, 43, 41);
    jLabel13.setText("");
    jLabel13.setBackground(new Color(0xA3B8CC));
    jLabel13.setOpaque(true);
    jLabel13.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel13);
    jLabel14.setBounds(120, 416, 43, 41);
    jLabel14.setText("");
    jLabel14.setBackground(new Color(0xA3B8CC));
    jLabel14.setOpaque(true);
    jLabel14.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel14);
    jLabel15.setBounds(120, 80, 43, 41);
    jLabel15.setText("");
    jLabel15.setBackground(new Color(0xA3B8CC));
    jLabel15.setOpaque(true);
    jLabel15.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel15);
    jLabel16.setBounds(640, 320, 43, 41);
    jLabel16.setText("");
    jLabel16.setBackground(new Color(0xA3B8CC));
    jLabel16.setOpaque(true);
    jLabel16.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel16);
    jLabel17.setBounds(640, 368, 43, 41);
    jLabel17.setText("");
    jLabel17.setBackground(new Color(0xA3B8CC));
    jLabel17.setOpaque(true);
    jLabel17.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel17);
    jLabel18.setBounds(592, 416, 43, 41);
    jLabel18.setText("");
    jLabel18.setBackground(new Color(0xA3B8CC));
    jLabel18.setOpaque(true);
    jLabel18.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel18);
    jLabel19.setBounds(592, 368, 43, 41);
    jLabel19.setText("");
    jLabel19.setBackground(new Color(0xA3B8CC));
    jLabel19.setOpaque(true);
    jLabel19.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel19);
    jLabel20.setBounds(640, 80, 43, 41);
    jLabel20.setText("");
    jLabel20.setBackground(new Color(0xA3B8CC));
    jLabel20.setOpaque(true);
    jLabel20.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel20);
    jLabel21.setBounds(640, 128, 43, 41);
    jLabel21.setText("");
    jLabel21.setBackground(new Color(0xA3B8CC));
    jLabel21.setOpaque(true);
    jLabel21.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel21);
    jLabel22.setBounds(592, 272, 43, 41);
    jLabel22.setText("");
    jLabel22.setBackground(new Color(0xA3B8CC));
    jLabel22.setOpaque(true);
    jLabel22.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel22);
    jLabel23.setBounds(592, 128, 43, 41);
    jLabel23.setText("");
    jLabel23.setBackground(new Color(0xA3B8CC));
    jLabel23.setOpaque(true);
    jLabel23.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel23);
    jLabel24.setBounds(640, 176, 43, 41);
    jLabel24.setText("");
    jLabel24.setBackground(new Color(0xA3B8CC));
    jLabel24.setOpaque(true);
    jLabel24.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel24);
    jLabel25.setBounds(640, 224, 43, 41);
    jLabel25.setText("");
    jLabel25.setBackground(new Color(0xA3B8CC));
    jLabel25.setOpaque(true);
    jLabel25.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel25);
    jLabel26.setBounds(640, 272, 43, 41);
    jLabel26.setText("");
    jLabel26.setBackground(new Color(0xA3B8CC));
    jLabel26.setOpaque(true);
    jLabel26.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel26);
    jLabel27.setBounds(592, 80, 43, 41);
    jLabel27.setText("");
    jLabel27.setBackground(new Color(0xA3B8CC));
    jLabel27.setOpaque(true);
    jLabel27.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel27);
    jLabel28.setBounds(592, 320, 43, 41);
    jLabel28.setText("");
    jLabel28.setBackground(new Color(0xA3B8CC));
    jLabel28.setOpaque(true);
    jLabel28.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel28);
    jLabel29.setBounds(592, 176, 43, 41);
    jLabel29.setText("");
    jLabel29.setBackground(new Color(0xA3B8CC));
    jLabel29.setOpaque(true);
    jLabel29.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel29);
    jLabel30.setBounds(592, 224, 43, 41);
    jLabel30.setText("");
    jLabel30.setBackground(new Color(0xA3B8CC));
    jLabel30.setOpaque(true);
    jLabel30.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel30);
    labelC_2.setBounds(296, 432, 43, 41);
    labelC_2.setText("C");
    labelC_2.setHorizontalAlignment(SwingConstants.CENTER);
    labelC_2.setHorizontalTextPosition(SwingConstants.CENTER);
    labelC_2.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    labelC_2.setBackground(new Color(0x800000));
    labelC_2.setOpaque(true);
    cp.add(labelC_2);
    cp.setBackground(new Color(0x008040));
    labelB_2.setBounds(256, 432, 43, 41);
    labelB_2.setText("B");
    labelB_2.setHorizontalAlignment(SwingConstants.CENTER);
    labelB_2.setHorizontalTextPosition(SwingConstants.CENTER);
    labelB_2.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    labelB_2.setBackground(new Color(0x800000));
    labelB_2.setOpaque(true);
    cp.add(labelB_2);
    labelA_2.setBounds(216, 432, 43, 41);
    labelA_2.setText("A");
    labelA_2.setHorizontalAlignment(SwingConstants.CENTER);
    labelA_2.setHorizontalTextPosition(SwingConstants.CENTER);
    labelA_2.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    labelA_2.setBackground(new Color(0x800000));
    labelA_2.setOpaque(true);
    cp.add(labelA_2);
    labelD_2.setBounds(336, 432, 43, 41);
    labelD_2.setText("D");
    labelD_2.setHorizontalAlignment(SwingConstants.CENTER);
    labelD_2.setHorizontalTextPosition(SwingConstants.CENTER);
    labelD_2.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    labelD_2.setBackground(new Color(0x800000));
    labelD_2.setOpaque(true);
    cp.add(labelD_2);
    labelE_2.setBounds(376, 432, 43, 41);
    labelE_2.setText("E");
    labelE_2.setHorizontalAlignment(SwingConstants.CENTER);
    labelE_2.setHorizontalTextPosition(SwingConstants.CENTER);
    labelE_2.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    labelE_2.setBackground(new Color(0x800000));
    labelE_2.setOpaque(true);
    cp.add(labelE_2);
    labelF_2.setBounds(416, 432, 43, 41);
    labelF_2.setText("F");
    labelF_2.setHorizontalAlignment(SwingConstants.CENTER);
    labelF_2.setHorizontalTextPosition(SwingConstants.CENTER);
    labelF_2.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    labelF_2.setBackground(new Color(0x800000));
    labelF_2.setOpaque(true);
    cp.add(labelF_2);
    labelG_2.setBounds(456, 432, 43, 41);
    labelG_2.setText("G");
    labelG_2.setHorizontalAlignment(SwingConstants.CENTER);
    labelG_2.setHorizontalTextPosition(SwingConstants.CENTER);
    labelG_2.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    labelG_2.setBackground(new Color(0x800000));
    labelG_2.setOpaque(true);
    cp.add(labelG_2);
    labelH_2.setBounds(496, 432, 43, 41);
    labelH_2.setText("H");
    labelH_2.setHorizontalAlignment(SwingConstants.CENTER);
    labelH_2.setHorizontalTextPosition(SwingConstants.CENTER);
    labelH_2.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    labelH_2.setBackground(new Color(0x800000));
    labelH_2.setOpaque(true);
    cp.add(labelH_2);
    label8_1.setBounds(176, 392, 43, 41);
    label8_1.setText("8");
    label8_1.setHorizontalAlignment(SwingConstants.CENTER);
    label8_1.setHorizontalTextPosition(SwingConstants.CENTER);
    label8_1.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    label8_1.setBackground(new Color(0x800000));
    label8_1.setOpaque(true);
    cp.add(label8_1);
    label7_1.setBounds(176, 352, 43, 41);
    label7_1.setText("7");
    label7_1.setHorizontalAlignment(SwingConstants.CENTER);
    label7_1.setHorizontalTextPosition(SwingConstants.CENTER);
    label7_1.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    label7_1.setBackground(new Color(0x800000));
    label7_1.setOpaque(true);
    cp.add(label7_1);
    label1_1.setBounds(176, 112, 43, 41);
    label1_1.setText("1");
    label1_1.setHorizontalAlignment(SwingConstants.CENTER);
    label1_1.setHorizontalTextPosition(SwingConstants.CENTER);
    label1_1.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    label1_1.setBackground(new Color(0x800000));
    label1_1.setOpaque(true);
    cp.add(label1_1);
    label5_1.setBounds(176, 272, 43, 41);
    label5_1.setText("5");
    label5_1.setHorizontalAlignment(SwingConstants.CENTER);
    label5_1.setHorizontalTextPosition(SwingConstants.CENTER);
    label5_1.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    label5_1.setBackground(new Color(0x800000));
    label5_1.setOpaque(true);
    cp.add(label5_1);
    label4_1.setBounds(176, 232, 43, 41);
    label4_1.setText("4");
    label4_1.setHorizontalAlignment(SwingConstants.CENTER);
    label4_1.setHorizontalTextPosition(SwingConstants.CENTER);
    label4_1.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    label4_1.setBackground(new Color(0x800000));
    label4_1.setOpaque(true);
    cp.add(label4_1);
    label3_1.setBounds(176, 192, 43, 41);
    label3_1.setText("3");
    label3_1.setHorizontalAlignment(SwingConstants.CENTER);
    label3_1.setHorizontalTextPosition(SwingConstants.CENTER);
    label3_1.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    label3_1.setBackground(new Color(0x800000));
    label3_1.setOpaque(true);
    cp.add(label3_1);
    label2_1.setBounds(176, 152, 43, 41);
    label2_1.setText("2");
    label2_1.setHorizontalAlignment(SwingConstants.CENTER);
    label2_1.setHorizontalTextPosition(SwingConstants.CENTER);
    label2_1.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    label2_1.setBackground(new Color(0x800000));
    label2_1.setOpaque(true);
    cp.add(label2_1);
    label6_1.setBounds(176, 312, 43, 41);
    label6_1.setText("6");
    label6_1.setHorizontalAlignment(SwingConstants.CENTER);
    label6_1.setHorizontalTextPosition(SwingConstants.CENTER);
    label6_1.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    label6_1.setBackground(new Color(0x800000));
    label6_1.setOpaque(true);
    cp.add(label6_1);
    labelC_1.setBounds(296, 72, 43, 41);
    labelC_1.setText("C");
    labelC_1.setHorizontalAlignment(SwingConstants.CENTER);
    labelC_1.setHorizontalTextPosition(SwingConstants.CENTER);
    labelC_1.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    labelC_1.setBackground(new Color(0x800000));
    labelC_1.setOpaque(true);
    cp.add(labelC_1);
    labelB_1.setBounds(256, 72, 43, 41);
    labelB_1.setText("B");
    labelB_1.setHorizontalAlignment(SwingConstants.CENTER);
    labelB_1.setHorizontalTextPosition(SwingConstants.CENTER);
    labelB_1.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    labelB_1.setBackground(new Color(0x800000));
    labelB_1.setOpaque(true);
    cp.add(labelB_1);
    labelA_1.setBounds(216, 72, 43, 41);
    labelA_1.setText("A");
    labelA_1.setHorizontalAlignment(SwingConstants.CENTER);
    labelA_1.setHorizontalTextPosition(SwingConstants.CENTER);
    labelA_1.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    labelA_1.setBackground(new Color(0x800000));
    labelA_1.setOpaque(true);
    cp.add(labelA_1);
    labelD_1.setBounds(336, 72, 43, 41);
    labelD_1.setText("D");
    labelD_1.setHorizontalAlignment(SwingConstants.CENTER);
    labelD_1.setHorizontalTextPosition(SwingConstants.CENTER);
    labelD_1.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    labelD_1.setBackground(new Color(0x800000));
    labelD_1.setOpaque(true);
    cp.add(labelD_1);
    labelE_1.setBounds(376, 72, 43, 41);
    labelE_1.setText("E");
    labelE_1.setHorizontalAlignment(SwingConstants.CENTER);
    labelE_1.setHorizontalTextPosition(SwingConstants.CENTER);
    labelE_1.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    labelE_1.setOpaque(true);
    labelE_1.setBackground(new Color(0x800000));
    cp.add(labelE_1);
    labelF_1.setBounds(416, 72, 43, 41);
    labelF_1.setText("F");
    labelF_1.setHorizontalAlignment(SwingConstants.CENTER);
    labelF_1.setHorizontalTextPosition(SwingConstants.CENTER);
    labelF_1.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    labelF_1.setBackground(new Color(0x800000));
    labelF_1.setOpaque(true);
    cp.add(labelF_1);
    labelG_1.setBounds(456, 72, 43, 41);
    labelG_1.setText("G");
    labelG_1.setHorizontalAlignment(SwingConstants.CENTER);
    labelG_1.setHorizontalTextPosition(SwingConstants.CENTER);
    labelG_1.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    labelG_1.setBackground(new Color(0x800000));
    labelG_1.setOpaque(true);
    cp.add(labelG_1);
    labelH_1.setBounds(496, 72, 43, 41);
    labelH_1.setText("H");
    labelH_1.setHorizontalAlignment(SwingConstants.CENTER);
    labelH_1.setHorizontalTextPosition(SwingConstants.CENTER);
    labelH_1.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    labelH_1.setBackground(new Color(0x800000));
    labelH_1.setOpaque(true);
    cp.add(labelH_1);
    label8_2.setBounds(536, 392, 43, 41);
    label8_2.setText("8");
    label8_2.setHorizontalAlignment(SwingConstants.CENTER);
    label8_2.setHorizontalTextPosition(SwingConstants.CENTER);
    label8_2.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    label8_2.setBackground(new Color(0x800000));
    label8_2.setOpaque(true);
    cp.add(label8_2);
    label7_2.setBounds(536, 352, 43, 41);
    label7_2.setText("7");
    label7_2.setHorizontalAlignment(SwingConstants.CENTER);
    label7_2.setHorizontalTextPosition(SwingConstants.CENTER);
    label7_2.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    label7_2.setBackground(new Color(0x800000));
    label7_2.setOpaque(true);
    cp.add(label7_2);
    label1_2.setBounds(536, 112, 43, 41);
    label1_2.setText("1");
    label1_2.setHorizontalAlignment(SwingConstants.CENTER);
    label1_2.setHorizontalTextPosition(SwingConstants.CENTER);
    label1_2.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    label1_2.setBackground(new Color(0x800000));
    label1_2.setOpaque(true);
    cp.add(label1_2);
    label5_2.setBounds(536, 272, 43, 41);
    label5_2.setText("5");
    label5_2.setHorizontalAlignment(SwingConstants.CENTER);
    label5_2.setHorizontalTextPosition(SwingConstants.CENTER);
    label5_2.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    label5_2.setBackground(new Color(0x800000));
    label5_2.setOpaque(true);
    cp.add(label5_2);
    label4_2.setBounds(536, 232, 43, 41);
    label4_2.setText("4");
    label4_2.setHorizontalAlignment(SwingConstants.CENTER);
    label4_2.setHorizontalTextPosition(SwingConstants.CENTER);
    label4_2.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    label4_2.setBackground(new Color(0x800000));
    label4_2.setOpaque(true);
    cp.add(label4_2);
    label3_2.setBounds(536, 192, 43, 41);
    label3_2.setText("3");
    label3_2.setHorizontalAlignment(SwingConstants.CENTER);
    label3_2.setHorizontalTextPosition(SwingConstants.CENTER);
    label3_2.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    label3_2.setBackground(new Color(0x800000));
    label3_2.setOpaque(true);
    cp.add(label3_2);
    label2_2.setBounds(536, 152, 43, 41);
    label2_2.setText("2");
    label2_2.setHorizontalAlignment(SwingConstants.CENTER);
    label2_2.setHorizontalTextPosition(SwingConstants.CENTER);
    label2_2.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    label2_2.setBackground(new Color(0x800000));
    label2_2.setOpaque(true);
    cp.add(label2_2);
    label6_2.setBounds(536, 312, 43, 41);
    label6_2.setText("6");
    label6_2.setHorizontalAlignment(SwingConstants.CENTER);
    label6_2.setHorizontalTextPosition(SwingConstants.CENTER);
    label6_2.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    label6_2.setBackground(new Color(0x800000));
    label6_2.setOpaque(true);
    cp.add(label6_2);
    label8_3.setBounds(536, 72, 43, 41);
    label8_3.setText("");
    label8_3.setBackground(new Color(0x800000));
    label8_3.setOpaque(true);
    label8_3.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    label8_3.setForeground(Color.WHITE);
    label8_3.setHorizontalAlignment(SwingConstants.CENTER);
    label8_3.setHorizontalTextPosition(SwingConstants.CENTER);
    cp.add(label8_3);
    label8_4.setBounds(176, 72, 43, 41);
    label8_4.setText("");
    label8_4.setBackground(new Color(0x800000));
    label8_4.setOpaque(true);
    label8_4.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    label8_4.setForeground(Color.WHITE);
    label8_4.setHorizontalAlignment(SwingConstants.CENTER);
    label8_4.setHorizontalTextPosition(SwingConstants.CENTER);
    cp.add(label8_4);
    label8_5.setBounds(536, 432, 43, 41);
    label8_5.setText("");
    label8_5.setBackground(new Color(0x800000));
    label8_5.setOpaque(true);
    label8_5.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    label8_5.setForeground(Color.WHITE);
    label8_5.setHorizontalAlignment(SwingConstants.CENTER);
    label8_5.setHorizontalTextPosition(SwingConstants.CENTER);
    cp.add(label8_5);
    label8_6.setBounds(176, 432, 43, 41);
    label8_6.setText("");
    label8_6.setBackground(new Color(0x800000));
    label8_6.setOpaque(true);
    label8_6.setFont(new Font("@Microsoft JhengHei UI", Font.BOLD, 9));
    label8_6.setForeground(Color.WHITE);
    label8_6.setHorizontalAlignment(SwingConstants.CENTER);
    label8_6.setHorizontalTextPosition(SwingConstants.CENTER);
    cp.add(label8_6);
    wPferd1.setName("wPferd1");
    wPferd1.setBounds(256, 112, 41, 41);
    wPferd1.setText("");
    wPferd1.setMargin(new Insets(2, 2, 2, 2));
    wPferd1.setBorderPainted(true);
    wPferd1.setContentAreaFilled(false);
    wPferd1.setFont(new Font("Algerian", Font.BOLD, 9));
    wPferd1.setForeground(Color.WHITE);
    wPferd1.setIcon(wPferd1Icon);
    wPferd1.addMouseListener(new MouseAdapter() { 
      public void mouseReleased(MouseEvent evt) { 
        wPferd1_MouseReleased(evt);
      }
    });
    cp.add(wPferd1);
    wTurm1.setName("wTurm1"); 
    wTurm1.setBounds(216, 112, 41, 41);
    wTurm1.setText("");
    wTurm1.setMargin(new Insets(2, 2, 2, 2));
    wTurm1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        wTurm1_ActionPerformed(evt);
      }
    });
    wTurm1.setContentAreaFilled(false);
    wTurm1.setFont(new Font("Times New Roman", Font.PLAIN, 9));
    wTurm1.setIcon(wTurm1Icon);
    wTurm1.setBorderPainted(false);
    wTurm1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    cp.add(wTurm1);
    wLaeufer.setName("wLaeufer");
    wLaeufer.setBounds(296, 112, 41, 41);
    wLaeufer.setText("");
    wLaeufer.setMargin(new Insets(2, 2, 2, 2));
    wLaeufer.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        wLaeufer_ActionPerformed(evt);
      }
    });
    wLaeufer.setContentAreaFilled(false);
    wLaeufer.setFont(new Font("Algerian", Font.BOLD, 9));
    wLaeufer.setForeground(Color.WHITE);
    wLaeufer.setIcon(wLaeuferIcon);
    cp.add(wLaeufer);
    wDame.setName("wDame");
    wDame.setBounds(376, 112, 41, 41);
    wDame.setText("");
    wDame.setMargin(new Insets(2, 2, 2, 2));
    wDame.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        wDame_ActionPerformed(evt);
      }
    });
    wDame.setContentAreaFilled(false);
    wDame.setFont(new Font("Algerian", Font.BOLD, 9));
    wDame.setForeground(Color.WHITE);
    wDame.setIcon(wDameIcon);
    cp.add(wDame);
    wPferd2.setName("wPferd2");
    wPferd2.setBounds(456, 112, 41, 41);
    wPferd2.setText("");
    wPferd2.setMargin(new Insets(2, 2, 2, 2));
    wPferd2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        wPferd2_ActionPerformed(evt);
      }
    });
    wPferd2.setContentAreaFilled(false);
    wPferd2.setFont(new Font("Algerian", Font.BOLD, 9));
    wPferd2.setForeground(Color.WHITE);
    wPferd2.setIcon(wPferd2Icon);
    cp.add(wPferd2);
    wLaeufer2.setName("wLaeufer2");
    wLaeufer2.setBounds(416, 112, 41, 41);
    wLaeufer2.setText("");
    wLaeufer2.setMargin(new Insets(2, 2, 2, 2));
    wLaeufer2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        wLaeufer2_ActionPerformed(evt);
      }
    });
    wLaeufer2.setContentAreaFilled(false);
    wLaeufer2.setFont(new Font("Algerian", Font.BOLD, 9));
    wLaeufer2.setForeground(Color.WHITE);
    wLaeufer2.setIcon(wLaeufer2Icon);
    cp.add(wLaeufer2);
    wKoenig.setName("wKoenig");
    wKoenig.setBounds(336, 112, 41, 41);
    wKoenig.setText("");
    wKoenig.setMargin(new Insets(2, 2, 2, 2));
    wKoenig.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        wKoenig_ActionPerformed(evt);
      }
    });
    wKoenig.setContentAreaFilled(false);
    wKoenig.setForeground(Color.WHITE);
    wKoenig.setFont(new Font("Algerian", Font.BOLD, 9));
    wKoenig.setIcon(wKoenigIcon);
    cp.add(wKoenig);
    wTurm2.setName("wTurm2");
    wTurm2.setBounds(496, 112, 41, 41);
    wTurm2.setText("");
    wTurm2.setMargin(new Insets(2, 2, 2, 2));
    wTurm2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        wTurm2_ActionPerformed(evt);
      }
    });
    wTurm2.setContentAreaFilled(false);
    wTurm2.setFont(new Font("Algerian", Font.BOLD, 9));
    wTurm2.setForeground(Color.WHITE);
    wTurm2.setIcon(wTurm2Icon);
    cp.add(wTurm2);
    wBauer2.setName("wBauer2");
    wBauer2.setBounds(256, 152, 41, 41);
    wBauer2.setText("");
    wBauer2.setMargin(new Insets(2, 2, 2, 2));
    wBauer2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        wBauer2_ActionPerformed(evt);
      }
    });
    wBauer2.setContentAreaFilled(false);
    wBauer2.setFont(new Font("Algerian", Font.BOLD, 9));
    wBauer2.setIcon(wBauer2Icon);
    cp.add(wBauer2);
    wBauer1.setName("wBauer1");
    wBauer1.setBounds(216, 152, 41, 41);
    wBauer1.setText("");
    wBauer1.setMargin(new Insets(2, 2, 2, 2));
    wBauer1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        wBauer1_ActionPerformed(evt);
      }
    });
    wBauer1.setContentAreaFilled(false);
    wBauer1.setFont(new Font("Algerian", Font.BOLD, 9));
    wBauer1.setIcon(wBauer1Icon);
    cp.add(wBauer1);
    wBauer3.setName("wBauer3");
    wBauer3.setBounds(296, 152, 41, 41);
    wBauer3.setText("");
    wBauer3.setMargin(new Insets(2, 2, 2, 2));
    wBauer3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        wBauer3_ActionPerformed(evt);
      }
    });
    wBauer3.setContentAreaFilled(false);
    wBauer3.setFont(new Font("Algerian", Font.BOLD, 9));
    wBauer3.setIcon(wBauer3Icon);
    cp.add(wBauer3);
    wBauer4.setName("wBauer4");
    wBauer4.setBounds(336, 152, 41, 41);
    wBauer4.setText("");
    wBauer4.setMargin(new Insets(2, 2, 2, 2));
    wBauer4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        wBauer4_ActionPerformed(evt);
      }
    });
    wBauer4.setContentAreaFilled(false);
    wBauer4.setFont(new Font("Algerian", Font.BOLD, 9));
    wBauer4.setIcon(wBauer4Icon);
    cp.add(wBauer4);
    wBauer7.setName("wBauer7");
    wBauer7.setBounds(456, 152, 41, 41);
    wBauer7.setText("");
    wBauer7.setMargin(new Insets(2, 2, 2, 2));
    wBauer7.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        wBauer7_ActionPerformed(evt);
      }
    });
    wBauer7.setContentAreaFilled(false);
    wBauer7.setIcon(wBauer7Icon);
    wBauer7.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(wBauer7);
    wBauer6.setName("wBauer6");
    wBauer6.setBounds(416, 152, 41, 41);
    wBauer6.setText("");
    wBauer6.setMargin(new Insets(2, 2, 2, 2));
    wBauer6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        wBauer6_ActionPerformed(evt);
      }
    });
    wBauer6.setContentAreaFilled(false);
    wBauer6.setIcon(wBauer6Icon);
    wBauer6.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(wBauer6);
    wBauer5.setName("wBauer5");
    wBauer5.setBounds(376, 152, 41, 41);
    wBauer5.setText("");
    wBauer5.setMargin(new Insets(2, 2, 2, 2));
    wBauer5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        wBauer5_ActionPerformed(evt);
      }
    });
    wBauer5.setContentAreaFilled(false);
    wBauer5.setIcon(wBauer5Icon);
    wBauer5.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(wBauer5);
    wBauer8.setName("wBauer8");
    wBauer8.setBounds(496, 152, 41, 41);
    wBauer8.setText("");
    wBauer8.setMargin(new Insets(2, 2, 2, 2));
    wBauer8.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        wBauer8_ActionPerformed(evt);
      }
    });
    wBauer8.setContentAreaFilled(false);
    wBauer8.setFont(new Font("Algerian", Font.BOLD, 9));
    wBauer8.setIcon(wBauer8Icon);
    cp.add(wBauer8);
    sBauer2.setName("sBauer2");
    sBauer2.setBounds(256, 352, 41, 41);
    sBauer2.setText("");
    sBauer2.setMargin(new Insets(2, 2, 2, 2));
    sBauer2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        sBauer2_ActionPerformed(evt);
      }
    });
    sBauer2.setContentAreaFilled(false);
    sBauer2.setFont(new Font("Algerian", Font.BOLD, 9));
    sBauer2.setIcon(sBauer2Icon);
    cp.add(sBauer2);
    sBauer1.setName("sBauer1");
    sBauer1.setBounds(216, 352, 41, 41);
    sBauer1.setText("");
    sBauer1.setMargin(new Insets(2, 2, 2, 2));
    sBauer1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        sBauer1_ActionPerformed(evt);
      }
    });
    sBauer1.setContentAreaFilled(false);
    sBauer1.setFont(new Font("Algerian", Font.BOLD, 9));
    sBauer1.setSelected(false);
    sBauer1.setIcon(sBauer1Icon);
    cp.add(sBauer1);
    sBauer3.setName("sBauer3");
    sBauer3.setBounds(296, 352, 41, 41);
    sBauer3.setText("");
    sBauer3.setMargin(new Insets(2, 2, 2, 2));
    sBauer3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        sBauer3_ActionPerformed(evt);
      }
    });
    sBauer3.setContentAreaFilled(false);
    sBauer3.setFont(new Font("Algerian", Font.BOLD, 9));
    sBauer3.setIcon(sBauer3Icon);
    cp.add(sBauer3);
    sBauer4.setName("sBauer4");
    sBauer4.setBounds(336, 352, 41, 41);
    sBauer4.setText("");
    sBauer4.setMargin(new Insets(2, 2, 2, 2));
    sBauer4.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        sBauer4_ActionPerformed(evt);
      }
    });
    sBauer4.setContentAreaFilled(false);
    sBauer4.setFont(new Font("Algerian", Font.BOLD, 9));
    sBauer4.setIcon(sBauer4Icon);
    cp.add(sBauer4);
    sBauer7.setName("sBauer7");
    sBauer7.setBounds(456, 352, 41, 41);
    sBauer7.setText("");
    sBauer7.setMargin(new Insets(2, 2, 2, 2));
    sBauer7.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        sBauer7_ActionPerformed(evt);
      }
    });
    sBauer7.setContentAreaFilled(false);
    sBauer7.setIcon(sBauer7Icon);
    sBauer7.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(sBauer7);
    sBauer6.setName("sBauer6");
    sBauer6.setBounds(416, 352, 41, 41);
    sBauer6.setText("");
    sBauer6.setMargin(new Insets(2, 2, 2, 2));
    sBauer6.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        sBauer6_ActionPerformed(evt);
      }
    });
    sBauer6.setContentAreaFilled(false);
    sBauer6.setIcon(sBauer6Icon);
    sBauer6.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(sBauer6);
    sBauer5.setName("sBauer5");
    sBauer5.setBounds(376, 352, 41, 41);
    sBauer5.setText("");
    sBauer5.setMargin(new Insets(2, 2, 2, 2));
    sBauer5.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        sBauer5_ActionPerformed(evt);
      }
    });
    sBauer5.setContentAreaFilled(false);
    sBauer5.setIcon(sBauer5Icon);
    sBauer5.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(sBauer5);
    sBauer8.setName("sBauer8");
    sBauer8.setBounds(496, 352, 41, 41);
    sBauer8.setText("");
    sBauer8.setMargin(new Insets(2, 2, 2, 2));
    sBauer8.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        sBauer8_ActionPerformed(evt);
      }
    });
    sBauer8.setContentAreaFilled(false);
    sBauer8.setFont(new Font("Algerian", Font.BOLD, 9));
    sBauer8.setIcon(sBauer8Icon);
    cp.add(sBauer8);
    sPferd1.setName("sPferd1");
    sPferd1.setBounds(256, 392, 41, 41);
    sPferd1.setText("");
    sPferd1.setMargin(new Insets(2, 2, 2, 2));
    sPferd1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        sPferd1_ActionPerformed(evt);
      }
    });
    sPferd1.setContentAreaFilled(false);
    sPferd1.setFont(new Font("Algerian", Font.BOLD, 9));
    sPferd1.setIcon(sPferd1Icon);
    cp.add(sPferd1);
    sTurm1.setName("sTurm1");
    sTurm1.setBounds(216, 392, 41, 41);
    sTurm1.setText("");
    sTurm1.setMargin(new Insets(2, 2, 2, 2));
    sTurm1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        sTurm1_ActionPerformed(evt);
      }
    });
    sTurm1.setContentAreaFilled(false);
    sTurm1.setFont(new Font("Algerian", Font.BOLD, 9));
    sTurm1.setIcon(sTurm1Icon);
    cp.add(sTurm1);
    sLaeufer1.setName("sLaeufer1");
    sLaeufer1.setBounds(296, 392, 41, 41);
    sLaeufer1.setText("");
    sLaeufer1.setMargin(new Insets(2, 2, 2, 2));
    sLaeufer1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        sLaeufer1_ActionPerformed(evt);
      }
    });
    sLaeufer1.setContentAreaFilled(false);
    sLaeufer1.setFont(new Font("Algerian", Font.BOLD, 9));
    sLaeufer1.setIcon(sLaeufer1Icon);
    cp.add(sLaeufer1);
    sDame.setName("sKoenig");
    sDame.setBounds(336, 392, 41, 41);
    sDame.setText("");
    sDame.setMargin(new Insets(2, 2, 2, 2));
    sDame.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        sDame_ActionPerformed(evt);
      }
    });
    sDame.setContentAreaFilled(false);
    sDame.setFont(new Font("Algerian", Font.BOLD, 9));
    sDame.setIcon(sDameIcon);
    cp.add(sDame);
    sLaeufer2.setName("sLaeufer2");
    sLaeufer2.setBounds(416, 392, 41, 41);
    sLaeufer2.setText("");
    sLaeufer2.setMargin(new Insets(2, 2, 2, 2));
    sLaeufer2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        sLaeufer2_ActionPerformed(evt);
      }
    });
    sLaeufer2.setContentAreaFilled(false);
    sLaeufer2.setIcon(sLaeufer2Icon);
    sLaeufer2.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(sLaeufer2);
    sPferd2.setName("sPferd2");
    sPferd2.setBounds(456, 392, 41, 41);
    sPferd2.setText("");
    sPferd2.setMargin(new Insets(2, 2, 2, 2));
    sPferd2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        sPferd2_ActionPerformed(evt);
      }
    });
    sPferd2.setContentAreaFilled(false);
    sPferd2.setIcon(sPferd2Icon);
    sPferd2.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(sPferd2);
    sKoenig.setName("sDame");
    sKoenig.setBounds(376, 392, 41, 41);
    sKoenig.setText("");
    sKoenig.setMargin(new Insets(2, 2, 2, 2));
    sKoenig.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        sKoenig_ActionPerformed(evt);
      }
    });
    sKoenig.setContentAreaFilled(false);
    sKoenig.setIcon(sKoenigIcon);
    sKoenig.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(sKoenig);
    sTurm2.setName("sTurm2");
    sTurm2.setBounds(496, 392, 41, 41);
    sTurm2.setText("");
    sTurm2.setMargin(new Insets(2, 2, 2, 2));
    sTurm2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        sTurm2_ActionPerformed(evt);
      }
    });
    sTurm2.setContentAreaFilled(false);
    sTurm2.setFont(new Font("Algerian", Font.BOLD, 9));
    sTurm2.setIcon(sTurm2Icon);
    cp.add(sTurm2);
    B1.setBounds(256, 112, 41, 41);
    B1.setText("");
    B1.setBackground(new Color(0x804000));
    B1.setOpaque(true);
    B1.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(B1);
    C1.setBounds(296, 112, 41, 41);
    C1.setText("");
    C1.setBackground(new Color(0xFF8040));
    C1.setOpaque(true);
    C1.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(C1);
    D1.setBounds(336, 112, 41, 41);
    D1.setText("");
    D1.setBackground(new Color(0x804000));
    D1.setOpaque(true);
    D1.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(D1);
    E1.setBounds(376, 112, 41, 41);
    E1.setText("");
    E1.setBackground(new Color(0xFF8040));
    E1.setOpaque(true);
    E1.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(E1);
    F1.setBounds(416, 112, 41, 41);
    F1.setText("");
    F1.setBackground(new Color(0x804000));
    F1.setOpaque(true);
    F1.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(F1);
    G1.setBounds(456, 112, 41, 41);
    G1.setText("");
    G1.setBackground(new Color(0xFF8040));
    G1.setOpaque(true);
    G1.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(G1);
    H1.setBounds(496, 112, 41, 41);
    H1.setText("");
    H1.setBackground(new Color(0x804000));
    H1.setOpaque(true);
    H1.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(H1);
    A1.setBounds(216, 112, 41, 41);
    A1.setText("");
    A1.setBackground(new Color(0xFF8040));
    A1.setOpaque(true);
    A1.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(A1);
    A2.setBounds(216, 152, 41, 41);
    A2.setText("");
    A2.setBackground(new Color(0x804000));
    A2.setOpaque(true);
    A2.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(A2);
    B2.setBounds(256, 152, 41, 41);
    B2.setText("");
    B2.setBackground(new Color(0xFF8040));
    B2.setOpaque(true);
    B2.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(B2);
    C2.setBounds(296, 152, 41, 41);
    C2.setText("");
    C2.setBackground(new Color(0x804000));
    C2.setOpaque(true);
    C2.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(C2);
    D2.setBounds(336, 152, 41, 41);
    D2.setText("");
    D2.setBackground(new Color(0xFF8040));
    D2.setOpaque(true);
    D2.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(D2);
    E2.setBounds(376, 152, 41, 41);
    E2.setText("");
    E2.setBackground(new Color(0x804000));
    E2.setOpaque(true);
    E2.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(E2);
    F2.setBounds(416, 152, 41, 41);
    F2.setText("");
    F2.setBackground(new Color(0xFF8040));
    F2.setOpaque(true);
    F2.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(F2);
    G2.setBounds(456, 152, 41, 41);
    G2.setText("");
    G2.setBackground(new Color(0x804000));
    G2.setOpaque(true);
    G2.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(G2);
    H2.setBounds(496, 152, 41, 41);
    H2.setText("");
    H2.setBackground(new Color(0xFF8040));
    H2.setOpaque(true);
    H2.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(H2);
    A3.setBounds(216, 192, 41, 41);
    A3.setText("");
    A3.setBackground(new Color(0xFF8040));
    A3.setOpaque(true);
    A3.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(A3);
    B3.setBounds(256, 192, 41, 41);
    B3.setText("");
    B3.setBackground(new Color(0x804000));
    B3.setOpaque(true);
    B3.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(B3);
    C3.setBounds(296, 192, 41, 41);
    C3.setText("");
    C3.setBackground(new Color(0xFF8040));
    C3.setOpaque(true);
    C3.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(C3);
    D3.setBounds(336, 192, 41, 41);
    D3.setText("");
    D3.setBackground(new Color(0x804000));
    D3.setOpaque(true);
    D3.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(D3);
    F3.setBounds(416, 192, 41, 41);
    F3.setText("");
    F3.setBackground(new Color(0x804000));
    F3.setOpaque(true);
    F3.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(F3);
    E3.setBounds(376, 192, 41, 41);
    E3.setText("");
    E3.setBackground(new Color(0xFF8040));
    E3.setOpaque(true);
    E3.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(E3);
    G3.setBounds(456, 192, 41, 41);
    G3.setText("");
    G3.setBackground(new Color(0xFF8040));
    G3.setOpaque(true);
    G3.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(G3);
    H3.setBounds(496, 192, 41, 41);
    H3.setText("");
    H3.setBackground(new Color(0x804000));
    H3.setOpaque(true);
    H3.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(H3);
    H4.setBounds(496, 232, 41, 41);
    H4.setText("");
    H4.setBackground(new Color(0xFF8040));
    H4.setOpaque(true);
    H4.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(H4);
    G4.setBounds(456, 232, 41, 41);
    G4.setText("");
    G4.setBackground(new Color(0x804000));
    G4.setOpaque(true);
    G4.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(G4);
    E4.setBounds(376, 232, 41, 41);
    E4.setText("");
    E4.setBackground(new Color(0x804000));
    E4.setOpaque(true);
    E4.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(E4);
    F4.setBounds(416, 232, 41, 41);
    F4.setText("");
    F4.setBackground(new Color(0xFF8040));
    F4.setOpaque(true);
    F4.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(F4);
    D4.setBounds(336, 232, 41, 41);
    D4.setText("");
    D4.setBackground(new Color(0xFF8040));
    D4.setOpaque(true);
    D4.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(D4);
    C4.setBounds(296, 232, 41, 41);
    C4.setText("");
    C4.setBackground(new Color(0x804000));
    C4.setOpaque(true);
    C4.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(C4);
    B4.setBounds(256, 232, 41, 41);
    B4.setText("");
    B4.setBackground(new Color(0xFF8040));
    B4.setOpaque(true);
    B4.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(B4);
    A4.setBounds(216, 232, 41, 41);
    A4.setText("");
    A4.setBackground(new Color(0x804000));
    A4.setOpaque(true);
    A4.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(A4);
    A5.setBounds(216, 272, 41, 41);
    A5.setText("");
    A5.setBackground(new Color(0xFF8040));
    A5.setOpaque(true);
    A5.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(A5);
    B5.setBounds(256, 272, 41, 41);
    B5.setText("");
    B5.setBackground(new Color(0x804000));
    B5.setOpaque(true);
    B5.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(B5);
    C5.setBounds(296, 272, 41, 41);
    C5.setText("");
    C5.setBackground(new Color(0xFF8040));
    C5.setOpaque(true);
    C5.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(C5);
    D5.setBounds(336, 272, 41, 41);
    D5.setText("");
    D5.setBackground(new Color(0x804000));
    D5.setOpaque(true);
    D5.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(D5);
    F5.setBounds(416, 272, 41, 41);
    F5.setText("");
    F5.setBackground(new Color(0x804000));
    F5.setOpaque(true);
    F5.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(F5);
    E5.setBounds(376, 272, 41, 41);
    E5.setText("");
    E5.setBackground(new Color(0xFF8040));
    E5.setOpaque(true);
    E5.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(E5);
    G5.setBounds(456, 272, 41, 41);
    G5.setText("");
    G5.setBackground(new Color(0xFF8040));
    G5.setOpaque(true);
    G5.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(G5);
    H5.setBounds(496, 272, 41, 41);
    H5.setText("");
    H5.setBackground(new Color(0x804000));
    H5.setOpaque(true);
    H5.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(H5);
    H6.setBounds(496, 312, 41, 41);
    H6.setText("");
    H6.setBackground(new Color(0xFF8040));
    H6.setOpaque(true);
    H6.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(H6);
    G6.setBounds(456, 312, 41, 41);
    G6.setText("");
    G6.setBackground(new Color(0x804000));
    G6.setOpaque(true);
    G6.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(G6);
    E6.setBounds(376, 312, 41, 41);
    E6.setText("");
    E6.setBackground(new Color(0x804000));
    E6.setOpaque(true);
    E6.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(E6);
    F6.setBounds(416, 312, 41, 41);
    F6.setText("");
    F6.setBackground(new Color(0xFF8040));
    F6.setOpaque(true);
    F6.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(F6);
    D6.setBounds(336, 312, 41, 41);
    D6.setText("");
    D6.setBackground(new Color(0xFF8040));
    D6.setOpaque(true);
    D6.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(D6);
    C6.setBounds(296, 312, 41, 41);
    C6.setText("");
    C6.setBackground(new Color(0x804000));
    C6.setOpaque(true);
    C6.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(C6);
    B6.setBounds(256, 312, 41, 41);
    B6.setText("");
    B6.setBackground(new Color(0xFF8040));
    B6.setOpaque(true);
    B6.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(B6);
    A6.setBounds(216, 312, 41, 41);
    A6.setText("");
    A6.setBackground(new Color(0x804000));
    A6.setOpaque(true);
    A6.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(A6);
    jLabel79.setBounds(232, -328, 41, 41);
    jLabel79.setText("");
    jLabel79.setBackground(new Color(0xFF8040));
    jLabel79.setOpaque(true);
    jLabel79.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel79);
    jLabel80.setBounds(272, -328, 41, 41);
    jLabel80.setText("");
    jLabel80.setBackground(new Color(0x804000));
    jLabel80.setOpaque(true);
    jLabel80.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel80);
    jLabel81.setBounds(312, -328, 41, 41);
    jLabel81.setText("");
    jLabel81.setBackground(new Color(0xFF8040));
    jLabel81.setOpaque(true);
    jLabel81.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel81);
    jLabel82.setBounds(352, -328, 41, 41);
    jLabel82.setText("");
    jLabel82.setBackground(new Color(0x804000));
    jLabel82.setOpaque(true);
    jLabel82.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel82);
    jLabel83.setBounds(432, -328, 41, 41);
    jLabel83.setText("");
    jLabel83.setBackground(new Color(0x804000));
    jLabel83.setOpaque(true);
    jLabel83.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel83);
    jLabel84.setBounds(392, -328, 41, 41);
    jLabel84.setText("");
    jLabel84.setBackground(new Color(0xFF8040));
    jLabel84.setOpaque(true);
    jLabel84.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel84);
    jLabel85.setBounds(472, -328, 41, 41);
    jLabel85.setText("");
    jLabel85.setBackground(new Color(0xFF8040));
    jLabel85.setOpaque(true);
    jLabel85.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel85);
    jLabel86.setBounds(512, -328, 41, 41);
    jLabel86.setText("");
    jLabel86.setBackground(new Color(0x804000));
    jLabel86.setOpaque(true);
    jLabel86.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel86);
    jLabel87.setBounds(512, -288, 41, 41);
    jLabel87.setText("");
    jLabel87.setBackground(new Color(0xFF8040));
    jLabel87.setOpaque(true);
    jLabel87.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel87);
    jLabel88.setBounds(472, -288, 41, 41);
    jLabel88.setText("");
    jLabel88.setBackground(new Color(0x804000));
    jLabel88.setOpaque(true);
    jLabel88.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel88);
    jLabel89.setBounds(392, -288, 41, 41);
    jLabel89.setText("");
    jLabel89.setBackground(new Color(0x804000));
    jLabel89.setOpaque(true);
    jLabel89.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel89);
    jLabel90.setBounds(432, -288, 41, 41);
    jLabel90.setText("");
    jLabel90.setBackground(new Color(0xFF8040));
    jLabel90.setOpaque(true);
    jLabel90.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel90);
    jLabel91.setBounds(352, -288, 41, 41);
    jLabel91.setText("");
    jLabel91.setBackground(new Color(0xFF8040));
    jLabel91.setOpaque(true);
    jLabel91.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel91);
    jLabel92.setBounds(312, -288, 41, 41);
    jLabel92.setText("");
    jLabel92.setBackground(new Color(0x804000));
    jLabel92.setOpaque(true);
    jLabel92.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(jLabel92);
    B7.setBounds(256, 352, 41, 41);
    B7.setText("");
    B7.setBackground(new Color(0x804000));
    B7.setOpaque(true);
    B7.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(B7);
    C7.setBounds(296, 352, 41, 41);
    C7.setText("");
    C7.setBackground(new Color(0xFF8040));
    C7.setOpaque(true);
    C7.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(C7);
    D7.setBounds(336, 352, 41, 41);
    D7.setText("");
    D7.setBackground(new Color(0x804000));
    D7.setOpaque(true);
    D7.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(D7);
    E7.setBounds(376, 352, 41, 41);
    E7.setText("");
    E7.setBackground(new Color(0xFF8040));
    E7.setOpaque(true);
    E7.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(E7);
    F7.setBounds(416, 352, 41, 41);
    F7.setText("");
    F7.setBackground(new Color(0x804000));
    F7.setOpaque(true);
    F7.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(F7);
    G7.setBounds(456, 352, 41, 41);
    G7.setText("");
    G7.setBackground(new Color(0xFF8040));
    G7.setOpaque(true);
    G7.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(G7);
    H7.setBounds(496, 352, 41, 41);
    H7.setText("");
    H7.setBackground(new Color(0x804000));
    H7.setOpaque(true);
    H7.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(H7);
    A7.setBounds(216, 352, 41, 41);
    A7.setText("");
    A7.setBackground(new Color(0xFF8040));
    A7.setOpaque(true);
    A7.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(A7);
    A8.setBounds(216, 392, 41, 41);
    A8.setText("");
    A8.setBackground(new Color(0x804000));
    A8.setOpaque(true);
    A8.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(A8);
    B8.setBounds(256, 392, 41, 41);
    B8.setText("");
    B8.setBackground(new Color(0xFF8040));
    B8.setOpaque(true);
    B8.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(B8);
    C8.setBounds(296, 392, 41, 41);
    C8.setText("");
    C8.setBackground(new Color(0x804000));
    C8.setOpaque(true);
    C8.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(C8);
    D8.setBounds(336, 392, 41, 41);
    D8.setText("");
    D8.setBackground(new Color(0xFF8040));
    D8.setOpaque(true);
    D8.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(D8);
    E8.setBounds(376, 392, 41, 41);
    E8.setText("");
    E8.setBackground(new Color(0x804000));
    E8.setOpaque(true);
    E8.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(E8);
    F8.setBounds(416, 392, 41, 41);
    F8.setText("");
    F8.setBackground(new Color(0xFF8040));
    F8.setOpaque(true);
    F8.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(F8);
    G8.setBounds(456, 392, 41, 41);
    G8.setText("");
    G8.setBackground(new Color(0x804000));
    G8.setOpaque(true);
    G8.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(G8);
    H8.setBounds(496, 392, 41, 41);
    H8.setText("");
    H8.setBackground(new Color(0xFF8040));
    H8.setOpaque(true);
    H8.setFont(new Font("Dialog", Font.BOLD, 9));
    cp.add(H8);
    this.addMouseListener(new MouseAdapter() { ;
      public void mouseClicked(MouseEvent evt) { 
        schachbrett_MouseClicked(evt);
      }
    });
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Schachbrett
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Schachbrett("Schachbrett");
  } // end of main
  
  public void wPferd1_MouseReleased(MouseEvent evt) { 
    String piece = "wPferd1";
    if (wTurn) {
      if (wKoenig.isEnabled()) {
        if (this.bauernsearchw()) {
          int help = this.tausch(wPferd1, "w");
          ZDFeld[help][0] = piece;
          this.disablew();
        } // end of if
        else {
          this.normal();
          this.feldBesetzt(piece, wPferd1);
          if (!onGoing) {                                          
            bitte0 = wPferd1.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(wPferd1)[0];
            bitte2 = this.getZDFCo(wPferd1)[1] ; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false; 
          } // end of else
        } // end of if-else  
      } // end of if
      else {
        wKoenig.setBounds(355,15,wKoenig.getWidth(),wKoenig.getWidth());
      } // end of if-else
    } // end of if
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(wPferd1)[0];
        bitte2 = this.getZDFCo(wPferd1)[1] ; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if
    } // end of if-else
  } // end of wPferd1_MouseReleased
  
  public void wTurm1_ActionPerformed(ActionEvent evt) {
    String piece = "wTurm1";
    if (wTurn) {
      if (wKoenig.isEnabled()) {
        if (this.bauernsearchw()) {
          int help = this.tausch(wTurm1, "w");
          ZDFeld[help][0] = piece;
          this.disablew();
        } // end of if
        else {
          this.feldBesetzt(piece, wTurm1);
          if (!onGoing) {                                          
            bitte0 = wTurm1.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(wTurm1)[0];
            bitte2 = this.getZDFCo(wTurm1)[1] ; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false;
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        wKoenig.setBounds(355,15,wKoenig.getWidth(),wKoenig.getWidth());
      } // end of if-else
    } // end of if
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(wTurm1)[0];
        bitte2 = this.getZDFCo(wTurm1)[1] ; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if
    } // end of if-else
  } // end of wTurm1_ActionPerformed
  
  public void wLaeufer_ActionPerformed(ActionEvent evt) { 
    String piece = "wLaeufer";
    if (wTurn) {
      if (wKoenig.isEnabled()) {
        if (this.bauernsearchw()) {
          int help = this.tausch(wLaeufer, "w");
          ZDFeld[help][0] = piece;
          this.disablew();
        } // end of if
        else {
          this.feldBesetzt(piece, wLaeufer);
          if (!onGoing) {                                          
            bitte0 = wLaeufer.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(wLaeufer)[0];
            bitte2 = this.getZDFCo(wLaeufer)[1] ; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false;
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        wKoenig.setBounds(355,15,wKoenig.getWidth(),wKoenig.getWidth());
      } // end of if-else
    } // end of if
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(wLaeufer)[0];
        bitte2 = this.getZDFCo(wLaeufer)[1] ; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if
    } // end of if-else
  } // end of wLaeufer_ActionPerformed
  
  public void wDame_ActionPerformed(ActionEvent evt) {
    String piece = "wDame";
    if (wTurn) {
      if (wKoenig.isEnabled()) {
        if (this.bauernsearchw()) {
          int help = this.tausch(wDame, "w");
          ZDFeld[help][0] = piece;
          this.disablew();
        } // end of if
        else {
          this.feldBesetzt(piece, wDame);
          if (!onGoing) {                                          
            bitte0 = wDame.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(wDame)[0];
            bitte2 = this.getZDFCo(wDame)[1] ; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false; 
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        wKoenig.setBounds(355,15,wKoenig.getWidth(),wKoenig.getWidth());
      } // end of if-else
    } // end of if
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(wDame)[0];
        bitte2 = this.getZDFCo(wDame)[1] ; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false; 
      } // end of if
    } // end of if-else
  } // end of wDame_ActionPerformed
  
  public void wPferd2_ActionPerformed(ActionEvent evt) {  
    String piece = "wPferd2";
    if (wTurn) {
      if (wKoenig.isEnabled()) {
        if (this.bauernsearchw()) {
          int help = this.tausch(wPferd2, "w");
          ZDFeld[help][0] = piece;
          this.disablew();
        } // end of if
        else {
          this.feldBesetzt(piece, wPferd2);
          if (!onGoing) {                                          
            bitte0 = wPferd2.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(wPferd2)[0];
            bitte2 = this.getZDFCo(wPferd2)[1] ; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false; 
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        wKoenig.setBounds(355,15,wKoenig.getWidth(),wKoenig.getWidth());
      } // end of if-else
    } // end of if  
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(wPferd2)[0];
        bitte2 = this.getZDFCo(wPferd2)[1] ; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false; 
      } // end of if
    } // end of if-else
  } // end of wPferd2_ActionPerformed
  
  public void wLaeufer2_ActionPerformed(ActionEvent evt) {  
    String piece = "wLaeufer2";
    if (wTurn) {
      if (wKoenig.isEnabled()) {
        if (this.bauernsearchw()) {
          int help = this.tausch(wLaeufer2, "w");
          ZDFeld[help][0] = piece;
          this.disablew();
        } // end of if
        else {
          this.feldBesetzt(piece, wLaeufer2);
          if (!onGoing) {                                          
            bitte0 = wLaeufer2.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(wLaeufer2)[0];
            bitte2 = this.getZDFCo(wLaeufer2)[1] ; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false; 
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        wKoenig.setBounds(355,15,wKoenig.getWidth(),wKoenig.getWidth());
      } // end of if-else
    } // end of if  
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(wLaeufer2)[0];
        bitte2 = this.getZDFCo(wLaeufer2)[1] ; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false; 
      } // end of if
    } // end of if-else
  } // end of wLaeufer2_ActionPerformed
  
  public void wKoenig_ActionPerformed(ActionEvent evt) {
    String piece = "wKoenig"; 
    if (wTurn) {
      this.feldBesetzt(piece, wKoenig);
      if (!onGoing) {                                          
        bitte0 = wKoenig.setCount(this); 
        onGoing = true;
      } // end of if    
      else {
        bitte1 = this.getZDFCo(wKoenig)[0];
        bitte2 = this.getZDFCo(wKoenig)[1] ; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if-else
    } // end of if
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(wKoenig)[0];
        bitte2 = this.getZDFCo(wKoenig)[1] ; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if
    } // end of if-else
  } // end of wKoenig_ActionPerformed
  
  public void wTurm2_ActionPerformed(ActionEvent evt) {  
    String piece = "wTurm2";
    if (wTurn) {
      if (wKoenig.isEnabled()) {
        if (this.bauernsearchw()) {
          int help = this.tausch(wTurm2, "w");
          ZDFeld[help][0] = piece;
          this.disablew();
        } // end of if
        else {
          this.feldBesetzt(piece, wTurm2);
          if (!onGoing) {                                          
            bitte0 = wTurm2.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(wTurm2)[0];
            bitte2 = this.getZDFCo(wTurm2)[1] ; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false; 
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        wKoenig.setBounds(355,15,wKoenig.getWidth(),wKoenig.getWidth());
      } // end of if-else
    } // end of if
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(wTurm2)[0];
        bitte2 = this.getZDFCo(wTurm2)[1] ; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if
    } // end of if-else
  } // end of wTurm2_ActionPerformed
  
  public void wBauer2_ActionPerformed(ActionEvent evt) {
    String piece = "wBauer2";
    if (wTurn) {
      if (wKoenig.isEnabled()) {
        if (this.bauernsearchw()) {
          int help = this.tausch(wBauer2, "w");
          ZDFeld[help][0] = piece;
          this.disablew();
        } // end of if
        else {
          this.feldBesetzt(piece, wBauer2);
          if (!onGoing) {                                          
            bitte0 = wBauer2.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(wBauer2)[0];
            bitte2 = this.getZDFCo(wBauer2)[1] ; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false;
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        wKoenig.setBounds(355,15,wKoenig.getWidth(),wKoenig.getWidth());
      } // end of if-else
    } // end of if  
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(wBauer2)[0];
        bitte2 = this.getZDFCo(wBauer2)[1] ; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if
    } // end of if-else
  } // end of wBauer2_ActionPerformed
  
  public void wBauer1_ActionPerformed(ActionEvent evt) {
    String piece = "wBauer1";
    if (wTurn) {
      if (wKoenig.isEnabled()) {
        if (this.bauernsearchw()) {
          int help = this.tausch(wBauer1, "w");
          ZDFeld[help][0] = piece;
          this.disablew();
        } // end of if
        else {
          this.feldBesetzt(piece, wBauer1);
          if (!onGoing) {                                          
            bitte0 = wBauer1.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(wBauer1)[0];
            bitte2 = this.getZDFCo(wBauer1)[1] ; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false; 
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        wKoenig.setBounds(355,15,wKoenig.getWidth(),wKoenig.getWidth());
      } // end of if-else
    } // end of if 
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(wBauer1)[0];
        bitte2 = this.getZDFCo(wBauer1)[1] ; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if
    } // end of if-else
  } // end of wBauer1_ActionPerformed
  
  public void wBauer3_ActionPerformed(ActionEvent evt) {
    String piece = "wBauer3";
    if (wTurn) {
      if (wKoenig.isEnabled()) {
        if (this.bauernsearchw()) {
          int help = this.tausch(wBauer3, "w");
          ZDFeld[help][0] = piece;
          this.disablew();
        } // end of if
        else {
          this.feldBesetzt(piece, wBauer3);
          if (!onGoing) {                                          
            bitte0 = wBauer3.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(wBauer3)[0];
            bitte2 = this.getZDFCo(wBauer3)[1] ; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false; 
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        wKoenig.setBounds(355,15,wKoenig.getWidth(),wKoenig.getWidth());
      } // end of if-else
    } // end of if  
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(wBauer3)[0];
        bitte2 = this.getZDFCo(wBauer3)[1] ; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if
    } // end of if-else
  } // end of wBauer3_ActionPerformed
  
  public void wBauer4_ActionPerformed(ActionEvent evt) {
    String piece = "wBauer4";
    if (wTurn) {
      if (wKoenig.isEnabled()) {
        if (this.bauernsearchw()) {
          int help = this.tausch(wBauer4, "w");
          ZDFeld[help][0] = piece;
          this.disablew();
        } // end of if
        else {
          this.feldBesetzt(piece, wBauer4);
          if (!onGoing) {                                          
            bitte0 = wBauer4.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(wBauer4)[0];
            bitte2 = this.getZDFCo(wBauer4)[1] ; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false;
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        wKoenig.setBounds(355,15,wKoenig.getWidth(),wKoenig.getWidth());
      } // end of if-else
    } // end of if
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(wBauer4)[0];
        bitte2 = this.getZDFCo(wBauer4)[1] ; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if
    } // end of if-else
  } // end of wBauer4_ActionPerformed
  
  public void wBauer7_ActionPerformed(ActionEvent evt) {
    String piece = "wBauer7";
    if (wTurn) {
      if (wKoenig.isEnabled()) {
        if (this.bauernsearchw()) {
          int help = this.tausch(wBauer7, "w");
          ZDFeld[help][0] = piece;
          this.disablew();
        } // end of if
        else {
          this.feldBesetzt(piece, wBauer7);
          if (!onGoing) {                                          
            bitte0 = wBauer7.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(wBauer7)[0];
            bitte2 = this.getZDFCo(wBauer7)[1] ; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false; 
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        wKoenig.setBounds(355,15,wKoenig.getWidth(),wKoenig.getWidth());
      } // end of if-else
    } // end of if  
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(wBauer7)[0];
        bitte2 = this.getZDFCo(wBauer7)[1] ; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false; 
      } // end of if
    } // end of if-else
  } // end of wBauer7_ActionPerformed
  
  public void wBauer6_ActionPerformed(ActionEvent evt) {
    String piece = "wBauer6";
    if (wTurn) {
      if (wKoenig.isEnabled()) {
        if (this.bauernsearchw()) {
          int help = this.tausch(wBauer6, "w");
          ZDFeld[help][0] = piece;
          this.disablew();
        } // end of if
        else {
          this.feldBesetzt(piece, wBauer6);
          if (!onGoing) {                                          
            bitte0 = wBauer6.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(wBauer6)[0];
            bitte2 = this.getZDFCo(wBauer6)[1] ; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false;
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        wKoenig.setBounds(355,15,wKoenig.getWidth(),wKoenig.getWidth());
      } // end of if-else
    } // end of if  
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(wBauer6)[0];
        bitte2 = this.getZDFCo(wBauer6)[1] ; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if
    } // end of if-else
  } // end of wBauer6_ActionPerformed
  
  public void wBauer5_ActionPerformed(ActionEvent evt) {
    String piece = "wBauer5";
    if (wTurn) {
      if (wKoenig.isEnabled()) {
        if (this.bauernsearchw()) {
          int help = this.tausch(wBauer5, "w");
          ZDFeld[help][0] = piece;
          this.disablew();
        } // end of if
        else {
          this.feldBesetzt(piece, wBauer5);
          if (!onGoing) {                                          
            bitte0 = wBauer5.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(wBauer5)[0];
            bitte2 = this.getZDFCo(wBauer5)[1] ; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false; 
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        wKoenig.setBounds(355,15,wKoenig.getWidth(),wKoenig.getWidth());
      } // end of if-else
    } // end of if  
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(wBauer5)[0];
        bitte2 = this.getZDFCo(wBauer5)[1] ; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if
    } // end of if-else
  } // end of wBauer5_ActionPerformed
  
  public void wBauer8_ActionPerformed(ActionEvent evt) {
    String piece = "wBauer8";
    if (wTurn) {
      if (wKoenig.isEnabled()) {
        if (this.bauernsearchw()) {
          int help = this.tausch(wBauer8, "w");
          ZDFeld[help][0] = piece;
          this.disablew();
        } // end of if
        else {
          this.feldBesetzt(piece, wBauer8);
          if (!onGoing) {                                          
            bitte0 = wBauer8.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(wBauer8)[0];
            bitte2 = this.getZDFCo(wBauer8)[1] ; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false;
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        wKoenig.setBounds(355,15,wKoenig.getWidth(),wKoenig.getWidth());
      } // end of if-else
    } // end of if  
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(wBauer8)[0];
        bitte2 = this.getZDFCo(wBauer8)[1] ; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if
    } // end of if-else
  } // end of wBauer8_ActionPerformed
  
  public void sBauer2_ActionPerformed(ActionEvent evt) {
    String piece = "sBauer2";
    if (!wTurn) {
      if (sDame.isEnabled()) {
        if (this.bauernsearchs()) {
          int help = this.tausch(sBauer2, "s");
          ZDFeld[help][0] = piece;
          this.disables();
        } // end of if
        else {
          this.feldBesetzt(piece, sBauer2);
          if (!onGoing) {                                          
            bitte0 = sBauer2.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(sBauer2)[0];
            bitte2 = this.getZDFCo(sBauer2)[1] ; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false; 
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        sDame.setBounds(355,15,sDame.getWidth(),sDame.getWidth());
      } // end of if-else
    } // end of if
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(sBauer2)[0];
        bitte2 = this.getZDFCo(sBauer2)[1] ; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false; 
      } // end of if
    } // end of if-else
  } // end of sBauer2_ActionPerformed
  
  public void sBauer1_ActionPerformed(ActionEvent evt) {  
    String piece = "sBauer1";
    if (!wTurn) {
      if (sDame.isEnabled()) {
        if (this.bauernsearchs()) {
          int help = this.tausch(sBauer1, "s");
          ZDFeld[help][0] = piece;
          this.disables();
        } // end of if
        else {
          this.feldBesetzt(piece, sBauer1);
          if (!onGoing) {                                          
            bitte0 = sBauer1.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(sBauer1)[0];
            bitte2 = this.getZDFCo(sBauer1)[1] ; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false; 
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        sDame.setBounds(355,15,sDame.getWidth(),sDame.getWidth());
      } // end of if-else
    } // end of if
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(sBauer1)[0];
        bitte2 = this.getZDFCo(sBauer1)[1] ; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if
    } // end of if-else
  } // end of sBauer1_ActionPerformed
  
  public void sBauer3_ActionPerformed(ActionEvent evt) {    
    String piece = "sBauer3";
    if (!wTurn) {
      if (sDame.isEnabled()) {
        if (this.bauernsearchs()) {
          int help = this.tausch(sBauer3, "s");
          ZDFeld[help][0] = piece;
          this.disables();
        } // end of if
        else {
          this.feldBesetzt(piece, sBauer3);
          if (!onGoing) {                                          
            bitte0 = sBauer3.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(sBauer3)[0];
            bitte2 = this.getZDFCo(sBauer3)[1] ; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false;
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        sDame.setBounds(355,15,sDame.getWidth(),sDame.getWidth());
      } // end of if-else
    } // end of if
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(sBauer3)[0];
        bitte2 = this.getZDFCo(sBauer3)[1] ; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if
    } // end of if-else
  } // end of sBauer3_ActionPerformed
  
  public void sBauer4_ActionPerformed(ActionEvent evt) {  
    String piece = "sBauer4";
    if (!wTurn) {
      if (sDame.isEnabled()) {
        if (this.bauernsearchs()) {
          int help = this.tausch(sBauer4, "s");
          ZDFeld[help][0] = piece;
          this.disables();
        } // end of if
        else {
          this.feldBesetzt(piece, sBauer4);
          if (!onGoing) {                                          
            bitte0 = sBauer4.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(sBauer4)[0];
            bitte2 = this.getZDFCo(sBauer4)[1] ; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false;
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        sDame.setBounds(355,15,sDame.getWidth(),sDame.getWidth());
      } // end of if-else
    } // end of if
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(sBauer4)[0];
        bitte2 = this.getZDFCo(sBauer4)[1] ; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if
    } // end of if-else
  } // end of sBauer4_ActionPerformed
  
  public void sBauer7_ActionPerformed(ActionEvent evt) {   
    String piece = "sBauer7";
    if (!wTurn) {
      if (sDame.isEnabled()) {
        if (this.bauernsearchs()) {
          int help = this.tausch(sBauer7, "s");
          ZDFeld[help][0] = piece;
          this.disables();
        } // end of if
        else {
          this.feldBesetzt(piece, sBauer7);
          if (!onGoing) {                                          
            bitte0 = sBauer7.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(sBauer7)[0];
            bitte2 = this.getZDFCo(sBauer7)[1]; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false;
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        sDame.setBounds(355,15,sDame.getWidth(),sDame.getWidth());
      } // end of if-else
    } // end of if
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(sBauer7)[0];
        bitte2 = this.getZDFCo(sBauer7)[1]; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if
    } // end of if-else
  } // end of sBauer7_ActionPerformed
  
  public void sBauer6_ActionPerformed(ActionEvent evt) {   
    String piece = "sBauer6";
    if (!wTurn) {
      if (sDame.isEnabled()) {
        if (this.bauernsearchs()) {
          int help = this.tausch(sBauer6, "s");
          ZDFeld[help][0] = piece;
          this.disables();
        } // end of if
        else {
          this.feldBesetzt(piece, sBauer6);
          if (!onGoing) {                                          
            bitte0 = sBauer6.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(sBauer6)[0];
            bitte2 = this.getZDFCo(sBauer6)[1]; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false; 
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        sDame.setBounds(355,15,sDame.getWidth(),sDame.getWidth());
      } // end of if-else
    } // end of if
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(sBauer6)[0];
        bitte2 = this.getZDFCo(sBauer6)[1]; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false; 
      } // end of if
    } // end of if-else
  } // end of sBauer6_ActionPerformed
  
  public void sBauer5_ActionPerformed(ActionEvent evt) {    
    String piece = "sBauer5";
    if (!wTurn) {
      if (sDame.isEnabled()) {
        if (this.bauernsearchs()) {
          int help = this.tausch(sBauer5, "s");
          ZDFeld[help][0] = piece;
          this.disables();
        } // end of if
        else {
          this.feldBesetzt(piece, sBauer5);
          if (!onGoing) {                                          
            bitte0 = sBauer5.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(sBauer5)[0];
            bitte2 = this.getZDFCo(sBauer5)[1]; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false;
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        sDame.setBounds(355,15,sDame.getWidth(),sDame.getWidth());
      } // end of if-else
    } // end of if
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(sBauer5)[0];
        bitte2 = this.getZDFCo(sBauer5)[1]; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if
    } // end of if-else
  } // end of sBauer5_ActionPerformed
  
  public void sBauer8_ActionPerformed(ActionEvent evt) {     
    String piece = "sBauer8";
    if (!wTurn) {
      if (sDame.isEnabled()) {
        if (this.bauernsearchs()) {
          int help = this.tausch(sBauer8, "s");
          ZDFeld[help][0] = piece;
          this.disables();
        } // end of if
        else {
          this.feldBesetzt(piece, sBauer8);
          if (!onGoing) {                                          
            bitte0 = sBauer8.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(sBauer8)[0];
            bitte2 = this.getZDFCo(sBauer8)[1]; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false; 
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        sDame.setBounds(355,15,sDame.getWidth(),sDame.getWidth());
      } // end of if-else
    } // end of if
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(sBauer8)[0];
        bitte2 = this.getZDFCo(sBauer8)[1]; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if
    } // end of if-else
  } // end of sBauer8_ActionPerformed
  
  public void sPferd1_ActionPerformed(ActionEvent evt) {  
    String piece = "sPferd1";
    if (!wTurn) {
      if (sDame.isEnabled()) {
        if (this.bauernsearchs()) {
          int help = this.tausch(sPferd1, "s");
          ZDFeld[help][0] = piece;
          this.disables();
        } // end of if
        else {
          this.feldBesetzt(piece, sPferd1);
          if (!onGoing) {                                          
            bitte0 = sPferd1.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(sPferd1)[0];
            bitte2 = this.getZDFCo(sPferd1)[1]; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false; 
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        sDame.setBounds(355,15,sDame.getWidth(),sDame.getWidth());
      } // end of if-else
    } // end of if
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(sPferd1)[0];
        bitte2 = this.getZDFCo(sPferd1)[1]; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false; 
      } // end of if
    } // end of if-else
  } // end of sPferd1_ActionPerformed
  
  public void sTurm1_ActionPerformed(ActionEvent evt) {   
    String piece = "sTurm1";
    if (!wTurn) {
      if (sDame.isEnabled()) {
        if (this.bauernsearchs()) {
          int help = this.tausch(sTurm1, "s");
          ZDFeld[help][0] = piece;
          this.disables();
        } // end of if
        else {
          this.feldBesetzt(piece, sTurm1);
          if (!onGoing) {                                          
            bitte0 = sTurm1.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(sTurm1)[0];
            bitte2 = this.getZDFCo(sTurm1)[1]; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false; 
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        sDame.setBounds(355,15, sDame.getWidth(),sDame.getWidth());
      } // end of if-else
    } // end of if
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(sTurm1)[0];
        bitte2 = this.getZDFCo(sTurm1)[1]; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if
    } // end of if-else
  } // end of sTurm1_ActionPerformed
  
  public void sLaeufer1_ActionPerformed(ActionEvent evt) {   
    String piece = "sLaeufer1";
    if (!wTurn) {
      if (sDame.isEnabled()) {
        if (this.bauernsearchs()) {
          int help = this.tausch(sLaeufer1, "s");
          ZDFeld[help][0] = piece;
          this.disables();
        } // end of if
        else {
          this.feldBesetzt(piece, sLaeufer1);
          if (!onGoing) {                                          
            bitte0 = sLaeufer1.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(sLaeufer1)[0];
            bitte2 = this.getZDFCo(sLaeufer1)[1]; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false;
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        sDame.setBounds(355,15, sDame.getWidth(),sDame.getWidth());
      } // end of if-else
    } // end of if 
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(sLaeufer1)[0];
        bitte2 = this.getZDFCo(sLaeufer1)[1]; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if
    } // end of if-else
  } // end of sLaeufer1_ActionPerformed
  
  public void sDame_ActionPerformed(ActionEvent evt) {      
    String piece = "sKoenig"; 
    if (!wTurn) {
      this.feldBesetzt(piece, sDame);
      if (!onGoing) {                                          
        bitte0 = sDame.setCount(this); 
        onGoing = true;
      } // end of if
      else {
        bitte1 = this.getZDFCo(sDame)[0];
        bitte2 = this.getZDFCo(sDame)[1]; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if-else
    } // end of if
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(sDame)[0];
        bitte2 = this.getZDFCo(sDame)[1]; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if
    } // end of if-else
  } // end of sDame_ActionPerformed
  
  public void sLaeufer2_ActionPerformed(ActionEvent evt) { 
    String piece = "sLaeufer2";
    if (!wTurn) {
      if (sDame.isEnabled()) {
        if (this.bauernsearchs()) {
          int help = this.tausch(sLaeufer2, "s");
          ZDFeld[help][0] = piece;
          this.disables();
        } // end of if
        else {
          this.feldBesetzt(piece, sLaeufer2);
          if (!onGoing) {                                          
            bitte0 = sLaeufer2.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(sLaeufer2)[0];
            bitte2 = this.getZDFCo(sLaeufer2)[1]; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false;
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        sDame.setBounds(355,15, sDame.getWidth(),sDame.getWidth());
      } // end of if-else
    } // end of if
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(sLaeufer2)[0];
        bitte2 = this.getZDFCo(sLaeufer2)[1]; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if
    } // end of if-else
  } // end of sLaeufer2_ActionPerformed
  
  public void sPferd2_ActionPerformed(ActionEvent evt) { 
    String piece = "sPferd2";
    if (!wTurn) {
      if (sDame.isEnabled()) {
        if (this.bauernsearchs()) {
          int help = this.tausch(sPferd2, "s");
          ZDFeld[help][0] = piece;
          this.disables();
        } // end of if
        else {
          this.feldBesetzt(piece, sPferd2);
          if (!onGoing) {                                          
            bitte0 = sPferd2.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(sPferd2)[0];
            bitte2 = this.getZDFCo(sPferd2)[1]; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false;
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        sDame.setBounds(355,15, sDame.getWidth(),sDame.getWidth());
      } // end of if-else
    } // end of if
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(sPferd2)[0];
        bitte2 = this.getZDFCo(sPferd2)[1]; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if
    } // end of if-else
  } // end of sPferd2_ActionPerformed
  
  public void sKoenig_ActionPerformed(ActionEvent evt) {
    String piece = "sDame";
    if (!wTurn) {
      if (sDame.isEnabled()) {
        if (this.bauernsearchs()) {
          int help = this.tausch(sKoenig, "s");
          ZDFeld[help][0] = piece;
          this.disables();
        } // end of if
        else {
          this.feldBesetzt(piece, sKoenig);
          if (!onGoing) {                                          
            bitte0 = sKoenig.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(sKoenig)[0];
            bitte2 = this.getZDFCo(sKoenig)[1]; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false; 
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        sDame.setBounds(355,15, sDame.getWidth(),sDame.getWidth());
      } // end of if-else
    } // end of if
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(sKoenig)[0];
        bitte2 = this.getZDFCo(sKoenig)[1]; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false; 
      } // end of if
    } // end of if-else
  } // end of sKoenig_ActionPerformed
  
  public void sTurm2_ActionPerformed(ActionEvent evt) {   
    String piece = "sTurm2";
    if (!wTurn) {
      if (sDame.isEnabled()) {
        if (this.bauernsearchs()) {
          int help = this.tausch(sTurm2, "s");
          ZDFeld[help][0] = piece;
          this.disables();
        } // end of if
        else {
          this.feldBesetzt(piece, sTurm2);
          if (!onGoing) {                                          
            bitte0 = sTurm2.setCount(this); 
            onGoing = true;
          } // end of if
          else {
            bitte1 = this.getZDFCo(sTurm2)[0];
            bitte2 = this.getZDFCo(sTurm2)[1]; 
            this.sub1(bitte0); 
            bitte0 = 0; 
            onGoing = false; 
          } // end of if-else
        } // end of if-else  
      } // end of if
      else {
        sDame.setBounds(355,15,sDame.getWidth(),sDame.getWidth());
      } // end of if-else
    } // end of if
    else {
      if (onGoing) {
        bitte1 = this.getZDFCo(sTurm2)[0];
        bitte2 = this.getZDFCo(sTurm2)[1]; 
        this.sub1(bitte0); 
        bitte0 = 0; 
        onGoing = false;
      } // end of if
    } // end of if-else
  } // end of sTurm2_ActionPerformed
  
  /* Unsere Methoden */ 
  
  public void toColour(JButton knopf, String farbe) {     
    if (farbe.equals("BLACK")) {
      knopf.setBackground(Color.BLACK);
    } // end of if
    if (farbe.equals("WHITE")) {        
      knopf.setBackground(Color.WHITE);
    } // end of if
    if (farbe.equals("YELLOW")) {
      knopf.setBackground(Color.YELLOW); 
    } // end of if
  }
  
  public int[] guiSmoothing(int x, int y) {    
    int[] feld = new int[2];          
    for (int i = 216; i + 40 < x; i += 40) {
      feld[0]++; 
    } // end of for
    for (int i = 138; i + 40 < y; i += 40) {               // nicht 112, da wir mit Cursorspitze arbeiten
      feld[1]++; 
    } // end of for    
    return feld; 
  }
  
  public int[] getZDFCo(Component c) {
    int[] wurst = new int[2]; 
    int x = c.getX();                    
    int y = c.getY(); 
    if (x < 216 || y < 112) {
      wurst[0] = -1; 
      wurst[1] = -1; 
    } // end of if
    else {
      for (int i = 216; i < x; i += 40) {
        wurst[0]++; 
      } // end of for
      for (int i = 112; i < y; i += 40) {
        wurst[1]++; 
      } // end of for 
    } // end of if-else
    return wurst; 
  }
  
  public void moveLowerPiece(JButtonBesser knopf) {                       //FERTIG
    int x = 0; int y = 0;                               // x ^= Mehrere Kompenten �bereinander
    // y, da Kn�pfe die unterste Schicht sind
    for (int i = 0; i < this.getContentPane().getComponentCount(); i++) {       // L�uft alle Komponenten des Schachbretts ab              
      if (!this.getContentPane().getComponent(i).equals(knopf) && this.getContentPane().getComponent(i).getBounds().equals(knopf.getBounds())) { // Pr�ft, ob Komponente i UNTER knopf liegt
        x++; 
        if (x != 2) {                                   // setzt y als unterste Komponente (im true Fall: Knopf) 
          y = i; 
        } // end of if
      } // end of if  
      if (x == 2) {                                    // Wenn zwei Komponenten unter der bewegten Figur liegen, wird der untere Knopf bewegt 
        int grabBesetzt = 0;                             
        int hilfe0; 
        int hilfe1 = 72;      
        if (this.getContentPane().getComponent(y).getName().startsWith("s")) {
          hilfe0 = 1; 
          hilfe1 += 520;                   
        }
        else {
          hilfe0 = 0; 
        } // end of if-else                               // Differenz der x-Koordinaten der Friedh�fe
        int hilfe2 = 80 + friedhof[hilfe0] * 48;
        if (hilfe0 == 0) {                          //der kack ist nicht symetrisch ihr dummies
          if (friedhof[hilfe0] > 6) {               //7
            hilfe1 += 48; 
            hilfe2 -= 336;                          //384
          } // end of if 
        } // end of if
        else {
          if (friedhof[hilfe0] > 7) {               
            hilfe1 += 48; 
            hilfe2 -= 384;                         
          } // end of if 
        } // end of if-else
        this.getContentPane().getComponent(y).setBounds(hilfe1, hilfe2, this.getContentPane().getComponent(y).getWidth(), this.getContentPane().getComponent(y).getHeight()); 
        this.unsichtbar(y);
        friedhof[hilfe0]++; 
        this.getContentPane().getComponent(y).setVisible(true);                                                
        this.getContentPane().getComponent(y).setEnabled(false);                                                       
        i = this.getContentPane().getComponentCount(); 
      } // end of if 
    } // end of for 
  }
  
  public void unsichtbar(int k) {
    if (jLabel1.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel1.setVisible(false);
    } // end of if
    if (jLabel2.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel2.setVisible(false);
    } // end of if
    if (jLabel3.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel3.setVisible(false);
    } // end of if
    if (jLabel4.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel4.setVisible(false);
    } // end of if
    if (jLabel5.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel5.setVisible(false);
    } // end of if
    if (jLabel6.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel6.setVisible(false);
    } // end of if
    if (jLabel7.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel7.setVisible(false);
    } // end of if
    if (jLabel8.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel8.setVisible(false);
    } // end of if
    if (jLabel9.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel9.setVisible(false);
    } // end of if
    if (jLabel10.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel10.setVisible(false);
    } // end of if
    if (jLabel11.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel11.setVisible(false);
    } // end of if
    if (jLabel12.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel12.setVisible(false);
    } // end of if
    if (jLabel13.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel13.setVisible(false);
    } // end of if
    if (jLabel14.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel14.setVisible(false);
    } // end of if
    if (jLabel15.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel15.setVisible(false);
    } // end of if
    if (jLabel16.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel16.setVisible(false);
    } // end of if
    if (jLabel17.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel17.setVisible(false);
    } // end of if
    if (jLabel18.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel18.setVisible(false);
    } // end of if
    if (jLabel19.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel19.setVisible(false);
    } // end of if
    if (jLabel20.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel20.setVisible(false);
    } // end of if
    if (jLabel21.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel21.setVisible(false);
    } // end of if
    if (jLabel22.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel22.setVisible(false);
    } // end of if
    if (jLabel23.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel23.setVisible(false);
    } // end of if
    if (jLabel24.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel24.setVisible(false);
    } // end of if
    if (jLabel25.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel25.setVisible(false);
    } // end of if
    if (jLabel26.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel26.setVisible(false);
    } // end of if
    if (jLabel27.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel27.setVisible(false);
    } // end of if
    if (jLabel28.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel28.setVisible(false);
    } // end of if
    if (jLabel29.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel29.setVisible(false);
    } // end of if
    if (jLabel30.getLocation().equals(this.getContentPane().getComponent(k).getLocation())) {
      jLabel30.setVisible(false);
    } // end of if
  }
  
  public int[] currentMouse(MouseEvent evt) {
    int[] wurst = new int[2]; 
    wurst = this.guiSmoothing(evt.getX(), evt.getY()); 
    return wurst; 
  }
  
  public void schachbrett_MouseClicked(MouseEvent evt) {  
    bitte1 = this.currentMouse(evt)[0];
    bitte2 = this.currentMouse(evt)[1]; 
    this.sub1(bitte0);
    bitte0 = 0; 
  } // end of schachbrett_MouseClicked
  
  public void illuminate(int[][] feld) {
    for (int i = 0; i < this.getContentPane().getComponentCount(); i++) {
      if (this.getContentPane().getComponent(i) instanceof JLabel) {
        if (this.getZDFCo(this.getContentPane().getComponent(i))[0]<8&&this.getZDFCo(this.getContentPane().getComponent(i))[0]>=0&&this.getZDFCo(this.getContentPane().getComponent(i))[1]<8&&this.getZDFCo(this.getContentPane().getComponent(i))[1]>=0) {  
          if (bewegen[this.getZDFCo(this.getContentPane().getComponent(i))[0]][this.getZDFCo(this.getContentPane().getComponent(i))[1]] == 1) {  
            this.getContentPane().getComponent(i).setBackground(Color.yellow);
          } // end of if
        } // end of if
      } // end of if
    } // end of for
  }
  // wei� jLabel1-15    schwarz jLabel16-20
  
  public void normal() {
    A1.setBackground(new Color(0xFF8040)); 
    A2.setBackground(new Color(0x804000)); 
    A3.setBackground(new Color(0xFF8040)); 
    A4.setBackground(new Color(0x804000));
    A5.setBackground(new Color(0xFF8040)); 
    A6.setBackground(new Color(0x804000));
    A7.setBackground(new Color(0xFF8040)); 
    A8.setBackground(new Color(0x804000)); 
    B1.setBackground(new Color(0x804000));
    B2.setBackground(new Color(0xFF8040));
    B3.setBackground(new Color(0x804000));
    B4.setBackground(new Color(0xFF8040));
    B5.setBackground(new Color(0x804000));
    B6.setBackground(new Color(0xFF8040));
    B7.setBackground(new Color(0x804000));
    B8.setBackground(new Color(0xFF8040));
    C1.setBackground(new Color(0xFF8040)); 
    C2.setBackground(new Color(0x804000)); 
    C3.setBackground(new Color(0xFF8040)); 
    C4.setBackground(new Color(0x804000));
    C5.setBackground(new Color(0xFF8040)); 
    C6.setBackground(new Color(0x804000));
    C7.setBackground(new Color(0xFF8040)); 
    C8.setBackground(new Color(0x804000)); 
    D1.setBackground(new Color(0x804000));
    D2.setBackground(new Color(0xFF8040));
    D3.setBackground(new Color(0x804000));
    D4.setBackground(new Color(0xFF8040));
    D5.setBackground(new Color(0x804000));
    D6.setBackground(new Color(0xFF8040));
    D7.setBackground(new Color(0x804000));
    D8.setBackground(new Color(0xFF8040)); 
    E1.setBackground(new Color(0xFF8040)); 
    E2.setBackground(new Color(0x804000)); 
    E3.setBackground(new Color(0xFF8040)); 
    E4.setBackground(new Color(0x804000));
    E5.setBackground(new Color(0xFF8040)); 
    E6.setBackground(new Color(0x804000));
    E7.setBackground(new Color(0xFF8040)); 
    E8.setBackground(new Color(0x804000)); 
    F1.setBackground(new Color(0x804000));
    F2.setBackground(new Color(0xFF8040));
    F3.setBackground(new Color(0x804000));
    F4.setBackground(new Color(0xFF8040));
    F5.setBackground(new Color(0x804000));
    F6.setBackground(new Color(0xFF8040));
    F7.setBackground(new Color(0x804000));
    F8.setBackground(new Color(0xFF8040)); 
    G1.setBackground(new Color(0xFF8040)); 
    G2.setBackground(new Color(0x804000)); 
    G3.setBackground(new Color(0xFF8040)); 
    G4.setBackground(new Color(0x804000));
    G5.setBackground(new Color(0xFF8040)); 
    G6.setBackground(new Color(0x804000));
    G7.setBackground(new Color(0xFF8040)); 
    G8.setBackground(new Color(0x804000)); 
    H1.setBackground(new Color(0x804000));
    H2.setBackground(new Color(0xFF8040));
    H3.setBackground(new Color(0x804000));
    H4.setBackground(new Color(0xFF8040));
    H5.setBackground(new Color(0x804000));
    H6.setBackground(new Color(0xFF8040));
    H7.setBackground(new Color(0x804000));
    H8.setBackground(new Color(0xFF8040));       
    wPferd1.setBounds(wPferd1.getX()+5000,wPferd1.getY(),wPferd1.getWidth(),wPferd1.getHeight());  
    wPferd1.setBounds(wPferd1.getX()-5000,wPferd1.getY(),wPferd1.getWidth(),wPferd1.getHeight());                                       
  } 
  
  public void iluminate(int[][] feld) {
    this.illuminate(feld); 
    wPferd1.setBounds(wPferd1.getX()+5000,wPferd1.getY(),wPferd1.getWidth(),wPferd1.getHeight());  
    wPferd1.setBounds(wPferd1.getX()-5000,wPferd1.getY(),wPferd1.getWidth(),wPferd1.getHeight()); 
  }          
  
  public void sub1(int subBitte0) { 
    switch (subBitte0) {
      case 67 :
      this.umsetzten(wTurm1);
      break;           
      case 66 : 
      this.umsetzten(wPferd1);     
      break;           
      case 68 : 
      this.umsetzten(wLaeufer);    
      break;           
      case 69 :  
      this.umsetzten(wDame);
      break;           
      case 72 : 
      this.umsetzten(wKoenig);  
      break;           
      case 71 : 
      this.umsetzten(wLaeufer2); 
      break;           
      case 70 : 
      this.umsetzten(wPferd2);   
      break;           
      case 73 : 
      this.umsetzten(wTurm2);     
      break;           
      case 75 : 
      this.umsetzten(wBauer1);   
      break;           
      case 74 : 
      this.umsetzten(wBauer2);    
      break;           
      case 76 :  
      this.umsetzten(wBauer3);  
      break;           
      case 77 : 
      this.umsetzten(wBauer4); 
      break;           
      case 80 : 
      this.umsetzten(wBauer5);    
      break;           
      case 79 :   
      this.umsetzten(wBauer6);  
      break;           
      case 78 :  
      this.umsetzten(wBauer7);  
      break;           
      case 81 :  
      this.umsetzten(wBauer8);    
      break;       
      case 91 : 
      this.umsetzten(sTurm1);
      break;           
      case 90 : 
      this.umsetzten(sPferd1);    
      break;           
      case 92 :   
      this.umsetzten(sLaeufer1);  
      break;           
      case 93 : 
      this.umsetzten(sDame);
      break;           
      case 96 :  
      this.umsetzten(sKoenig);  
      break;           
      case 94 :    
      this.umsetzten(sLaeufer2);
      break;           
      case 95 :  
      this.umsetzten(sPferd2);  
      break;           
      case 97 :  
      this.umsetzten(sTurm2);   
      break;           
      case 83 : 
      this.umsetzten(sBauer1);         
      break;           
      case 82 :  
      this.umsetzten(sBauer2);           
      break;           
      case 84 :   
      this.umsetzten(sBauer3);    
      break;           
      case 85 : 
      this.umsetzten(sBauer4);    
      break;           
      case 88 : 
      this.umsetzten(sBauer5);        
      break;           
      case 87 : 
      this.umsetzten(sBauer6);        
      break;           
      case 86 : 
      this.umsetzten(sBauer7);       
      break;           
      case 89 : 
      this.umsetzten(sBauer8);         
      break;         
      default: 
      
    } // end of switch*/
    this.normal();
  }
  
  public void umsetzten(JButtonBesser b) {
    switch (bitte1) {
      case 0 : 
      switch (bitte2) {
        case 0 : 
        if (A1.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 1 : 
        if (A2.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 2 : 
        if (A3.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 3 : 
        if (A4.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b); 
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 4 : 
        if (A5.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b); 
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 5 : 
        if (A6.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 6 : 
        if (A7.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b); 
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 7 : 
        if (A8.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        default: 
        
      } // end of switch
      break;
      case 1 : 
      switch (bitte2) {
        case 0 : 
        if (B1.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 1 : 
        if (B2.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 2 : 
        if (B3.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 3 : 
        if (B4.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b); 
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 4 : 
        if (B5.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b); 
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 5 : 
        if (B6.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b); 
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 6 : 
        if (B7.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 7 : 
        if (B8.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        default: 
        
      } // end of switch
      break;
      case 2 : 
      switch (bitte2) {
        case 0 : 
        if (C1.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 1 : 
        if (C2.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 2 : 
        if (C3.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 3 : 
        if (C4.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 4 : 
        if (C5.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 5 : 
        if (C6.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 6 : 
        if (C7.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 7 : 
        if (C8.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        default: 
        
      } // end of switch
      break;
      case 3 : 
      switch (bitte2) {
        case 0 : 
        if (D1.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 1 : 
        if (D2.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 2 : 
        if (D3.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 3 : 
        if (D4.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 4 : 
        if (D5.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 5 : 
        if (D6.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 6 : 
        if (D7.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 7 : 
        if (D8.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        default: 
        
      } // end of switch
      break;  
      case 4 : 
      switch (bitte2) {
        case 0 : 
        if (E1.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 1 : 
        if (E2.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 2 : 
        if (E3.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 3 : 
        if (E4.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 4 : 
        if (E5.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 5 : 
        if (E6.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 6 : 
        if (E7.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 7 : 
        if (E8.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        default: 
        
      } // end of switch
      break;
      case 5 : 
      switch (bitte2) {
        case 0 : 
        if (F1.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 1 : 
        if (F2.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 2 : 
        if (F3.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 3 : 
        if (F4.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 4 : 
        if (F5.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 5 : 
        if (F6.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 6 : 
        if (F7.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 7 : 
        if (F8.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        default: 
        
      } // end of switch
      break;
      case 6 : 
      switch (bitte2) {
        case 0 : 
        if (G1.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 1 : 
        if (G2.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 2 : 
        if (G3.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 3 : 
        if (G4.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 4 : 
        if (G5.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 5 : 
        if (G6.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 6 : 
        if (G7.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 7 : 
        if (G8.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        default: 
        
      } // end of switch
      break;
      case 7 : 
      switch (bitte2) {
        case 0 : 
        if (H1.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 1 : 
        if (H2.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 2 : 
        if (H3.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 3 : 
        if (H4.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 4 : 
        if (H5.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 5 : 
        if (H6.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 6 : 
        if (H7.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        case 7 : 
        if (H8.getBackground().equals(Color.YELLOW)) {
          b.bewegungGUIZDF(ZDFeld, bitte1, bitte2);  
          this.moveLowerPiece(b);
          if (b.getName().startsWith("s")) {
            wTurn = true;
          } // end of if
          else {
            wTurn = false;
          } // end of if-else
        } // end of if
        break;
        default: 
        
      } // end of switch
      break;
      default: 
      
    } // end of switch
    this.normal();
    if (this.bauernsearchs()) {
      this.enables();
    } // end of if
    if (this.bauernsearchw()) {
      this.enablew();
    } // end of if
  }
  
  public void feldBesetzt(String piece, Component c) {            //FERTIG                 
    bewegen = new int[8][8];
    int posx = this.getZDFCo(c)[0];
    int posy = this.getZDFCo(c)[1];
    if (piece.endsWith("Turm1")||piece.endsWith("Turm2")) {
      turm(posx,posy);                                           //FERTIG
    } // end of if
    if (piece.endsWith("Laeufer1")||piece.endsWith("Laeufer2")||piece.endsWith("Laeufer")) {
      laeufer(posx,posy);                                        //FERTIG
    } // end of if
    if (piece.endsWith("Dame")) {
      dame(posx,posy);                                           //FERITG
    } // end of if
    if (piece.endsWith("Pferd1")||piece.endsWith("Pferd2")) {
      pferd(posx,posy);                                          //FERTIG
    } // end of if
    if (piece.endsWith("Koenig")) {
      koenig(posx,posy);                                         //FERTIG
    } // end of if
    if (piece.startsWith("wBauer")||piece.startsWith("sBauer")) {
      bauer(posx,posy, piece);                                   //FERTIG
    } // end of if
  } 
  
  public void koenig(int posx, int posy) {         //FERTIG
    int[] rueckgabe = new int[8];
    rueckgabe[0] = this.searchFigurxplusynull(posx,posy);
    rueckgabe[1] = this.searchFigurxplusypluskoenig(posx,posy);
    rueckgabe[2] = this.searchFigurxplusyminuskoenig(posx,posy);
    rueckgabe[3] = this.searchFigurxminusynull(posx,posy);
    rueckgabe[4] = this.searchFigurxminusypluskoenig(posx,posy);
    rueckgabe[5] = this.searchFigurxminusyminuskoenig(posx,posy);
    rueckgabe[6] = this.searchFigurxnullyplus(posx,posy);
    rueckgabe[7] = this.searchFigurxnullyminus(posx,posy);
    if (rueckgabe[0]==1&&koenigvoraussetzung(posx+1,posy,1)) {
      if (posx+1<8) {
        bewegen[posx+1][posy] = 1;
      } // end of if
    } // end of if
    if (rueckgabe[1]==1&&koenigvoraussetzung(posx+1,posy+1,2)) {
      if (posx+1<8&&posy+1<8) {
        bewegen[posx+1][posy+1] = 1;
      } // end of if
    } // end of if
    if (rueckgabe[2]==1&&koenigvoraussetzung(posx+1,posy-1,3)) {
      if (posx+1<8&&posy-1>-1) {
        bewegen[posx+1][posy-1] = 1;
      } // end of if
    } // end of if
    if (rueckgabe[3]==1&&koenigvoraussetzung(posx-1,posy,4)) {
      if (posx-1>-1) {
        bewegen[posx-1][posy] = 1;
      } // end of if
    } // end of if
    if (rueckgabe[4]==1&&koenigvoraussetzung(posx-1,posy+1,5)) {
      if (posx-1>-1&&posy+1<8) {
        bewegen[posx-1][posy+1] = 1;
      } // end of if
    } // end of if
    if (rueckgabe[5]==1&&koenigvoraussetzung(posx-1,posy-1,6)) {
      if (posx-1>-1&&posy-1>-1) {
        bewegen[posx-1][posy-1] = 1;
      } // end of if
    } // end of if
    if (rueckgabe[6]==1&&koenigvoraussetzung(posx,posy+1,7)) {
      if (posy+1<8) {
        bewegen[posx][posy+1] = 1;
      } // end of if
    } // end of if
    if (rueckgabe[7]==1&&koenigvoraussetzung(posx,posy-1,8)) {
      if (posy-1>-1) {
        bewegen[posx][posy-1] = 1;
      } // end of if
    } // end of if
    iluminate(bewegen);
  }
  
  public void bauer(int posx, int posy, String piece) {    //FERTIG
    if (figurFarbe(piece)=="w") {
      bauerweiss(posx, posy);
    } // end of if
    if (figurFarbe(piece)=="s") {
      bauerschwarz(posx, posy);
    } // end of if
  }
  
  public void bauerweiss(int posx, int posy) {           //ZEIGEN KEINE FARBE AN
    int[] rueckgabe = new int[3];
    rueckgabe[0]= this.searchFigurypluseins(posx, posy);
    rueckgabe[1]= this.searchFiguryplusxplus(posx, posy);
    rueckgabe[2]= this.searchFiguryplusxminus(posx, posy);
    if (rueckgabe[0]==1) {
      bewegen[posx][posy+1]=1;
    } // end of if
    if (rueckgabe[1]==1) {
      bewegen[posx+1][posy+1]=1;
    } // end of if
    if (rueckgabe[2]==1) {
      bewegen[posx-1][posy+1]=1;
    } // end of if
    if (rueckgabe[0]==1&&posy==1&&ZDFeld[posx][posy+2]==null) {
      bewegen[posx][posy+2]=1;
    } // end of if
    iluminate(bewegen);
  } 
  
  public void bauerschwarz(int posx, int posy) {        //FERTIG
    int[] rueckgabe = new int[3];
    rueckgabe[0]= this.searchFiguryminuseins(posx, posy);
    rueckgabe[1]= this.searchFiguryminusxplus(posx, posy);
    rueckgabe[2]= this.searchFiguryminusxminus(posx, posy);
    if (rueckgabe[0]==1) {
      bewegen[posx][posy-1]=1;
    } // end of if
    if (rueckgabe[1]==1) {
      bewegen[posx+1][posy-1]=1;
    } // end of if
    if (rueckgabe[2]==1) {
      bewegen[posx-1][posy-1]=1;
    } // end of if
    if (rueckgabe[0]==1&&posy==6&&ZDFeld[posx][posy-2]==null) {
      bewegen[posx][posy-2]=1;
    } // end of if
    iluminate(bewegen);
  } 
  
  public void pferd(int posx, int posy) {
    int[] rueckgabe = new int[8];
    rueckgabe[0] = this.searchFigurpluszweipluseins(posx, posy);
    rueckgabe[1] = this.searchFigurpluszweiminuseins(posx, posy);
    rueckgabe[2] = this.searchFigurminuszweipluseins(posx, posy);
    rueckgabe[3] = this.searchFigurminuszweiminuseins(posx, posy);
    rueckgabe[4] = this.searchFigurpluseinspluszwei(posx, posy);
    rueckgabe[5] = this.searchFigurpluseinsminuszwei(posx, posy);                                            
    rueckgabe[6] = this.searchFigurminuseinspluszwei(posx, posy);
    rueckgabe[7] = this.searchFigurminuseinsminuszwei(posx, posy);
    if (posx+2<8&&posy+1<8) {
      bewegen[posx+2][posy+1] = rueckgabe[0];
    } // end of if
    if (posx+2<8&&posy-1>-1) {
      bewegen[posx+2][posy-1] = rueckgabe[1];
    } // end of if
    if (posx-2>-1&&posy+1<8) {
      bewegen[posx-2][posy+1] = rueckgabe[2];
    } // end of if
    if (posx-2>-1&&posy-1>-1) {
      bewegen[posx-2][posy-1] = rueckgabe[3];
    } // end of if
    if (posx+1<8&&posy+2<8) {
      bewegen[posx+1][posy+2] = rueckgabe[4];
    } // end of if
    if (posx+1<8&&posy-2>-1) {
      bewegen[posx+1][posy-2] = rueckgabe[5];
    } // end of if
    if (posx-1>-1&&posy+2<8) {
      bewegen[posx-1][posy+2] = rueckgabe[6];
    } // end of if
    if (posx-1>-1&&posy-2>-1) {
      bewegen[posx-1][posy-2] = rueckgabe[7];
    } // end of if
    iluminate(bewegen);
  }
  
  public void dame(int posx, int posy) {            //FERTIG
    int[] rueckgabe = new int[8];
    rueckgabe[0] = this.searchFigurxplus(posx, posy);
    rueckgabe[1] = this.searchFigurxminus(posx, posy);
    rueckgabe[2] = this.searchFiguryplus(posx, posy);
    rueckgabe[3] = this.searchFiguryminus(posx, posy);
    rueckgabe[4] = this.searchFigurxplusyplus(posx, posy);
    rueckgabe[5] = this.searchFigurxplusyminus(posx, posy);
    rueckgabe[6] = this.searchFigurxminusyplus(posx, posy);
    rueckgabe[7] = this.searchFigurxminusyminus(posx, posy);
    for (int i = 0; rueckgabe[0]-i>0; i++) {
      bewegen[posx+rueckgabe[0]-i][posy] = 1;
    } // end of for
    for (int h = 0; rueckgabe[1]+h<0; h++) {
      bewegen[posx+rueckgabe[1]+h][posy] = 1;
    } // end of for
    for (int g = 0; rueckgabe[2]-g>0; g++) {
      bewegen[posx][posy+rueckgabe[2]-g] = 1;
    } // end of for
    for (int j = 0; rueckgabe[3]+j<0; j++) {
      bewegen[posx][posy+rueckgabe[3]+j] = 1;
    } // end of for
    if (rueckgabe[4]!=0) {
      for (int i = 0; rueckgabe[4]-i>0; i++) {
        bewegen[posx-i+rueckgabe[4]][posy-i+rueckgabe[4]] = 1;
      } // end of for
    } // end of if
    if (rueckgabe[5]!=0) {
      for (int h = 0; rueckgabe[5]-h>0&&h-rueckgabe[5]<0; h++) {
        bewegen[posx-h+rueckgabe[5]][posy+h-rueckgabe[5]] = 1;
      } // end of for
    } // end of if
    if (rueckgabe[6]!=0) {
      for (int g = 0; g-rueckgabe[6]<0&&rueckgabe[6]-g>0; g++) {
        bewegen[posx+g-rueckgabe[6]][posy-g+rueckgabe[6]] = 1;
      } // end of for
    } // end of if
    if (rueckgabe[7]!=0) {
      for (int j = 0; j-rueckgabe[7]<0; j++) {
        bewegen[posx+j-rueckgabe[7]][posy+j-rueckgabe[7]] = 1;
      } // end of for
    } // end of if
    iluminate(bewegen);
  }
  
  public void laeufer(int posx, int posy) {                 //FERTIG
    int[] rueckgabe = new int[4];
    rueckgabe[0] = this.searchFigurxplusyplus(posx, posy);
    rueckgabe[1] = this.searchFigurxplusyminus(posx, posy);
    rueckgabe[2] = this.searchFigurxminusyplus(posx, posy);
    rueckgabe[3] = this.searchFigurxminusyminus(posx, posy);
    if (rueckgabe[0]!=0) {
      for (int i = 0; rueckgabe[0]-i>0; i++) {
        bewegen[posx-i+rueckgabe[0]][posy-i+rueckgabe[0]] = 1;
      } // end of for
    } // end of if
    if (rueckgabe[1]!=0) {
      for (int h = 0; rueckgabe[1]-h>0&&h-rueckgabe[1]<0; h++) {
        bewegen[posx-h+rueckgabe[1]][posy+h-rueckgabe[1]] = 1;
      } // end of for
    } // end of if
    if (rueckgabe[2]!=0) {
      for (int g = 0; g-rueckgabe[2]<0&&rueckgabe[2]-g>0; g++) {
        bewegen[posx+g-rueckgabe[2]][posy-g+rueckgabe[2]] = 1;
      } // end of for
    } // end of if
    if (rueckgabe[3]!=0) {
      for (int j = 0; j-rueckgabe[3]<0; j++) {
        bewegen[posx+j-rueckgabe[3]][posy+j-rueckgabe[3]] = 1;
      } // end of for
    } // end of if
    iluminate(bewegen);
  }  
  
  public void turm(int posx, int posy) {              //FERTIG
    int[] rueckgabe = new int[4];
    rueckgabe[0] = this.searchFigurxplus(posx, posy);
    rueckgabe[1] = this.searchFigurxminus(posx, posy);
    rueckgabe[2] = this.searchFiguryplus(posx, posy);
    rueckgabe[3] = this.searchFiguryminus(posx, posy);
    for (int i = 0; rueckgabe[0]-i>0; i++) {
      bewegen[posx+rueckgabe[0]-i][posy] = 1;
    } // end of for
    for (int h = 0; rueckgabe[1]+h<0; h++) {
      bewegen[posx+rueckgabe[1]+h][posy] = 1;
    } // end of for
    for (int g = 0; rueckgabe[2]-g>0; g++) {
      bewegen[posx][posy+rueckgabe[2]-g] = 1;
    } // end of for
    for (int j = 0; rueckgabe[3]+j<0; j++) {
      bewegen[posx][posy+rueckgabe[3]+j] = 1;
    } // end of for
    iluminate(bewegen);
  }                               
  
  //Suchfunktionen f�r besetzte Felder
  
  //Anfang Bauer
  
  public int searchFigurypluseins(int x, int y) {
    String piece = ZDFeld [x][y];
    int a=0;
    if (y+1<8) {
      if (ZDFeld [x][y+1]!=null) {
        a = 0;
      } // end of if
      else {
        a = 1;
      } // end of if-else
    } // end of if
    return a;
  }
  
  public int searchFiguryminuseins(int x, int y) {
    String piece = ZDFeld [x][y];
    int a=0;
    if (y-1>-1) {
      if (ZDFeld [x][y-1]!=null) {
        a = 0;
      } // end of if
      else {
        a = 1;
      } // end of if-else
    } // end of if
    return a;
  }
  
  public int searchFiguryplusxplus(int x, int y) {
    String piece = ZDFeld [x] [y];
    int a=0;
    if (x+1<8&&y+1<8) {
      if (ZDFeld[x+1][y+1]==null) {
        a=0;      
      } // end of if
      if (ZDFeld[x+1][y+1]!=null) {
        if (ZDFeld[x+1][y+1].startsWith(figurFarbe(piece))) {
          a=0;
        } // end of if
        else{
          a=1;
        } // end of if     
      } // end of if
    } // end of if
    return a;
  }
  
  public int searchFiguryplusxminus(int x, int y) {
    String piece = ZDFeld [x] [y];
    int a=0;
    if (x-1>-1&&y+1<8) {
      if (ZDFeld[x-1][y+1]==null) {
        a=0;      
      } // end of if
      if (ZDFeld[x-1][y+1]!=null) {
        if (ZDFeld[x-1][y+1].startsWith(figurFarbe(piece))) {
          a=0;
        } // end of if
        else{
          a=1;
        } // end of if     
      } // end of if
    } // end of if
    return a;
  }
  
  public int searchFiguryminusxplus(int x, int y) {
    String piece = ZDFeld [x] [y];
    int a=0;
    if (x+1<8&&y-1>-1) {
      if (ZDFeld[x+1][y-1]==null) {
        a=0;      
      } // end of if
      if (ZDFeld[x+1][y-1]!=null) {
        if (ZDFeld[x+1][y-1].startsWith(figurFarbe(piece))) {
          a=0;
        } // end of if
        else{
          a=1;
        } // end of if     
      } // end of if
    } // end of if
    return a;
  }
  
  
  public int searchFiguryminusxminus(int x, int y) {
    String piece = ZDFeld [x] [y];
    int a=0;
    if (x-1>-1&&y-1>-1) {
      if (ZDFeld[x-1][y-1]==null) {
        a=0;      
      } // end of if
      if (ZDFeld[x-1][y-1]!=null) {
        if (ZDFeld[x-1][y-1].startsWith(figurFarbe(piece))) {
          a=0;
        } // end of if
        else{
          a=1;
        } // end of if     
      } // end of if
    } // end of if
    return a;
  }
  
  //Ende Bauer
  
  //Anfang Turm/Dame
  
  public int searchFigurxplus(int x,int y) {
    int a = 0;
    String piece = ZDFeld[x][y];
    for (int i = 1; i+x<8; i++) {
      if (ZDFeld[x+i][y]==null) {
        a++;
      } // end of if
      else {
        if (ZDFeld[x+i][y].startsWith(this.figurFarbe(piece))) {
          i = 8;
        } // end of if
        else {
          a++;
          i = 8;
        } // end of if-else
      } // end of if-else
    } // end of for
    return a;
  }
  
  public int searchFigurxminus(int x,int y) {
    int a = 0;
    String piece = ZDFeld[x][y];
    for (int i = 1; x-i>-1; i++) {
      if (ZDFeld[x-i][y]==null) {
        a--;
      } // end of if
      else {
        if (ZDFeld[x-i][y].startsWith(this.figurFarbe(piece))) {
          i = 8;
        } // end of if
        else {
          a--;
          i = 8;
        } // end of if-else
      } // end of if-else
    } // end of for
    return a;
  }
  
  public int searchFiguryplus(int x,int y) {
    int a = 0;
    String piece = ZDFeld[x][y];
    for (int i = 1; y+i<8; i++) {
      if (ZDFeld[x][y+i]==null) {
        a++;
      } // end of if
      else {
        if (ZDFeld[x][y+i].startsWith(this.figurFarbe(piece))) {
          i = 8;
        } // end of if
        else {
          a++;
          i = 8;
        } // end of if-else
      } // end of if-else
    } // end of for
    return a;
  }
  
  public int searchFiguryminus(int x,int y) {
    int a = 0;
    String piece = ZDFeld[x][y];
    for (int i = 1; y-i>-1; i++) {
      if (ZDFeld[x][y-i]==null) {
        a--;
      } // end of if
      else {
        if (ZDFeld[x][y-i].startsWith(this.figurFarbe(piece))) {
          i = 8;
        } // end of if
        else {
          a--;
          i = 8;
        } // end of if-else
      } // end of if-else
    } // end of for
    return a;
  }
  
  //Ende Turm
  
  //Anfang K�nig
  
  public boolean koenigvoraussetzung(int x, int y, int z) {
    int a = 0;
    if (x>-1&&x<8) {
      if (y+1<8) {
        if (ZDFeld[x][y+1]!=null&&ZDFeld[x][y+1].endsWith("Koenig")) {               
          a++;                                                                    
        } // end of if
      } // end of if
      if (y-1>-1) {
        if (ZDFeld[x][y-1]!=null&&ZDFeld[x][y-1].endsWith("Koenig")) {               
          a++;                                                                        
        } // end of if
      } // end of if
    } // end of if
    if (y>-1&&y<8) {
      if (x-1>-1) {
        if (ZDFeld[x-1][y]!=null&&ZDFeld[x-1][y].endsWith("Koenig")) {
          a++;
        } // end of if
      } // end of if
      if (x+1<8) {
        if (ZDFeld[x+1][y]!=null&&ZDFeld[x+1][y].endsWith("Koenig")) {
          a++;
        } // end of if
      } // end of if
    } // end of if
    if (x+1<8&&y+1<8) {
      if (ZDFeld[x+1][y+1]!=null&&ZDFeld[x+1][y+1].endsWith("Koenig")) {
        a++;
      } // end of if
    } // end of if
    if (x+1<8&&y-1>-1) {
      if (ZDFeld[x+1][y-1]!=null&&ZDFeld[x+1][y-1].endsWith("Koenig")) {
        a++;
      } // end of if
    } // end of if
    if (x-1>-1&&y+1<8) {
      if (ZDFeld[x-1][y+1]!=null&&ZDFeld[x-1][y+1].endsWith("Koenig")) {
        a++;
      } // end of if
    } // end of if
    if (x-1>-1&&y-1>-1) {
      if (ZDFeld[x-1][y-1]!=null&&ZDFeld[x-1][y-1].endsWith("Koenig")) {
        a++;
      } // end of if
    } // end of if
    return a<=1;
  }
  
  public int searchFigurxplusynull(int x, int y) {
    String piece = ZDFeld[x][y];
    int ausgabe = 1;
    if (x+1<8) {
      if (ZDFeld[x+1][y]!=null) {
        if (ZDFeld[x+1][y].startsWith(figurFarbe(piece))) {
          ausgabe = 0;
        } // end of if
        else {
          ausgabe = 1;
        } // end of if-else
      } // end of if
    } // end of if
    else {
      ausgabe = 0;
    } // end of if-else
    return ausgabe;
  }
  
  public int searchFigurxplusypluskoenig(int x, int y) {
    String piece = ZDFeld[x][y];
    int ausgabe = 1;
    if (x+1<8&&y+1<8) {
      if (ZDFeld[x+1][y+1]!=null) {
        if (ZDFeld[x+1][y+1].startsWith(figurFarbe(piece))) {
          ausgabe = 0;
        } // end of if
        else {
          ausgabe = 1;
        } // end of if-else
      } // end of if
    } // end of if
    else {
      ausgabe = 0;
    } // end of if-else
    return ausgabe;
  }
  
  public int searchFigurxplusyminuskoenig(int x, int y) {
    String piece = ZDFeld[x][y];
    int ausgabe = 1;
    if (x+1<8&&y-1>-1) {
      if (ZDFeld[x+1][y-1]!=null) {
        if (ZDFeld[x+1][y-1].startsWith(figurFarbe(piece))) {
          ausgabe = 0;
        } // end of if
        else {
          ausgabe = 1;
        } // end of if-else
      } // end of if
    } // end of if
    else {
      ausgabe = 0;
    } // end of if-else
    return ausgabe;
  }
  
  public int searchFigurxminusynull(int x, int y) {
    String piece = ZDFeld[x][y];
    int ausgabe = 1;
    if (x-1>-1) {
      if (ZDFeld[x-1][y]!=null) {
        if (ZDFeld[x-1][y].startsWith(figurFarbe(piece))) {
          ausgabe = 0;
        } // end of if
        else {
          ausgabe = 1;
        } // end of if-else
      } // end of if
    } // end of if
    else {
      ausgabe = 0;
    } // end of if-else
    return ausgabe;
  }
  
  public int searchFigurxminusypluskoenig(int x, int y) {
    String piece = ZDFeld[x][y];
    int ausgabe = 1;
    if (x-1>-1&&y+1<8) {
      if (ZDFeld[x-1][y+1]!=null) {
        if (ZDFeld[x-1][y+1].startsWith(figurFarbe(piece))) {
          ausgabe = 0;
        } // end of if
        else {
          ausgabe = 1;
        } // end of if-else
      } // end of if
    } // end of if
    else {
      ausgabe = 0;
    } // end of if-else
    return ausgabe;
  }
  
  public int searchFigurxminusyminuskoenig(int x, int y) {
    String piece = ZDFeld[x][y];
    int ausgabe = 1;
    if (x-1>-1&&y-1>-1) {
      if (ZDFeld[x-1][y-1]!=null) {
        if (ZDFeld[x-1][y-1].startsWith(figurFarbe(piece))) {
          ausgabe = 0;
        } // end of if
        else {
          ausgabe = 1;
        } // end of if-else
      } // end of if
    } // end of if
    else {
      ausgabe = 0;
    } // end of if-else
    return ausgabe;
  }
  
  public int searchFigurxnullyplus(int x, int y) {
    String piece = ZDFeld[x][y];
    int ausgabe = 1;
    if (y+1<8) {
      if (ZDFeld[x][y+1]!=null) {
        if (ZDFeld[x][y+1].startsWith(figurFarbe(piece))) {
          ausgabe = 0;
        } // end of if
        else {
          ausgabe = 1;
        } // end of if-else
      } // end of if
    } // end of if
    else {
      ausgabe = 0;
    } // end of if-else
    return ausgabe;
  }
  
  public int searchFigurxnullyminus(int x, int y) {
    String piece = ZDFeld[x][y];
    int ausgabe = 1;
    if (y-1>-1) {
      if (ZDFeld[x][y-1]!=null) {
        if (ZDFeld[x][y-1].startsWith(figurFarbe(piece))) {
          ausgabe = 0;
        } // end of if
      } // end of if
    } // end of if
    else {
      ausgabe = 0;
    } // end of if-else
    return ausgabe;
  }
  
  //Ende K�nig
  
  //Anfang L�ufer/Dame
  
  public int searchFigurxplusyplus(int x, int y) {
    String piece = ZDFeld[x][y];
    int a = 0;
    for (int i = 1; y+i<8&&x+i<8; i++) {
      a = i;
      if (ZDFeld[x+i][y+i]!=null) {
        if (ZDFeld[x+i][y+i].startsWith(figurFarbe(piece))) {
          a--;
        } // end of if
        i=8;
      } // end of if
    } // end of for
    return a;
  }
  
  public int searchFigurxplusyminus(int x, int y) {
    String piece = ZDFeld[x][y];
    int a = 0;
    for (int i = 1; y-i>-1&&x+i<8; i++) {
      a = i;
      if (ZDFeld[x+i][y-i]!=null) {
        if (ZDFeld[x+i][y-i].startsWith(figurFarbe(piece))) {
          a--;
        } // end of if
        i=8;
      } // end of if
    } // end of for
    return a;
  }
  
  public int searchFigurxminusyplus(int x, int y) {
    String piece = ZDFeld[x][y];
    int a = 0;
    for (int i = 1; y+i<8&&x-i>-1; i++) {
      a = i;
      if (ZDFeld[x-i][y+i]!=null) {
        if (ZDFeld[x-i][y+i].startsWith(figurFarbe(piece))) {
          a--;
        } // end of if
        i=8;
      } // end of if
    } // end of for
    return a;
  }
  
  public int searchFigurxminusyminus(int x, int y) {
    String piece = ZDFeld[x][y];
    int a = 0;
    for (int i = 1; y-i>-1&&x-i>-1; i++) {
      a = i;
      if (ZDFeld[x-i][y-i]!=null) {
        if (ZDFeld[x-i][y-i].startsWith(figurFarbe(piece))) {
          a--;
        } // end of if
        i=8;
      } // end of if
    } // end of for
    return a;
  }
  
  //Ende L�ufer/Dame
  
  //Anfang Pferd
  
  public int searchFigurpluszweipluseins(int x, int y) {
    String piece = ZDFeld[x][y];
    int ausgabe = 2;
    if (x+2<8&&y+1<8) {
      if (ZDFeld[x+2][y+1]!=null) {
        if (ZDFeld[x+2][y+1].startsWith(figurFarbe(piece))) {
          ausgabe = 0;
        } // end of if
        else {
          ausgabe = 1;
        } // end of if-else
      } // end of if
      else {
        ausgabe = 1;
      } // end of if-else
    } // end of if
    return ausgabe;
  }
  
  public int searchFigurpluszweiminuseins(int x, int y) {
    String piece = ZDFeld[x][y];
    int ausgabe = 2;
    if (x+2<8&&y-1>-1) {
      if (ZDFeld[x+2][y-1]!=null) {
        if (ZDFeld[x+2][y-1].startsWith(figurFarbe(piece))) {
          ausgabe = 0;
        } // end of if
        else {
          ausgabe = 1;
        } // end of if-else
      } // end of if
      else {
        ausgabe = 1;
      } // end of if-else
    } // end of if
    return ausgabe;
  }
  
  public int searchFigurminuszweipluseins(int x, int y) {
    String piece = ZDFeld[x][y];
    int ausgabe = 2;
    if (x-2>-1&&y+1<8) {
      if (ZDFeld[x-2][y+1]!=null) {
        if (ZDFeld[x-2][y+1].startsWith(figurFarbe(piece))) {
          ausgabe = 0;
        } // end of if
        else {
          ausgabe = 1;
        } // end of if-else
      } // end of if
      else {
        ausgabe = 1;
      } // end of if-else
    } // end of if
    return ausgabe;
  }
  
  public int searchFigurminuszweiminuseins(int x, int y) {
    String piece = ZDFeld[x][y];
    int ausgabe = 2;
    if (x-2>-1&&y-1>-1) {
      if (ZDFeld[x-2][y-1]!=null) {
        if (ZDFeld[x-2][y-1].startsWith(figurFarbe(piece))) {
          ausgabe = 0;
        } // end of if
        else {
          ausgabe = 1;
        } // end of if-else
      } // end of if
      else {
        ausgabe = 1;
      } // end of if-else
    } // end of if
    return ausgabe;
  }
  
  public int searchFigurpluseinspluszwei(int x, int y) {
    String piece = ZDFeld[x][y];
    int ausgabe = 2;
    if (x+1<8&&y+2<8) {
      if (ZDFeld[x+1][y+2]!=null) {
        if (ZDFeld[x+1][y+2].startsWith(figurFarbe(piece))) {
          ausgabe = 0;
        } // end of if
        else {
          ausgabe = 1;
        } // end of if-else
      } // end of if
      else {
        ausgabe = 1;
      } // end of if-else
    } // end of if
    return ausgabe;
  }
  
  public int searchFigurpluseinsminuszwei(int x, int y) {
    String piece = ZDFeld[x][y];
    int ausgabe = 2;
    if (x+1<8&&y-2>-1) {
      if (ZDFeld[x+1][y-2]!=null) {
        if (ZDFeld[x+1][y-2].startsWith(figurFarbe(piece))) {
          ausgabe = 0;
        } // end of if
        else {
          ausgabe = 1;
        } // end of if-else
      } // end of if
      else {
        ausgabe = 1;
      } // end of if-else
    } // end of if
    return ausgabe;
  }
  
  public int searchFigurminuseinspluszwei(int x, int y) {
    String piece = ZDFeld[x][y];
    int ausgabe = 2;
    if (x-1>-1&&y+2<8) {
      if (ZDFeld[x-1][y+2]!=null) {
        if (ZDFeld[x-1][y+2].startsWith(figurFarbe(piece))) {
          ausgabe = 0;
        } // end of if
        else {
          ausgabe = 1;
        } // end of if-else
      } // end of if
      else {
        ausgabe = 1;
      } // end of if-else
    } // end of if
    return ausgabe;
  }
  
  public int searchFigurminuseinsminuszwei(int x, int y) {
    String piece = ZDFeld[x][y];
    int ausgabe = 2;
    if (x-1>-1&&y-2>-1) {
      if (ZDFeld[x-1][y-2]!=null) {
        if (ZDFeld[x-1][y-2].startsWith(figurFarbe(piece))) {
          ausgabe = 0;
        } // end of if
        else {
          ausgabe = 1;
        } // end of if-else
      } // end of if
      else {
        ausgabe = 1;
      } // end of if-else
    } // end of if
    return ausgabe;
  }
  
  //Ende Pferd
  
  //Ende der Suchfunktionen
  
  public String figurFarbe (String piece) {
    String wert = ""; 
    if (piece.startsWith("w")) {
      wert = "w";
    } // end of if
    else {
      if (piece.startsWith("s")) {
        wert = "s";
      } // end of if
      else {
        wert = "0";
      } // end of if-else
    } // end of if-else
    return wert;
  }
  
  public int searchX(String[][] feld, String piece) {
    int x = 0; int y = 0;                // Variablen f�r die Suchposition
    for (int i = 0; i < 8; i++) {        // Ablauf der Waagerechten
      for (int j = 0; j < 8; j++) {      // Ablauf der Senkrechten
        if (feld[i][j].equals(piece)) {  // Wenn Figur gefunden ist
          x = i;                        // Beschreiben der Variablen
          y = j; 
          i = 8;                        // Abbruchfunktion
          j = 8; 
          
        } // end of if
      } // end of for
    } // end of for
    return x;
  } 
  
  public int searchY(String[][] feld, String piece) {
    int x = 0; int y = 0;                // Variablen f�r die Suchposition
    for (int i = 0; i < 8; i++) {        // Ablauf der Waagerechten
      for (int j = 0; j < 8; j++) {      // Ablauf der Senkrechten
        if (feld[i][j].equals(piece)) {  // Wenn Figur gefunden ist
          x = i;                        // Beschreiben der Variablen
          y = j; 
          i = 8;                        // Abbruchfunktion
          j = 8; 
          
        } // end of if
      } // end of for
    } // end of for
    return y;
  }
  
  //Ende SchachbrettMethoden
  
  public boolean bauernsearchs() {
    int a = 0;
    for (int i = 0; i<8; i++) {
      if (ZDFeld[i][0]!=null) {
        if (ZDFeld[i][0].startsWith("sBauer")) {
          a++;
        } // end of if
      } // end of if
    } // end of for
    return a>0;
  }
  
  public boolean bauernsearchw() {
    int a = 0;
    for (int i = 0; i<8; i++) {
      if (ZDFeld[i][7]!=null) {
        if (ZDFeld[i][7].startsWith("wBauer")) {
          a++;
        } // end of if
      } // end of if      
    } // end of for
    return a>0;
  }
  
  public void enables() {
    sTurm1.setEnabled(true);
    sTurm2.setEnabled(true);
    sPferd1.setEnabled(true);
    sPferd2.setEnabled(true);
    sLaeufer1.setEnabled(true);
    sLaeufer2.setEnabled(true);
    sDame.setEnabled(true);
  }
  
  public void enablew() {
    wTurm1.setEnabled(true);
    wTurm2.setEnabled(true);
    wPferd1.setEnabled(true);
    wPferd2.setEnabled(true);
    wLaeufer.setEnabled(true);
    wLaeufer2.setEnabled(true);
    wDame.setEnabled(true);
  }
  
  public void disables() {
    for (int i = 0; i < this.getContentPane().getComponentCount(); i++) {
      if (this.getContentPane().getComponent(i) instanceof JButtonBesser && this.getContentPane().getComponent(i).getX() > 210 && this.getContentPane().getComponent(i).getName().startsWith("w") && !this.getContentPane().getComponent(i).getName().equals("sKoenig")) {
        this.getContentPane().getComponent(i).setEnabled(false);
      } // end of if
    } // end of for
  }
  
  public void disablew() {
    for (int i = 0; i < this.getContentPane().getComponentCount(); i++) {
      if (this.getContentPane().getComponent(i) instanceof JButtonBesser && this.getContentPane().getComponent(i).getX() > 580 && this.getContentPane().getComponent(i).getName().startsWith("s") && !this.getContentPane().getComponent(i).getName().equals("sKoenig")) {
        this.getContentPane().getComponent(i).setEnabled(false);
      } // end of if
    } // end of for
  }
  
  public int tausch(JButtonBesser knopf, String farbe) {
    int xhelp = knopf.getX();
    int yhelp = knopf.getY();
    int safe = 0;
    if (knopf.getX()<216||knopf.getX()>580) {                  
      if (farbe.equals("s")) {
        for (int i = 0; i<8; i++) {
          if (ZDFeld[i][0]!=null) {
            if (ZDFeld[i][0].startsWith("sBauer")) {
              for (int h = 1; h<9; h++) {
                if (ZDFeld[i][7].equals("sBauer" + h)) {
                  switch (h) {
                    case 1 :    
                    knopf.setBounds(sBauer1.getX(),sBauer1.getY(),knopf.getWidth(),knopf.getHeight());
                    sBauer1.setBounds(xhelp,yhelp,sBauer1.getWidth(),sBauer1.getHeight());
                    sBauer1.setEnabled(false);
                    safe = i;
                    break;
                    case 2 : 
                    knopf.setBounds(sBauer2.getX(),sBauer2.getY(),knopf.getWidth(),knopf.getHeight());
                    sBauer2.setBounds(xhelp,yhelp,sBauer2.getWidth(),sBauer2.getHeight());
                    sBauer2.setEnabled(false);
                    safe = i;
                    break;
                    case 3 : 
                    knopf.setBounds(sBauer3.getX(),sBauer3.getY(),knopf.getWidth(),knopf.getHeight());
                    sBauer3.setBounds(xhelp,yhelp,sBauer3.getWidth(),sBauer3.getHeight());
                    sBauer3.setEnabled(false);
                    safe = i;
                    break;
                    case 4 : 
                    knopf.setBounds(sBauer4.getX(),sBauer4.getY(),knopf.getWidth(),knopf.getHeight());
                    sBauer4.setBounds(xhelp,yhelp,sBauer4.getWidth(),sBauer4.getHeight());
                    sBauer4.setEnabled(false);
                    safe = i;
                    break;
                    case 5 : 
                    knopf.setBounds(sBauer5.getX(),sBauer5.getY(),knopf.getWidth(),knopf.getHeight());
                    sBauer5.setBounds(xhelp,yhelp,sBauer5.getWidth(),sBauer5.getHeight());
                    sBauer5.setEnabled(false);
                    safe = i;
                    break;
                    case 6 : 
                    knopf.setBounds(sBauer6.getX(),sBauer6.getY(),knopf.getWidth(),knopf.getHeight());
                    sBauer6.setBounds(xhelp,yhelp,sBauer6.getWidth(),sBauer6.getHeight());
                    sBauer6.setEnabled(false);
                    safe = i;
                    break;
                    case 7 : 
                    knopf.setBounds(sBauer7.getX(),sBauer7.getY(),knopf.getWidth(),knopf.getHeight());
                    sBauer7.setBounds(xhelp,yhelp,sBauer7.getWidth(),sBauer7.getHeight());
                    sBauer7.setEnabled(false);
                    safe = i;
                    break;
                    case 8 : 
                    knopf.setBounds(sBauer8.getX(),sBauer8.getY(),knopf.getWidth(),knopf.getHeight());
                    sBauer8.setBounds(xhelp,yhelp,sBauer8.getWidth(),sBauer8.getHeight());
                    sBauer8.setEnabled(false);
                    safe = i;
                    break;
                    default: 
                    
                  } // end of switch 
                  h=9;
                  i=9;
                } // end of if
              } // end of for    
            } // end of if
          } // end of if
        } // end of for
      } // end of if
      else {
        for (int i = 0; i<8; i++) {
          if (ZDFeld[i][7]!=null) {
            if (ZDFeld[i][7].startsWith("wBauer")) {
              for (int h = 1; h<9; h++) {
                if (ZDFeld[i][7].equals("wBauer" + h)) {
                  switch (h) {
                    case 1 : 
                    xhelp = knopf.getX();
                    yhelp = knopf.getY();
                    knopf.setBounds(wBauer1.getX(),wBauer1.getY(),knopf.getWidth(),knopf.getHeight());
                    wBauer1.setBounds(xhelp,yhelp,wBauer1.getWidth(),wBauer1.getHeight());
                    wBauer1.setEnabled(false);
                    safe = i;
                    break;
                    case 2 : 
                    xhelp = knopf.getX();
                    yhelp = knopf.getY();
                    knopf.setBounds(wBauer2.getX(),wBauer2.getY(),knopf.getWidth(),knopf.getHeight());
                    wBauer2.setBounds(xhelp,yhelp,wBauer2.getWidth(),wBauer2.getHeight());
                    wBauer2.setEnabled(false);
                    safe = i;
                    break;
                    case 3 : 
                    xhelp = knopf.getX();
                    yhelp = knopf.getY();
                    knopf.setBounds(wBauer3.getX(),wBauer3.getY(),knopf.getWidth(),knopf.getHeight());
                    wBauer3.setBounds(xhelp,yhelp,wBauer3.getWidth(),wBauer3.getHeight());
                    wBauer3.setEnabled(false);
                    safe = i;
                    break;
                    case 4 : 
                    xhelp = knopf.getX();
                    yhelp = knopf.getY();
                    knopf.setBounds(wBauer4.getX(),wBauer4.getY(),knopf.getWidth(),knopf.getHeight());
                    wBauer4.setBounds(xhelp,yhelp,wBauer4.getWidth(),wBauer4.getHeight());
                    wBauer4.setEnabled(false);
                    safe = i;
                    break;
                    case 5 : 
                    xhelp = knopf.getX();
                    yhelp = knopf.getY();
                    knopf.setBounds(wBauer5.getX(),wBauer5.getY(),knopf.getWidth(),knopf.getHeight());
                    wBauer5.setBounds(xhelp,yhelp,wBauer5.getWidth(),wBauer5.getHeight());
                    wBauer5.setEnabled(false);
                    safe = i;
                    break;
                    case 6 : 
                    xhelp = knopf.getX();
                    yhelp = knopf.getY();
                    knopf.setBounds(wBauer6.getX(),wBauer6.getY(),knopf.getWidth(),knopf.getHeight());
                    wBauer6.setBounds(xhelp,yhelp,wBauer6.getWidth(),wBauer6.getHeight());
                    wBauer6.setEnabled(false);
                    safe = i;
                    break;
                    case 7 : 
                    xhelp = knopf.getX();
                    yhelp = knopf.getY();
                    knopf.setBounds(wBauer7.getX(),wBauer7.getY(),knopf.getWidth(),knopf.getHeight());
                    wBauer7.setBounds(xhelp,yhelp,wBauer7.getWidth(),wBauer7.getHeight());
                    wBauer7.setEnabled(false);
                    safe = i;
                    break;
                    case 8 : 
                    xhelp = knopf.getX();
                    yhelp = knopf.getY();
                    knopf.setBounds(wBauer8.getX(),wBauer8.getY(),knopf.getWidth(),knopf.getHeight());
                    wBauer8.setBounds(xhelp,yhelp,wBauer8.getWidth(),wBauer8.getHeight());
                    wBauer8.setEnabled(false);
                    safe = i;
                    break;
                    default: 
                    
                  } // end of switch
                  h=9;
                  i=9;
                } // end of if
              } // end of for
            } // end of if
          } // end of if
        } // end of for
      } // end of if-else
    } // end of if
    knopf.setBounds(knopf.getX()+5000,knopf.getY(),knopf.getWidth(),knopf.getHeight());  
    knopf.setBounds(knopf.getX()-5000,knopf.getY(),knopf.getWidth(),knopf.getHeight());
    this.disables();
    this.disablew();
    return safe;
  }
  
  // Ende Methoden
} // end of class Schachbrett
