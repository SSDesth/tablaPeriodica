package Datos;

import javax.xml.bind.annotation.XmlType;

/**
 * @author Carlos Andres Montero
 * @author Justin Bogantes Rodriguez
 * @author Manuel Alejandro Arias Medina
 * @version 18/09/2018
 */
@XmlType()
public class Familia {

    //---------- Variables de la clase Familia----------//
    private String nombre;
    private String caracteristicas;

    //----------Contructor(es)---------//
    /**
     * Contructor default de la clase Familia
     */
    public Familia() {
    }

    /**
     * Contructor sobrecargado de la clase Familia
     *
     * @param nombre: String
     * @param caracteristicas: String
     */
    public Familia(String nombre, String caracteristicas) {
        this.nombre = nombre;
        this.caracteristicas = caracteristicas;

    }

    //----------Setters y Getters---------//
    /**
     * Get de la variable Nombre
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set de la variable Nombre
     *
     * @param nombre: String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Get de la variable Caracteristicas
     *
     * @return caracteristicas
     */
    public String getCaracteristicas() {
        return caracteristicas;
    }

    /**
     * Set de la variable Caracteristicas
     *
     * @param caracteristicas: String
     */
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

}
