/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author SSDesth
 */
public class BotonTablaPeriodica extends JButton implements ActionListener{
    
    int ID;
    
    public BotonTablaPeriodica(int posX,int posY,int ancho,int alto,int eID){
        super.setBounds(posX, posY, ancho, alto);
        this.ID=eID;
        addActionListener(this);
        setText(" " + ID);
    }
    
    

    /**
     * este metodo desplegara el elemento
     * @param e es el que detecta cualquier accion soble el botton 
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"Hola soy el elemento "+ID);
    
    }
    
   
    
    
    
}