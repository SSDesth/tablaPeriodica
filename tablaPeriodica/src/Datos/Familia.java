/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.List;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author SSDesth
 */
@XmlType()
public class Familia {
    private String nombre;
    private String caracteristicas;
    private List<TipoFamilia> subFamilias;

    public Familia() {
    }

    public Familia(String nombre, String caracteristicas, List<TipoFamilia> subFamilias) {
        this.nombre = nombre;
        this.caracteristicas = caracteristicas;
        this.subFamilias = subFamilias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public List<TipoFamilia> getSubFamilias() {
        return subFamilias;
    }

    public void setSubFamilias(List<TipoFamilia> subFamilias) {
        this.subFamilias = subFamilias;
    }
    
    
    
}
