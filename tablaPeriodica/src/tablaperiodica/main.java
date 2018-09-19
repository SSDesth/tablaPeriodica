/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablaperiodica;

import UI.frmTablaPeriodica;

/**
 *
 * @author SSDesth
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmTablaPeriodica ventana = new frmTablaPeriodica();
        ventana.GeneradorDeBotones();
        ventana.setVisible(true);
        
    }
    
}
