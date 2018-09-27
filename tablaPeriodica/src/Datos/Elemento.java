package Datos;

import java.util.List;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Carlos Andres Montero
 * @author Justin Bogantes Rodriguez
 * @author Manuel Alejandro Arias Medina
 * @version 18/09/2018
 */
@XmlType()
public class Elemento {
    //---------- Variables de la clase Elemento----------//

    private int numeroAtomico;
    private String simboloAtomico;
    private String nombre;
    private double PesoAtomico;
    private String familia;//String
    private double temperaturaMaxSolido;
    private double temperaturaMaxLiquido;
    private int cantidadIsotopos;

    //----------Contructor(es)---------//
    /**
     * Contructor default de la clase Elemento
     */
    public Elemento() {
    }

    //----------Setters y Getters---------//
    /**
     * Get de la variable Nnumero Atomico
     *
     * @return numeroAtomico
     */
    public int getNumeroAtomico() {
        return numeroAtomico;
    }

    /**
     * Set de la variable Numero Atomico
     *
     * @param numeroAtomico: int
     */
    public void setNumeroAtomico(int numeroAtomico) {
        this.numeroAtomico = numeroAtomico;
    }

    /**
     * Get de la variable Simbolo Atomico
     *
     * @return simboloAtomico
     */
    public String getSimboloAtomico() {
        return simboloAtomico;
    }

    /**
     * set de la variable Simbolo Atomico
     *
     * @param simboloAtomico: String
     */
    public void setSimboloAtomico(String simboloAtomico) {
        this.simboloAtomico = simboloAtomico;
    }

    /**
     * Get de la variable Nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Set de la variable Nombre
     * @param nombre: String 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Get de la variable Peso Atomico
     *
     * @return PesoAtomico
     */
    public double getPesoAtomico() {
        return PesoAtomico;
    }

    /**
     * Set de la variable Peso Atomico
     *
     * @param PesoAtomico: double
     */
    public void setPesoAtomico(double PesoAtomico) {
        this.PesoAtomico = PesoAtomico;
    }

    /**
     * Get de la variable Familia
     *
     * @return familia
     */
    public String getFamilia() {
        return familia;
    }

    /**
     * Set de la variable Familia
     *
     * @param familia: String
     */
    public void setFamilia(String familia) {
        this.familia = familia;
    }

    /**
     * Get de la variable Temperatura Maxima Solido
     *
     * @return temperaturaMaxSolido
     */
    public double getTemperaturaMaxSolido() {
        return temperaturaMaxSolido;
    }

    /**
     * Set de la Variable Temperatura Maxima Solido
     *
     * @param temperaturaMaxSolido: double
     */
    public void setTemperaturaMaxSolido(double temperaturaMaxSolido) {
        this.temperaturaMaxSolido = temperaturaMaxSolido;
    }

    /**
     * Get de la variable Temperatura Maxima Liquido
     *
     * @return temperaturaMaxLiquido
     */
    public double getTemperaturaMaxLiquido() {
        return temperaturaMaxLiquido;
    }

    /**
     * Set de la variable Temperatura Maxima Liquido
     *
     * @param temperaturaMaxLiquido: double
     */
    public void setTemperaturaMaxLiquido(double temperaturaMaxLiquido) {
        this.temperaturaMaxLiquido = temperaturaMaxLiquido;
    }

    /**
     * Get de la variable Cantidad de Isotopos
     *
     * @return cabtidadIsotopos
     */
    public int getCantidadIsotopos() {
        return cantidadIsotopos;
    }

    /**
     * Set de la variable Cantidad de Isotopos
     *
     * @param cantidadIsotopos: int
     */
    public void setCantidadIsotopos(int cantidadIsotopos) {
        this.cantidadIsotopos = cantidadIsotopos;
    }

    /**
     * Metodo Para que debuelva en que estado se encuentra un elemento segun la
     * temperatura que recibe.
     *
     * @param eTemperatura: double
     * @return "Desconocido/Solido/Liquido/gas"
     */
    public String EstadoPorTemperatura(double eTemperatura) {
        if (temperaturaMaxSolido == 0.0) {
            return "Desconocido";
        }
        if (eTemperatura <= temperaturaMaxSolido) {
            return "Solido";
        } else {
            if (eTemperatura <= temperaturaMaxLiquido) {
                return "Liquido";
            } else {
                return "Gas";
            }
        }

    }

    /**
     * toString Sobre escrito
     *
     * @return toString
     */
    @Override
    public String toString() {
        return "Numero Atomico: " + numeroAtomico
                + "\nSimbolo Atomico: " + simboloAtomico
                + "\nnombre: " + nombre
                + "\nPeso Atomico:" + PesoAtomico
                + "\nfamilia: " + familia
                + "\ntemperatura Maxima Solido: " + temperaturaMaxSolido
                + "\ntemperatura Maxima Liquido: " + temperaturaMaxLiquido
                + "\nCantidad de Isotopos: " + cantidadIsotopos;
    }

}
