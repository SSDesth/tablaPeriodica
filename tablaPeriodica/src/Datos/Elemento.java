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
public class Elemento {
    private int numeroAtomico;
    private String simboloAtomico;
    private String nombre;
    private double PesoAtomico;
    private String familia;//String
    private double temperaturaMaxSolido;
    private double temperaturaMaxLiquido;
    private int cantidadIsotopos;

    public Elemento() {
    }


    public int getNumeroAtomico() {
        return numeroAtomico;
    }

    public void setNumeroAtomico(int numeroAtomico) {
        this.numeroAtomico = numeroAtomico;
    }

    public String getSimboloAtomico() {
        return simboloAtomico;
    }

    public void setSimboloAtomico(String simboloAtomico) {
        this.simboloAtomico = simboloAtomico;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPesoAtomico() {
        return PesoAtomico;
    }

    public void setPesoAtomico(double PesoAtomico) {
        this.PesoAtomico = PesoAtomico;
    }


    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    
    public double getTemperaturaMaxSolido() {
        return temperaturaMaxSolido;
    }

    public void setTemperaturaMaxSolido(double temperaturaMaxSolido) {
        this.temperaturaMaxSolido = temperaturaMaxSolido;
    }

    public double getTemperaturaMaxLiquido() {
        return temperaturaMaxLiquido;
    }

    public void setTemperaturaMaxLiquido(double temperaturaMaxLiquido) {
        this.temperaturaMaxLiquido = temperaturaMaxLiquido;
    }

    public int getCantidadIsotopos() {
        return cantidadIsotopos;
    }

    public void setCantidadIsotopos(int cantidadIsotopos) {
        this.cantidadIsotopos = cantidadIsotopos;
    }

    public String EstadoPorTemperatura(double eTemperatura){
        if(temperaturaMaxSolido==0.0)
            return "Desconocido";
        if(eTemperatura<=temperaturaMaxSolido)
            return "Solido";
        else{
            if(eTemperatura<=temperaturaMaxLiquido)
                return "Liquido";
            else{
                return "Gas";
            }
        }
 
    }

    @Override
    public String toString() {
        return "Elemento{" + "numeroAtomico=" + numeroAtomico + ", simboloAtomico=" + simboloAtomico + ", nombre=" + nombre + ", PesoAtomico=" + PesoAtomico + ", familia=" + familia + ", temperaturaMaxSolido=" + temperaturaMaxSolido + ", temperaturaMaxLiquido=" + temperaturaMaxLiquido + ", cantidadIsotopos=" + cantidadIsotopos + '}';
    }
   
}
