/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author SSDesth
 */
@XmlType()
public class Espectro {

    private final double velocidadDeLaLuz = 299792458.0;
    private final double constantePlanck = 6.626070040 * Math.pow(10, -34);//J*s
    private double energiaDelFoton;
    private double frecuencia;
    private double longitudDeOnda;

    public Espectro() {
    }

    public Espectro(double eEnergiaDelFoton, double eLongitudDeOnda) {
        this.energiaDelFoton = eEnergiaDelFoton;
        this.longitudDeOnda = eLongitudDeOnda;
        this.frecuencia = Frecuencia();
        this.energiaDelFoton = EnergiaFoton();
    }

    public double getEnergiaDelFoton() {
        return energiaDelFoton;
    }

    public void setEnergiaDelFoton(double energiaDelFoton) {
        this.energiaDelFoton = energiaDelFoton;
    }

    public double getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(double frecuencia) {
        this.frecuencia = frecuencia;
    }

    public double getLongitudDeOnda() {
        return longitudDeOnda;
    }

    public void setLongitudDeOnda(double longitudDeOnda) {
        this.longitudDeOnda = longitudDeOnda;
    }

    public double Frecuencia() {
        return velocidadDeLaLuz / longitudDeOnda;
    }

    public double EnergiaFoton() {
        return constantePlanck * frecuencia;
    }

}
