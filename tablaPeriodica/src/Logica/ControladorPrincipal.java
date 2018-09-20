/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.TablaPeriodica;
import UI.frmTablaPeriodica;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author SSDesth
 */
public class ControladorPrincipal {
    private TablaPeriodica miTabla;
    private frmTablaPeriodica miventana;

    public ControladorPrincipal() {}

    public TablaPeriodica getMiTabla() {
        return miTabla;
    }

    public void setMiTabla(TablaPeriodica miTabla) {
        this.miTabla = miTabla;
    }

    public frmTablaPeriodica getMiventana() {
        return miventana;
    }

    public void setMiventana(frmTablaPeriodica miventana) {
        this.miventana = miventana;
    }
    
    public void EjecutarVentanaTablaPeriodica(){
        miventana = new frmTablaPeriodica();
        miventana.GeneradorDeBotones();
       // miventana.CargarImagenes();
        miventana.setVisible(true);
        
    }
    
    /**
     * Este metodo Busca un archivo XML en el URL dado y carga la tabla periodica
     * @param URL 
     */
    public void leerXML(String URL){
    try { 
        //--------Crea el contexto JAXB--------//
        JAXBContext ctx = JAXBContext.newInstance(TablaPeriodica.class);
        //--------Crea la clase que permite leer archivo XML
        Unmarshaller ums = ctx.createUnmarshaller();
        
        miTabla = (TablaPeriodica)ums.unmarshal
            (new File(URL));

    } catch (JAXBException ex) {
        System.out.println(ex.toString());
    }

}
    
    
    
    
    
}
