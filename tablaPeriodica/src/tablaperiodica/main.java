/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablaperiodica;

import Logica.ControladorPrincipal;
import UI.frmTablaPeriodica;

/**
 *
 * @author SSDesth
 */
public class main {

    /**
     * @param args the command line arguments
     */
    
    public static ControladorPrincipal miControlador ;
    
    public static void main(String[] args) {
        miControlador= new  ControladorPrincipal();
        miControlador.EjecutarVentanaTablaPeriodica();
    }
    
}
