package Logica;

import Datos.Elemento;
import Datos.TablaPeriodica;
import UI.frmTablaPeriodica;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * @author Carlos Andres Montero
 * @author Justin Bogantes Rodriguez
 * @author Manuel Alejandro Arias Medina
 * @version 18/09/2018
 */
public class ControladorPrincipal {

    //---------- Variables de la clase ControladorPrincipal----------//
    private TablaPeriodica miTabla = new TablaPeriodica();
    private frmTablaPeriodica miVentana;

    //----------Contructor(es)---------//
    /**
     * Constructor default de la clase ControladorPrincipal
     */
    public ControladorPrincipal() {
    }

    //----------Setters y Getters---------//
    /**
     * Get de la Variable miTabla
     *
     * @return miTabla
     */
    public TablaPeriodica getMiTabla() {
        return miTabla;
    }

    /**
     * Set de la variale miTabla
     *
     * @param miTabla: TablaPeriodica
     */
    public void setMiTabla(TablaPeriodica miTabla) {
        this.miTabla = miTabla;
    }

    /**
     * Get de la Variable miVentana
     *
     * @return miVentana
     */
    public frmTablaPeriodica getMiventana() {
        return miVentana;
    }

    /**
     * Set de la variable miVentana
     *
     * @param miventana: frmTablaPeriodica
     */
    public void setMiventana(frmTablaPeriodica miventana) {
        this.miVentana = miventana;
    }

    /**
     * Metodo que varga y despliega el frmTablaPeriodica
     */
    public void EjecutarVentanaTablaPeriodica() {
        miVentana = new frmTablaPeriodica();
        miVentana.Cargador();
        miVentana.setVisible(true);

    }

    /**
     * Este metodo Busca un archivo XML en el URL dado y carga la tabla
     * periodica
     *
     * @param URL: String
     */
    public void leerXML(String URL) {
        try {
            //--------Crea el contexto JAXB--------//
            JAXBContext ctx = JAXBContext.newInstance(TablaPeriodica.class);
            //--------Crea la clase que permite leer archivo XML
            Unmarshaller ums = ctx.createUnmarshaller();

            miTabla = (TablaPeriodica) ums.unmarshal(new File(URL)); //error

        } catch (JAXBException ex) {
            System.out.println(ex.toString());
        }

    }

    /**
     * Este metodo recibe de entrada el numero atomico y busca en miTabla el
     * Elemento que conicida con el dato de entrada y se comunica con el
     * frmTablaPeriodica enviandole el Elemento encontrado
     *
     * @param entradaNumeroAtomico: int
     */
    public void mostrarElemento(int entradaNumeroAtomico) {
        Elemento temporal;
        temporal = miTabla.MostrarElemento(entradaNumeroAtomico);
        miVentana.MostrarElemento(temporal);

    }

}
