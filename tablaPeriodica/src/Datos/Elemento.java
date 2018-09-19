/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.List;

/**
 *
 * @author SSDesth
 */
public class Elemento {
    private int numeroAtomico;
    private int simboloAtomico;
    private String nombre;
    private double PesoAtomico;
    private Espectro espectro;
    private Familia familia;
    private double temperaturaMaxSolido;
    private double temperaturaMaxLiquido;
    private double temperaturaMaxGas;
    private int cantidadIsotopos;
    private List<Isotopo> isotopos;
    private TipoFamilia subFamilia;

    public Elemento() {
    }

    public Elemento(int numeroAtomico, int simboloAtomico, String nombre, 
            double PesoAtomico, Espectro espectro, Familia familia, 
            double temperaturaMinSolido, double temperaturaMinLiquido, 
            double temperaturaMinGas, int cantidadIsotopos, 
            List<Isotopo> isotopos, TipoFamilia subFamilia) {
        this.numeroAtomico = numeroAtomico;
        this.simboloAtomico = simboloAtomico;
        this.nombre = nombre;
        this.PesoAtomico = PesoAtomico;
        this.espectro = espectro;
        this.familia = familia;
        this.temperaturaMaxSolido = temperaturaMinSolido;
        this.temperaturaMaxLiquido = temperaturaMinLiquido;
        this.temperaturaMaxGas = temperaturaMinGas;
        this.cantidadIsotopos = cantidadIsotopos;
        this.isotopos = isotopos;
        this.subFamilia = subFamilia;
    }

    public int getNumeroAtomico() {
        return numeroAtomico;
    }

    public void setNumeroAtomico(int numeroAtomico) {
        this.numeroAtomico = numeroAtomico;
    }

    public int getSimboloAtomico() {
        return simboloAtomico;
    }

    public void setSimboloAtomico(int simboloAtomico) {
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

    public Espectro getEspectro() {
        return espectro;
    }

    public void setEspectro(Espectro espectro) {
        this.espectro = espectro;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
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

    public double getTemperaturaMaxGas() {
        return temperaturaMaxGas;
    }

    public void setTemperaturaMaxGas(double temperaturaMaxGas) {
        this.temperaturaMaxGas = temperaturaMaxGas;
    }

    public int getCantidadIsotopos() {
        return cantidadIsotopos;
    }

    public void setCantidadIsotopos(int cantidadIsotopos) {
        this.cantidadIsotopos = cantidadIsotopos;
    }

    public List<Isotopo> getIsotopos() {
        return isotopos;
    }

    public void setIsotopos(List<Isotopo> isotopos) {
        this.isotopos = isotopos;
    }

    public TipoFamilia getSubFamilia() {
        return subFamilia;
    }

    public void setSubFamilia(TipoFamilia subFamilia) {
        this.subFamilia = subFamilia;
    }

     public String EstadoPorTemperatura(double eTemperatura){
        if(eTemperatura<=temperaturaMaxSolido)
            return "Solido";
        else{
            if(eTemperatura<=temperaturaMaxLiquido)
                return "Liquido";
            else{
                if(eTemperatura<=temperaturaMaxGas)
                return "Gas";
            }
        }
    
        return "Desconocido";
    }
   
   
    
            
            
            
}
