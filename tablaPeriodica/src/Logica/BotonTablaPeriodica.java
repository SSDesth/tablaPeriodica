package Logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import tablaperiodica.main;

/**
 * @author Carlos Andres Montero
 * @author Justin Bogantes Rodriguez
 * @author Manuel Alejandro Arias Medina
 * @version 18/09/2018
 */
public class BotonTablaPeriodica extends JButton implements ActionListener {

    //---------- Variables de la clase TablaPeriodica----------//
    private int ID;
    
    //----------Contructor(es)---------//
    /**
     * Contructor de la clase BotonTablaPeriodica
     *
     * @param posX:int
     * @param posY:int
     * @param ancho:int
     * @param alto:int
     * @param eID :int
     */
    public BotonTablaPeriodica(int posX, int posY, int ancho, int alto, int eID) {
        super.setBounds(posX, posY, ancho, alto);
        this.ID = eID;
        addActionListener(this);
        setText("" + ID);
        setFont(new java.awt.Font("Times New Roman", 3, 7));
        setOpaque(false);

    }
    

    /**
     * este metodo desplegara el elemento utilisando el Controlador Principal
     *
     * @param e: ActionEcent
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        main.miControlador.mostrarElemento(ID);
    }

}
